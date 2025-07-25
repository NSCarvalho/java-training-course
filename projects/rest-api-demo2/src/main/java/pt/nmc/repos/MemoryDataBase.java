package pt.nmc.repos;

import pt.nmc.model.Student;

import java.util.*;

public class MemoryDataBase implements StudentRepo {

    private final List<Student> studentList = new ArrayList<>(100);

    private static void setNewData(Student newStudent, Student oldStudent) {
        oldStudent.setId(newStudent.getId());
        oldStudent.setEmail(newStudent.getEmail());
        oldStudent.setFirstName(newStudent.getFirstName());
        oldStudent.setLastName(newStudent.getLastName());
    }

    public int save(Student student) {
        //
        studentList.add(student);
        return 1;
    }

    @Override
    public int update(Student newStudent) {
        int index = getStudentIndex(newStudent.getId());
        if (index != -1) {
            var oldStudent = studentList.get(index);
            setNewData(newStudent, oldStudent);
        }
        return 1;
    }

    @Override
    public int delete(UUID uuid) {
        int index = getStudentIndex(uuid);
        if (index != -1) {
            studentList.remove(index);
            return 1;
        }
        return 0;
    }

    private int getStudentIndex(UUID uuid) {
        int index = -1;

        for (var student :
                studentList) {
            index++;
            if (student.getId().equals(uuid)) {
                break;
            }
        }
        return index;
    }

    @Override
    public List findAll() {
        // Copy of the student list
        return Arrays
                .asList(studentList);
    }


    public List<Student> findByFirstName(String firstName) {

        var studentListTmp = new ArrayList();

        for (var student :
                studentList) {
            if (student
                    .getFirstName()
                    .toLowerCase()
                    .contains(firstName)) {
                studentListTmp.add(student);
            }
        }

        return studentListTmp;
    }

    @Override
    public Optional<Student> findById(UUID uuid) {
        var resultList = studentList
                .stream()
                .filter(student -> student.getId().equals(uuid))
                .toList();

        if (resultList.isEmpty()) {
            return Optional.empty();
        } else {
            return Optional.of(resultList.get(0));
        }
    }
}
