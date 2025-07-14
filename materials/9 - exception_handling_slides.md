---
marp: true
title: Session 9 - Exception Handling in Java
---

# Session 9: Exception Handling

**Goals:**
- Master exception handling in Java using try-catch-finally blocks
- Understand checked vs unchecked exceptions
- Create custom exceptions for application-specific errors
- Use try-with-resources for automatic resource management

If a client can reasonably be expected to recover from an exception, make it a checked exception. If a client cannot do anything to recover from the exception, make it an unchecked exception.

---

## 🔍 What is an Exception?

An exception is an event that disrupts the normal flow of the program.

**Types of Exceptions:**
- **Checked Exceptions:** Must be handled or declared (e.g., IOException)
- **Unchecked Exceptions:** Extend RuntimeException (e.g., NullPointerException)
- **Errors:** Serious problems like OutOfMemoryError

---

## 🔁 try-catch-finally Structure

```java
try {
    // risk code
} catch (IOException e) {
    // handle exception
} finally {
    // cleanup code
}
```

### Use `finally` for resource management.

---

## 🛠 Example: Division by Zero

```java
public class DivideByZeroDemo {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Operation finished.");
        }
    }
}
```
📚 [Oracle Docs: Exceptions](https://docs.oracle.com/javase/tutorial/essential/exceptions/)

---

## 🧰 Custom Exceptions

Create your own exception class by extending `Exception` or `RuntimeException`.

```java
class InvalidTransactionException extends Exception {
    public InvalidTransactionException(String msg) {
        super(msg);
    }
}
```

---

## 🔒 try-with-resources

Used for automatically closing resources like streams, connections, readers:

```java
try (BufferedReader br = new BufferedReader(new FileReader("file.txt"))) {
    System.out.println(br.readLine());
} catch (IOException e) {
    e.printStackTrace();
}
```

- `AutoCloseable` interface is implemented by most I/O classes
- `finally` is not needed to close the resource

📚 [try-with-resources - Oracle Docs](https://docs.oracle.com/javase/tutorial/essential/exceptions/tryResourceClose.html)

---
🔗 [Course GitHub Repository](https://github.com/NSCarvalho/java-training-course)