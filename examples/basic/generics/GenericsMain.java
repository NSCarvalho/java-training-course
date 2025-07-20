package generics;

import classes.numbers.currency.Euro;
import classes.school.Person;
import classes.school.Student;
import classes.school.Teacher;

import java.util.Arrays;
import java.util.List;

public class GenericsMain {

    public static void main(String[] args) {


        // genericMethod();
        // nullSafe();
        Person person = new Person();
        printSuperTeacher(Arrays.asList(person));
        printExtendsPerson(Arrays.asList(new Teacher(10)));
        //printExtendsPerson(Arrays.asList(new Euro(10.0))); // NOT ALLOWED: EUR DOES NOT EXTENDS PERSON
        printAnyObject(Arrays.asList(new Euro(10.0)));

    }

    private static void printAnyObject(List<?> superType ){
        System.out.println("Print Person " + superType.get(0).toString());
    }
    private static void printExtendsPerson(List<? extends Person> superType ){
        System.out.println("Print Person " + superType.get(0).toString());
    }
    private static void printSuperTeacher(List<? super Teacher> superType ){
        System.out.println("Print Person " + superType.get(0).toString());
    }

    private static void nullSafe() {
        NullSafe<String> emptyName = NullSafe.of("");
        NullSafe<String> firstName = NullSafe.of("Antonio");


        NullSafe<Long> numberAsLong = NullSafe.of(10L);
        NullSafe<Integer> numberAsInteger = NullSafe.of(100);
        NullSafe<Object> nullObject = NullSafe.of(null);

        NullSafe<Student> student = NullSafe.of(new Student(1));
        NullSafe<Teacher> teacher = NullSafe.of(new Teacher(1));

        printValueIfNotEmpty(emptyName, "emptyName");
        printValueIfNotEmpty(firstName, "firstName");
        printValueIfNotEmpty(numberAsLong, "numberAsLong");
        printValueIfNotEmpty(numberAsInteger, "numberAsInteger");
        printValueIfNotEmpty(nullObject, "nullObject");
        printValueIfNotEmpty(student, "student");
        printValueIfNotEmpty(teacher, "teacher");
    }

    private static <V> void printValueIfNotEmpty(NullSafe<V> emptyName, String name) {
        System.out.println("Check variable: " + name);
        if(!emptyName.isEmpty()){
            System.out.println("Value: " + emptyName.getValue());
        }else{
            System.out.println("Empty value");
        }
    }

    private static void genericMethod() {
        Student student = new Student(1);
        Teacher teacher = new Teacher(2);

        print(teacher);
        print(student);
    }

    public static <P extends Person> void print(P person){

       System.out.println("Id: " + person.getId());
       System.out.println("Name: " + person.getName());
    }
}
