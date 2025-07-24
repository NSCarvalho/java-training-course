package pt.nmc;

import pt.nmc.dictionary.Dictionary;
import pt.nmc.dictionary.HashMapDictionary;
import pt.nmc.dictionary.exceptions.WordNotFoundException;
import pt.nmc.model.Student;
import pt.nmc.repos.MemoryDataBase;
import pt.nmc.repos.Postresql;
import pt.nmc.repos.StudentRepo;

import java.util.Optional;

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
        App app = new App(new HashMapDictionary<>());
      /*  App app1 = new App(new Dictionary<String, String>() {
            @Override
            public void add(String key, String value) {
                //
            }

            @Override
            public String get(String key) throws WordNotFoundException {
                return null;
            }

            @Override
            public void remove(String key) throws WordNotFoundException {

            }
        });*/
        //System.out.println("Hello world");

        //StudentRepo memoryDataBase = new MemoryDataBase();
        //memoryDataBase.save(student);

        /*var student = Student
                .builder()
                .firstName("Nuno")
                .lastName("Carvalho")
                .email("newemail@newemail.com")
                .build();

        postresql.save(student);*/

        StudentRepo postresql = new Postresql();
        Optional<Student> student = postresql.findByFirstName("Carlos");
        student
                .ifPresentOrElse(
                        opt -> System.out.println("Student exists: " + opt.toString()),
                        () -> System.out.println("Student does not exist"));


        /*
        Optional<Student> studentOptional = memoryDataBase.get("Carlos");
        if(studentOptional.isPresent()){
            System.out.println("Carlos exists");
        }else{
            System.out.println("Carlos does not exist");
        }*/

    }
}
