---
marp: true
title: Session 04 - Arithmetic and Logical Operators
---

# Session 04: Arithmetic and Logical Operators

**Goals:**
- Understand how to use arithmetic operators
- Learn how to evaluate logical conditions
- Combine expressions with logical operators

---

# Arithmetic Operators

Used to perform basic mathematical operations:

| Operator | Description    | Example        |
|----------|----------------|----------------|
| `+`      | Addition        | `a + b`        |
| `-`      | Subtraction     | `a - b`        |
| `*`      | Multiplication  | `a * b`        |
| `/`      | Division        | `a / b`        |
| `%`      | Modulus (remainder) | `a % b`    |

📚 [Operators - Oracle Docs](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html)

---

# Integer Division vs. Floating Point

```java
int a = 10;
int b = 3;
System.out.println(a / b); // 3

double x = 10.0;
double y = 3.0;
System.out.println(x / y); // 3.333...
```

💡 Use floating point for precision.

---

# Logical Operators

Used to combine or invert boolean expressions:

| Operator | Name      | Description                   |
|----------|-----------|-------------------------------|
| `&&`     | AND       | true if both are true         |
| `||`     | OR        | true if at least one is true  |
| `!`      | NOT       | inverts the boolean value     |

---

# Example: Logical Expressions

```java
int age = 25;
boolean hasID = true;

if (age >= 18 && hasID) {
    System.out.println("Access granted");
}
```

📚 [Logical Operators - Oracle Docs](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/op2.html)

---

# Combining Conditions

```java
boolean isAdmin = true;
boolean isActive = false;

if (isAdmin || isActive) {
    System.out.println("Welcome");
}
```

💡 Use parentheses to group complex expressions:
```java
if ((x > 5 && y < 10) || z == 3) { ... }
```

---

# Example with NOT operator

```java
boolean isLoggedIn = false;

if (!isLoggedIn) {
    System.out.println("Please log in.");
}
```

`!true` becomes `false`, and vice versa.

---

# Summary

✅ You learned:
- How to use arithmetic and logical operators
- The difference between integer and floating point division
- How to build complex conditions using `&&`, `||`, and `!`

🔗 [Course GitHub Repository](https://github.com/yourusername/java-training-course)
