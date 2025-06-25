---
marp: true
title: Session 03 - User Input in Java
---

# Session 03: User Input in Java

**Goals:**
- Learn how to receive input from the user
- Use the Scanner class to read different data types
- Handle common input issues
- Read values into arrays and process them

---

# Why Input Matters

Input allows interaction with the user:
- Enter name, age, options, values, etc.
- Makes the program dynamic and useful

---

# The `Scanner` Class

Used to read input from the keyboard (System.in).

**Import Scanner:**
```java
import java.util.Scanner;
```

**Create Scanner object:**
```java
Scanner input = new Scanner(System.in);
```

📚 [Scanner Documentation - Oracle](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Scanner.html)

---

# Reading Strings and Integers

```java
System.out.print("Enter your name: ");
String name = input.nextLine();

System.out.print("Enter your age: ");
int age = input.nextInt();
```

📝 Use `nextLine()` for full line text, `nextInt()` for integers.

---

# Reading Other Data Types

```java
double price = input.nextDouble();
boolean isValid = input.nextBoolean();
char firstLetter = input.next().charAt(0);
```

📚 [Scanner Methods - Oracle](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Scanner.html)

---

# Common Scanner Issue

Mixing `nextInt()` or `nextDouble()` with `nextLine()` can cause issues due to newline characters.

**Fix:**
Call `input.nextLine()` after reading numbers if you plan to read strings after.

```java
int age = input.nextInt();
input.nextLine(); // consume the leftover newline
String name = input.nextLine();
```

---

# Example Program: Basic Input

```java
import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Name: ");
        String name = input.nextLine();

        System.out.print("Age: ");
        int age = input.nextInt();

        System.out.println("Hello " + name + ", you are " + age + " years old.");
    }
}
```

---

# Reading Multiple Values into an Array

```java
int[] numbers = new int[5];
Scanner input = new Scanner(System.in);

System.out.println("Enter 5 numbers:");
for (int i = 0; i < numbers.length; i++) {
    numbers[i] = input.nextInt();
}
```

---

# Processing Array Input: Calculate Average

```java
int sum = 0;
for (int i = 0; i < numbers.length; i++) {
    sum += numbers[i];
}

double average = (double) sum / numbers.length;
System.out.println("Average: " + average);
```

🎯 This demonstrates how to read, store, and process input.

---

# Ways to Read Input from Command Line

In Java, you can receive input from the command line using multiple approaches:

### ✅ `Scanner` (Recommended for beginners)
- Simple and flexible
- Supports parsing multiple types (int, double, String, etc.)

### ✅ `args[]` (Command-line arguments)
- Used when launching the program
- Values are passed as arguments:
```bash
java MyProgram arg1 arg2
```
```java
public class MyProgram {
    public static void main(String[] args) {
        System.out.println("First argument: " + args[0]);
    }
}
```

### ⚠️ `BufferedReader` (Advanced)
- Useful for performance-sensitive applications
- Requires exception handling

```java
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
String input = reader.readLine();
```

📚 [Command-Line Arguments - Oracle Docs](https://docs.oracle.com/en/java/javase/24/docs/specs/man/java.html#description-of-command-line-arguments)

📚 [BufferedReader - Oracle Docs](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/BufferedReader.html)


### ✅ `Console` (for secure or password input)
- Useful for reading text without echoing (e.g., passwords)
- Only works in real console environments (not in some IDEs)

```java
Console console = System.console();
if (console != null) {
    String username = console.readLine("Username: ");
    char[] password = console.readPassword("Password: ");
}
```

📚 [System.console() - Oracle Docs](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/Console.html)


💡 For most use cases in learning environments, prefer `Scanner`.

---

# Summary

✅ You learned:
- Why input is essential
- How to use `Scanner` to read user input
- How to handle common input issues
- How to store values in arrays and calculate results

🔗 [Course GitHub Repository](https://github.com/NSCarvalho/java-training-course)


