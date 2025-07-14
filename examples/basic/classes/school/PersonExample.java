package classes.school;

import java.util.Scanner;

public class PersonExample {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Student student;
        Teacher teacher;

        Person person = new Person();
        Person teacher1 = new Teacher(123);
        Person student1 = new Student(321);
        Person person1 = new Person();
        person1.setIdNumber("765");

        printPersonId(teacher1, "teacher1 : ");
        printPersonId(student1, "student1 : ");
        printPersonId(person1, "person1 : ");



    /*    System.out.println("Student number?");
        student = new Student(scanner.nextInt());

        System.out.println("Student name?");
        student.setName(scanner.next());

        System.out.println("My name is " + student.getName());*/


        System.out.println("Teacher number?");
        teacher = new Teacher(scanner.nextInt());

        System.out.println("Student name?");
        teacher.setName(scanner.next());

        System.out.println("My name is " + teacher.getName());
    }

    private static void printPersonId(Person person, String prefix) {
        System.out.println(prefix + person.getId());
    }

}
