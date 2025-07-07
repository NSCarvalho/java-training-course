---

marp: true
title: Session 8 - Interfaces, Abstract Classes and Additional Advanced OOP Concepts
---

# Session 8: Interfaces, Abstract Classes and Additional Advanced OOP Concepts

**Goals:**
- Understand the difference between interfaces and abstract classes
- Learn additional advanced class features not yet covered
- Strengthen design skills for clean, reusable Java code

---

## 🔐 Encapsulation
Encapsulation is the concept of restricting direct access to some components of an object and only exposing what’s necessary.

### Best Practices
- Use `private` for fields
- Provide `public` getters and setters if needed
- Avoid exposing internal state directly

```java
public class Account {
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) balance += amount;
    }
}
```

📚 [Encapsulation - Oracle Docs](https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html)

---

## 🔄 Interfaces vs Abstract Classes

### Interfaces
- Define a contract with method signatures only
- Support multiple inheritance
- All methods are `public` and `abstract` by default (Java 8+ allows default and static methods)

```java
interface Drivable {
    void drive();
}
```

### Abstract Classes
- Can have method implementations
- Can maintain state (fields)
- Cannot be instantiated

```java
abstract class Vehicle {
    int wheels;
    abstract void move();
}
```

📚 [Interfaces - Oracle Docs](https://docs.oracle.com/javase/tutorial/java/IandI/createinterface.html)
📚 [Abstract Classes - Oracle Docs](https://docs.oracle.com/javase/tutorial/java/IandI/abstract.html)

---

### When to Use

| Criteria                     | Interface                     | Abstract Class                |
|-----------------------------|-------------------------------|-------------------------------|
| Multiple inheritance needed | ✅ Yes                         | ❌ No                          |
| Partial implementation      | ❌ Not allowed                 | ✅ Allowed                    |
| Constants                   | ✅ Yes (public static final)   | ✅ Yes                        |
| Fields                      | ❌ Not allowed                 | ✅ Yes                        |
| Constructors                | ❌ Not allowed                 | ✅ Yes                        |

---

## 🧱 Immutable Classes

### Characteristics:
- All fields are `final`
- No setters
- Class is `final` to prevent subclassing
- Defensive copies for mutable objects

```java
final class Person {
    private final String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
```
---
## 🔁 Method Overriding and Polymorphism

- Method overriding lets a subclass provide a specific implementation.
- Achieves **runtime polymorphism**.

```java
class Animal {
    void speak() { System.out.println("Some sound"); }
}

class Dog extends Animal {
    void speak() { System.out.println("Bark"); }
}
```

---

## 🧩 Composition Over Inheritance

- Prefer using objects within objects to share functionality.
- Avoids tight coupling and enhances flexibility.

```java
class Engine {
    void start() { System.out.println("Engine started"); }
}

class Car {
    private Engine engine = new Engine();
    void startCar() { engine.start(); }
}
```
---

## 👻 Anonymous Classes

Used to define a one-off implementation of a class or interface.

```java
Runnable r = new Runnable() {
    public void run() {
        System.out.println("Running...");
    }
};
```

- Common in UI and callback patterns.

📚 [Anonymous Classes - Oracle Docs](https://docs.oracle.com/javase/tutorial/java/javaOO/anonymousclasses.html)

---

## 📍 Local Classes

- Defined inside a block (usually inside a method)
- Can access final or effectively final variables from the enclosing scope

```java
void process() {
class LocalHelper {
    void assist() {
        System.out.println("Helping...");
    }
}
    new LocalHelper().assist();
            }
```

📚 [Local Classes - Oracle Docs](https://docs.oracle.com/javase/tutorial/java/javaOO/localclasses.html)

---

## 📋 Java Records

- Introduced in Java 14
- Immutable data carrier classes
- Automatically generates constructor, getters, `equals()`, `hashCode()`, and `toString()`

```java
public record Point(int x, int y) {}
```

📚 [Records - Oracle Docs](https://docs.oracle.com/javase/tutorial/java/javaOO/records.html)

---

## 🧠 Lombok Library

- Reduces boilerplate with annotations
- Common annotations:
    - `@Getter`, `@Setter`
    - `@ToString`, `@EqualsAndHashCode`
    - `@Data`, `@AllArgsConstructor`, `@NoArgsConstructor`

```java
import lombok.Data;

@Data
public class User {
    private String name;
    private int age;
}
```

📚 [Project Lombok](https://projectlombok.org/)

---

## ✅ Summary

✅ Today’s session covered:
- Encapsulation and private state
- Interfaces vs abstract classes
- Composition vs inheritance
- Anonymous and local classes
- Java Records

🔗 [Oracle OOP Tutorial](https://docs.oracle.com/javase/tutorial/java/javaOO/index.html)
🔗 [Course GitHub Repository](https://github.com/NSCarvalho/java-training-course)