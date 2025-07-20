package classes;

// Outer Class
public class OuterClass {

    private int id;
    private PrivateInnerClass privateInnerClass = new PrivateInnerClass();

    public OuterClass() {
        this.id=0;
        System.out.println("Init class OuterClass");
    }

    public void printClassName(){
        System.out.println("My name is " + getClass().toString());
    }

    public void printPrivateClassName(){
        // Local Class
        class ClassUtils {
            boolean hasValue(Object object){
               return object != null;
            }
        }
        ClassUtils classUtils = new ClassUtils();
        if(classUtils.hasValue(privateInnerClass)){
            privateInnerClass.printClassName();
        }
    }

    // Static Inner Class
    static class StaticInnerClass {

        public StaticInnerClass() {
            System.out.println("Init class StaticInnerClass");
        }

        public void printClassName(){
            // ClassUtils classUtils = new ClassUtils(); NOT ALLOWED
            //System.out.println(id); NOT ALLOWED
            System.out.println("My name is " + getClass().toString());
        }
    }

    // Inner Class
    class InnerClass {

        public InnerClass() {
            System.out.println("Init class InnerClass");
        }

        public void printClassName(){
            System.out.println("id: " + id);
            System.out.println("My name is " + getClass().toString());
        }
    }

    // Private Inner Class
    private class PrivateInnerClass {

        public PrivateInnerClass() {
            System.out.println("Init class PrivateInnerClass");
        }

        public void printClassName(){
            System.out.println("My name is " + getClass().toString());
        }
    }
}
