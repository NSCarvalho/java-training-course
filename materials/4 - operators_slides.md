---
marp: true
title: Session 04 - Arithmetic and Logical Operators
---

# Session 04: Arithmetic and Logical Operators

**Goals:**
- Understand how to use arithmetic operators
- Learn how to evaluate logical conditions
- Combine expressions with logical operators
- Know the precedence of Java operators

---

# Arithmetic Operators

Used to perform basic mathematical operations:

| Operator | Description         | Example     |
|----------|---------------------|-------------|
| `+`      | Addition             | `a + b`     |
| `-`      | Subtraction          | `a - b`     |
| `*`      | Multiplication       | `a * b`     |
| `/`      | Division             | `a / b`     |
| `%`      | Modulus (remainder) | `a % b`     |

📚 [Arithmetic Operators - Oracle Docs](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/op1.html)

---

# Logical Operators

Used to combine or invert boolean expressions:

| Operator | Name    | Description                   |
|----------|---------|-------------------------------|
| `&&`     | AND     | true if both are true         |
| `||`     | OR      | true if at least one is true  |
| `!`      | NOT     | inverts the boolean value     |

📚 [Logical Operators - Oracle Docs](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/op2.html)

---

# Operator Precedence Table

| Category                | Operators                                  |
|-------------------------|--------------------------------------------|
| **Postfix**             | `expr++`, `expr--`                         |
| **Unary**               | `++expr`, `--expr`, `+expr`, `-expr`, `~`, `!` |
| **Multiplicative**      | `*`, `/`, `%`                               |
| **Additive**            | `+`, `-`                                    |
| **Shift**               | `<<`, `>>`, `>>>`                           |
| **Relational**          | `<`, `>`, `<=`, `>=`, `instanceof`         |
| **Equality**            | `==`, `!=`                                  |
| **Bitwise AND**         | `&`                                         |
| **Bitwise Exclusive OR**| `^`                                         |
| **Bitwise Inclusive OR**| `|`                                         |
| **Logical AND**         | `&&`                                        |
| **Logical OR**          | `||`                                        |
| **Ternary**             | `? :`                                       |
| **Assignment**          | `=`, `+=`, `-=`, `*=`, `/=`, `%=`, `&=`, `^=`, `|=`, `<<=`, `>>=`, `>>>=` |

📚 [Operators - Precedence](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html)

---

# Combining Logical Conditions

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
- Arithmetic and logical operators
- Operator precedence in Java
- How to write and combine expressions correctly

🔗 [Course GitHub Repository](https://github.com/NSCarvalho/java-training-course)
