package pt.nmc.repos;

import pt.nmc.model.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class MemoryDataBase implements StudentRepo{

    private final List<Student> studentList = new ArrayList<>(100);

    public void save(Student student) {
        //
        studentList.add(student);
    }

    @Override
    public Collections findAll() {
        return (Collections) studentList;
    }


    public Optional<Student> findByFirstName(String firstName) {

        for (var student :
                studentList) {
            if (student.getFirstName()
                    .compareToIgnoreCase(firstName) == 0) {
                return Optional.of(student);
            }
        }
        return Optional.empty();
    }
}
