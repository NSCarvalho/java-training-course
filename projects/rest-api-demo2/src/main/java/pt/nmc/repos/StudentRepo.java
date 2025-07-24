package pt.nmc.repos;

import pt.nmc.model.Student;

import java.util.Collections;
import java.util.Optional;

public interface StudentRepo {

    void save(Student student);

    Collections findAll();

    Optional<Student> findByFirstName(String firstName);

}
