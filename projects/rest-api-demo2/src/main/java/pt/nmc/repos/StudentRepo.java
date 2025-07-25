package pt.nmc.repos;

import pt.nmc.model.Student;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface StudentRepo {

    int save(Student student);

    int update(Student student);

    int delete(UUID uuid);

    List<Student> findAll();

    List<Student> findByFirstName(String firstName);

    Optional<Student> findById(UUID uuid);


}
