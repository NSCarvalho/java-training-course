---
marp: true
title: Session 01 - Introduction to Programming
---

# Session 01: Introduction to Programming

**Goals:**
- Understand basic programming concepts
- Install and configure the Java development environment
- Create your first Java program

---

# What is Programming?

Programming is writing a set of instructions to perform a specific task.

**Core idea:**
- Input -> Process -> Output

**Why it matters:**
- Automates tasks
- Solves real-world problems
- Drives modern technology

---

# Core Programming Concepts

- **Variables**: Store data
- **Data types**: Define kind of data (int, double, etc.)
- **Operators**: Perform operations (e.g., +, -, *, /)
- **Control flow**: Decisions and loops (if, while)
- **Methods**: Reusable code blocks

---

# Installing the Java Development Kit (JDK)

We will use OpenJDK 24.

**Links:**
- https://openjdk.org/

**Note:** Install instructions depend on your operating system.

---

# Installing IntelliJ IDEA (Community Edition)

**Steps:**
1. Download: https://www.jetbrains.com/idea/download/
2. Install and open IntelliJ
3. Configure the JDK (point to the installed Java folder)

[OK] IntelliJ helps you write, test, and debug code.

---

# Creating Your First Java Program

Steps:
1. Open IntelliJ -> New Project
2. Select Java, choose SDK (JDK 24)
3. Create file `HelloWorld.java`
4. Type the following code:

---

## HelloWorld.java

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```
To compile and run this program using the terminal:

```bash
javac HelloWorld.java
java HelloWorld
```
---

# Summary

✅ Concepts introduced:
- What is programming
- Installing Java and IntelliJ
- Creating and running your first Java program

🔗 [Course GitHub Repository](https://github.com/yourusername/java-training-course)
