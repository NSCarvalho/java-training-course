---
marp: true
title: Session 02 - Variables and Data Types
---

# Session 02: Variables and Data Types

**Goals:**
- Understand what variables are and why we use them
- Learn about the basic data types in Java
- Understand types of variables and how to use arrays

---

# What is a Variable?

A **variable** is a container used to store data during the execution of a program.

**Think of it like a labeled box:**
- You can put something inside
- You can read it later
- You can replace the contents

```java
int age = 30;
```

📚 [Java Variables - Official Docs](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/variables.html)

---

# Declaring a Variable in Java

**Syntax:**
```java
<type> <name> = <value>;
```

**Examples:**
```java
int count = 10;
double price = 5.99;
char grade = 'A';
boolean isActive = true;
```

📚 [Java Language Specification - Variable Declarations](https://docs.oracle.com/javase/specs/jls/se17/html/jls-14.html#jls-14.4)

---

# Java is a Statically Typed Language

- Every variable must be declared with a **type**
- Type cannot change once defined
- Compile-time checking avoids many bugs

```java
String name = "Alice";
// name = 5; // ❌ Error: incompatible types
```

---

# Primitive Data Types in Java

| Type     | Description           | Example     |
|----------|-----------------------|-------------|
| `int`    | Whole numbers          | `int x = 10;` |
| `double` | Decimal numbers        | `double pi = 3.14;` |
| `char`   | Single character       | `char grade = 'B';` |
| `boolean`| True or false          | `boolean ok = true;` |

📚 [Primitive Data Types - Oracle Docs](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html)

---

# Arrays in Java

Arrays store multiple values of the same type.

```java
int[] numbers = {1, 2, 3, 4};
String[] names = new String[3];
names[0] = "Alice";
```

📚 [Java Arrays - Oracle Docs](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html)

---

# Types of Variables in Java

### 1. Instance Variables (Non-Static Fields)
- Declared inside a class but outside any method
- Each object has its own copy

### 2. Class Variables (Static Fields)
- Declared with `static` keyword
- Shared across all instances of a class

### 3. Local Variables
- Declared inside methods or blocks
- Only exist during method execution

```java
public class Example {
    int instanceVar = 5;         // instance variable
    static int classVar = 10;    // class variable

    public void method() {
        int localVar = 2;        // local variable
    }
}
```

📚 [Kinds of Variables - Oracle Docs](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/variables.html)

---

# Type Inference with `var` (Java 10+)

You can let Java infer the type based on the value:

```java
var count = 10;        // int
var price = 2.99;      // double
var message = "Hello"; // String
```

**Note:** Type is still fixed after inference.

📚 [Local Variable Type Inference (JEP 286)](https://openjdk.org/jeps/286)

---

# Constants with `final`

Use `final` to make a variable unchangeable (constant):

```java
final double PI = 3.14159;
```

Attempting to reassign it will result in a compilation error.

📚 [Final Variables - Oracle Docs](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/final.html)

---

# Naming Variables

✅ Good practices:
- Use meaningful names (`age`, `price`, `userName`)
- camelCase for variables and methods

❌ Avoid:
- Single letters like `x` or `y` (except in short loops)
- Names that don’t describe the content

📚 [Java Naming Conventions (Oracle)](https://www.oracle.com/java/technologies/javase/codeconventions-namingconventions.html)

---

# Summary

✅ You learned:
- How to declare variables
- Different primitive data types
- Arrays and their usage
- Types of variables in Java
- Use of `var` and `final`
- Good naming practices

🔗 [Course GitHub Repository](https://github.com/NSCarvalho/java-training-course)
