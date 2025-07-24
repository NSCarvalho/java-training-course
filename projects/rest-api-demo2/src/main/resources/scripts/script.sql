-- 0001_create_core_tables.sql

-- Enable UUID generation extension (Supabase default)
CREATE EXTENSION IF NOT EXISTS "pgcrypto";

-- ─── Teachers ───────────────────────────────────────────────────────────────
CREATE TABLE IF NOT EXISTS teachers (
  id           UUID PRIMARY KEY DEFAULT gen_random_uuid(),
  first_name   TEXT NOT NULL,
  last_name    TEXT NOT NULL,
  email        TEXT UNIQUE NOT NULL,
  created_at   TIMESTAMPTZ NOT NULL DEFAULT now(),
  updated_at   TIMESTAMPTZ NOT NULL DEFAULT now()
);

-- Trigger to auto‑update updated_at
CREATE OR REPLACE FUNCTION touch_updated_at()
RETURNS TRIGGER AS $$
BEGIN
  NEW.updated_at = now();
  RETURN NEW;
END;
$$ LANGUAGE plpgsql;

CREATE TRIGGER trg_teachers_updated_at
BEFORE UPDATE ON teachers
FOR EACH ROW EXECUTE PROCEDURE touch_updated_at();


-- ─── Students ───────────────────────────────────────────────────────────────
CREATE TABLE IF NOT EXISTS students (
  id           UUID PRIMARY KEY DEFAULT gen_random_uuid(),
  first_name   TEXT NOT NULL,
  last_name    TEXT NOT NULL,
  email        TEXT UNIQUE NOT NULL,
  enrolled_on  DATE NOT NULL DEFAULT CURRENT_DATE,
  created_at   TIMESTAMPTZ NOT NULL DEFAULT now(),
  updated_at   TIMESTAMPTZ NOT NULL DEFAULT now()
);

CREATE TRIGGER trg_students_updated_at
BEFORE UPDATE ON students
FOR EACH ROW EXECUTE PROCEDURE touch_updated_at();


-- ─── Subjects ───────────────────────────────────────────────────────────────
CREATE TABLE IF NOT EXISTS subjects (
  id             UUID PRIMARY KEY DEFAULT gen_random_uuid(),
  name           TEXT NOT NULL UNIQUE,
  code           TEXT NOT NULL UNIQUE,    -- e.g. MATH101, ENG202
  teacher_id     UUID REFERENCES teachers(id) ON DELETE SET NULL,
  created_at     TIMESTAMPTZ NOT NULL DEFAULT now(),
  updated_at     TIMESTAMPTZ NOT NULL DEFAULT now()
);

CREATE TRIGGER trg_subjects_updated_at
BEFORE UPDATE ON subjects
FOR EACH ROW EXECUTE PROCEDURE touch_updated_at();


-- ─── Enrollments ────────────────────────────────────────────────────────────
-- join table for many‑to‑many between students and subjects
CREATE TABLE IF NOT EXISTS enrollments (
  student_id   UUID REFERENCES students(id) ON DELETE CASCADE,
  subject_id   UUID REFERENCES subjects(id) ON DELETE CASCADE,
  enrolled_at  TIMESTAMPTZ NOT NULL DEFAULT now(),
  PRIMARY KEY (student_id, subject_id)
);
