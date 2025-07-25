package pt.nmc;

import pt.nmc.dictionary.Dictionary;
import pt.nmc.dictionary.HashMapDictionary;
import pt.nmc.dictionary.exceptions.WordNotFoundException;
import pt.nmc.model.Student;
import pt.nmc.repos.MemoryDataBase;
import pt.nmc.repos.Postresql;
import pt.nmc.repos.StudentRepo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

/**
 * Hello world!
 */
public class App {
    private static final String APPLE = "APPLE";
    private static final String APPLE_IS_A_FRUIT = "Apple is a fruit";

    Dictionary<String, String> stringDictionary;

    public App(Dictionary<String, String> stringDictionary) {
        this.stringDictionary = stringDictionary;
    }

    public String getValue(String keyToReturn) throws WordNotFoundException {
        stringDictionary.add(APPLE, APPLE_IS_A_FRUIT);

       return stringDictionary.get(keyToReturn);
    }

    public static void main(String[] args) {

        int rowCount;
        StudentRepo postresql = new Postresql();

        /* #################### Save Student #################### */
        var newStudent = Student
                .builder()
                .firstName("Pedro")
                .lastName("Santos")
                .email("s@s.com")
                .build();

        System.out.println("Save new student with name " + newStudent.getFirstName());
        rowCount =  postresql
                .save(newStudent);
        if(rowCount>0){
            System.out.println("Student was saved");
        }

        /* #################### Find All #################### */
        System.out.println("List of students");
        var studentList =  postresql
                .findAll();
        studentList.forEach(student -> print(student));

        /* #################### Delete by Id #################### */
        if(!studentList.isEmpty()){
            var firstStudent = studentList.get(0);
            System.out.println("Delete student with id " + firstStudent.getId());
            rowCount = postresql.delete(firstStudent.getId());
            if(rowCount>0){
                System.out.println("Student was deleted");
            }
        }

        /* #################### Update by Id #################### */
        if(!studentList.isEmpty()) {
            var firstStudent1 = studentList.get(0);
            firstStudent1.setEmail("newEmail1@newEmail.com");
            System.out.println("Update student with id " + firstStudent1.getId());
            rowCount = postresql.update(firstStudent1);
            if (rowCount > 0) {
                System.out.println("Student email was updated");
            }
        }

        /* #################### Update by Id #################### */
        if(!studentList.isEmpty()) {
            var secondStudent = studentList.get(1);
            secondStudent.setEmail("newEmail1@newEmail.com");
            System.out.println("Update student with id " + secondStudent.getId());
            rowCount = postresql.update(secondStudent);
            if (rowCount > 0) {
                System.out.println("Student email was updated");
            }
        }

        /* #################### Find All #################### */
        System.out.println("List of students");
        postresql
                .findAll().forEach(student -> print(student));

    }

    private static void print(Student s) {
        System.out.println("Student: " + s.toString());
    }
}
