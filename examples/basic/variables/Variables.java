package variables;

public class Variables
{
    public static void main(String[] args) {
        // Local variables with meaningful values and explicit types
        String firstName = "Nuno";
        String lastName = "Carvalho";
        String space = " ";
        int age = 35;
        double salary = 32500.75;
        float percentage = 87.5f;
        String email = "nuno.carvalho@example.com";
        char charA = 'N';
        boolean isYoung = age < 40;
        byte numberOfChildren = 2;

        // Print values
        System.out.println("Name: " + firstName + space + lastName);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Email: " + email);
        System.out.println("Char: " + charA);
        System.out.println("Is young: " + isYoung);
        System.out.println("Number of children: " + numberOfChildren);

        // Print max values of primitive types
        System.out.println("\n=== Maximum values of primitive types ===");
        System.out.println("byte: " + Byte.MAX_VALUE);
        System.out.println("short: " + Short.MAX_VALUE);
        System.out.println("int: " + Integer.MAX_VALUE);
        System.out.println("long: " + Long.MAX_VALUE);
        System.out.println("float: " + Float.MAX_VALUE);
        System.out.println("double: " + Double.MAX_VALUE);

        System.out.println("\n=== Other type characteristics ===");
        System.out.println("char (max unicode): " + (int) Character.MAX_VALUE + " => " + Character.MAX_VALUE);
        System.out.println("boolean: true / false (no max)");
    }
}
