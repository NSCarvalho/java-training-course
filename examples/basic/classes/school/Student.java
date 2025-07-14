package classes.school;

public class Student extends Person {
    private final int studentNumber;
    private boolean isFinishedAllCourses = false;

    public Student(int studentNumber) {
        super();
        this.studentNumber = studentNumber;
        System.out.println("I'm a student");
    }

    @Override
    public int getId(){
        System.out.println("I'm a Student");
        return this.studentNumber;
    }

    @Override
    public String toString(){
        var objectString = "Person : " + super.toString();
        return objectString + "Student";
    }
}
