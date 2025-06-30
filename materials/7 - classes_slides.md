---
marp: true
title: Session 09 - Classes and Object-Oriented Concepts
---

# Session 09: Classes and Object-Oriented Concepts

**Goals:**

- Learn how to create and use classes and objects in Java
- Understand class members, constructors, access control, nested classes, and enums
- Cover all official Java OOP topics from Oracle's Java Tutorial

---

## 🧱 Declaring Classes

A class is a template that defines state (fields) and behavior (methods).

```java
public class Person {
    String name;
    int age;

    void sayHello() {
        System.out.println("Hello, my name is " + name);
    }
}
```

📚 [Declaring Classes - Java Docs](https://docs.oracle.com/javase/tutorial/java/javaOO/classes.html)

---

## 🧩 Declaring Member Variables

Variables inside a class are called fields or member variables.

```java
public class Car {
    String brand = "Toyota";
    int year = 2020;
}
```

📚 [Declaring Member Variables - Java Docs](https://docs.oracle.com/javase/tutorial/java/javaOO/variables.html)

---

## 🧠 Defining Methods

A method is a block of code that performs a specific task.

```java
public void startEngine() {
    System.out.println("Engine started");
}
```

Methods can take parameters and return values.

📚 [Defining Methods - Java Docs](https://docs.oracle.com/javase/tutorial/java/javaOO/methods.html)

---

## 🔧 Constructors

Constructors are special methods used to initialize objects.

```java
public class Book {
    String title;

    public Book(String title) {
        this.title = title;
    }
}
```

📚 [Constructors - Java Docs](https://docs.oracle.com/javase/tutorial/java/javaOO/constructors.html)

---

## 🔁 Passing Info to a Method or Constructor

You can pass parameters to set values or perform actions:

```java
public void setAge(int age) {
    this.age = age;
}
```

📚 [Passing Info to a Method or Constructor - Java Docs](https://docs.oracle.com/javase/tutorial/java/javaOO/arguments.html)

---

## 🎭 Creating Objects

Objects are instances of a class:

```java
Person p = new Person();
p.name = "Alice";
p.sayHello();
```

📚 [Creating Objects - Java Docs](https://docs.oracle.com/javase/tutorial/java/javaOO/objects.html)

---

## 🧰 Using Objects

Access members with the dot `.` operator:

```java
System.out.println(p.name);
```

📚 [Using Objects - Java Docs](https://docs.oracle.com/javase/tutorial/java/javaOO/usingobject.html)

---

## 🔁 Returning Values from Methods

```java
public int getAge() {
    return this.age;
}
```

📚 [Returning a Value from a Method - Java Docs](https://docs.oracle.com/javase/tutorial/java/javaOO/returnvalue.html)

---

## 🔑 Using `this` Keyword

`this` refers to the current object instance.

```java
public void setName(String name) {
    this.name = name;
}
```

📚 [Using the this Keyword - Java Docs](https://docs.oracle.com/javase/tutorial/java/javaOO/thiskey.html)

---

## 🔐 Controlling Access to Members

| Modifier    | Scope                     |
| ----------- | ------------------------- |
| `public`    | Accessible everywhere     |
| `private`   | Only within the class     |
| `protected` | Same package + subclasses |
| *(default)* | Same package only         |

📚 [Controlling Access to Members of a Class - Java Docs](https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html)

---

## 🧠 Class vs Instance Members

- `static` fields/methods belong to the class
- Non-static belong to instances

```java
class Test {
    static int count;
    int id;
}
```

📚 [Understanding Class Members - Java Docs](https://docs.oracle.com/javase/tutorial/java/javaOO/classvars.html)

---

## 🧩 Understanding Class Members

Class members include:

- Fields
- Methods
- Constructors
- Nested classes

📚 [Understanding Class Members - Java Docs](https://docs.oracle.com/javase/tutorial/java/javaOO/classvars.html)

---

## 🔄 Initializing Fields

You can initialize fields directly or via constructors.

```java
int age = 30; // direct
```

📚 [Initializing Fields - Java Docs](https://docs.oracle.com/javase/tutorial/java/javaOO/initial.html)

---

## 📄 Summary of Creating and Using Classes and Objects

Steps:

1. Define class with fields & methods
2. Create object with `new`
3. Call methods and access fields with `.`

📚 [Summary of Creating and Using Classes and Objects - Java Docs](https://docs.oracle.com/javase/tutorial/java/javaOO/summary.html)

---

## 🧱 Nested Classes

Nested classes are declared inside another class.

- **Static nested class**
- **Inner class** (non-static)
- **Local class** (inside a method)
- **Anonymous class** (without a name)

📚 [Nested Classes - Java Docs](https://docs.oracle.com/javase/tutorial/java/javaOO/nested.html)

---

## 🧪 Lambda Expressions

Lambdas are short blocks of code that take parameters and return a value.

```java
(x, y) -> x + y
```

Used with functional interfaces.

📚 [Lambda Expressions - Java Docs](https://docs.oracle.com/javase/tutorial/java/javaOO/lambdaexpressions.html)

---

## 📅 Enum Types

Enums are fixed sets of constants:

```java
public enum Day {
    MONDAY, TUESDAY, WEDNESDAY;
}
```

Use them to model predefined values.

📚 [Enum Types - Java Docs](https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html)

---

## ✅ Summary

✅ You learned:

- Class structure (fields, methods, constructors)
- How to create and use objects
- Access control and `this` keyword
- Nested classes and enums
- Class vs. instance members
- Lambda expressions basics

🔗 [Oracle OOP Tutorial](https://docs.oracle.com/javase/tutorial/java/javaOO/index.html)

🔗 [Course GitHub Repository](https://github.com/NSCarvalho/java-training-course)