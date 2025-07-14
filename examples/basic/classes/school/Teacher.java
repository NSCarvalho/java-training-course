package classes.school;

public class Teacher extends Person {
    private final int teacherId;

    public Teacher(int teacherId) {
        this.teacherId = teacherId;
        System.out.println("I'm a teacher");
    }

    @Override
    public int getId(){
        System.out.println("I'm a Teacher");
        return this.teacherId;
    }

    @Override
    public String toString(){
        var objectString = "Student : " + super.toString();
        return objectString + "Teacher";
    }
}
