---
marp: true
title: Session 05 - Control Flow Structures
---

# Session 05: Control Flow Structures

**Goals:**
- Understand how to control the flow of execution in a program
- Use `if`, `else`, `else if`, `switch`
- Apply loops: `while`, `for`, `do-while`

---

# Why Control Flow Matters

It allows your program to make decisions and repeat actions.

**Real world analogy:**
- If it’s raining → take an umbrella
- Repeat 10 push-ups → loop

---

# Conditional Statements

## `if`, `else if`, `else`

```java
int age = 20;

if (age >= 18) {
    System.out.println("Adult");
} else {
    System.out.println("Minor");
}
```

📚 [Control Flow Statements - Oracle Docs](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/if.html)

---

# `switch` Statement

Used for multiple fixed conditions:

```java
int day = 3;
switch (day) {
    case 1: System.out.println("Monday"); break;
    case 2: System.out.println("Tuesday"); break;
    case 3: System.out.println("Wednesday"); break;
    default: System.out.println("Other");
}
```

📚 [switch - Oracle Docs](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/switch.html)

---

# Comparison Operators Recap

| Operator | Description              |
|----------|--------------------------|
| `==`     | Equal to                 |
| `!=`     | Not equal to             |
| `>`      | Greater than             |
| `<`      | Less than                |
| `>=`     | Greater than or equal to |
| `<=`     | Less than or equal to    |

---

# Loops Overview

Loops allow repetition of a block of code.

Types:
- `while` loop
- `do-while` loop
- `for` loop

---

# `while` Loop

```java
int i = 0;
while (i < 5) {
    System.out.println(i);
    i++;
}
```

Runs **while** condition is true.

---

# `do-while` Loop

```java
int i = 0;
do {
    System.out.println(i);
    i++;
} while (i < 5);
```

Runs at least once before checking the condition.

---

# `for` Loop

```java
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}
```

- Initialization: `int i = 0`
- Condition: `i < 5`
- Increment: `i++`

---

# Loop Control Statements

- `break`: exits the loop
- `continue`: skips to the next iteration

```java
for (int i = 0; i < 10; i++) {
    if (i == 5) break;
    if (i % 2 == 0) continue;
    System.out.println(i);
}
```

---

# Summary

✅ You learned:
- How to use `if`, `else if`, `else`, and `switch`
- When and how to use `while`, `do-while`, and `for` loops
- How to control loop execution with `break` and `continue`

🔗 [Course GitHub Repository](https://github.com/yourusername/java-training-course)
