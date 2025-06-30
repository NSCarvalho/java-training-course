---
marp: true
title: Session 06 - Methods (From Basics to Reflection)
---

# Session 06: Methods – From Basics to Reflection

**Goals:**
- Understand the purpose and structure of methods
- Learn overloading, varargs, and reflection
- Improve code reuse and explore advanced topics

---

## 🧱 Basic Method Structure

```java
<modifier> <returnType> <methodName>(<parameters>) {
    // code block
}
```

Example:
```java
public static int add(int a, int b) {
    return a + b;
}
```

📚 [Java Methods - Tutorial](https://docs.oracle.com/javase/tutorial/java/javaOO/methods.html)

---

## 🎯 Overloading Methods

You can define multiple methods with the same name but different parameters.

```java
public static int square(int x) {
    return x * x;
}

public static double square(double x) {
    return x * x;
}
```

Useful for flexibility and code reuse.

---

## 📦 Passing Arrays to Methods

```java
public static double average(double[] numbers) {
    double sum = 0;
    for (double n : numbers) sum += n;
    return sum / numbers.length;
}
```

📚 [Passing Arrays to Methods](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html)

---

## 🔁 Using `varargs` (Variable Arguments)

```java
public static int sum(int... numbers) {
    int total = 0;
    for (int n : numbers) total += n;
    return total;
}
```

Allows flexible method calls like `sum(1, 2, 3, 4)`

📚 [Varargs in Java](https://docs.oracle.com/javase/tutorial/java/javaOO/arguments.html)

---

## 🔁 Recursion: Methods That Call Themselves

Recursion is a programming technique where a function calls itself to solve a problem.

```java
public class Factorial {
    public static int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(5)); // 120
    }
}
```

---

## ✅ Best Practices

- Use clear method names
- Keep methods focused and concise
- Avoid side effects
- Use comments to explain intent
- Group methods logically in classes

---

## 🔄 Static vs Instance Methods

- `static`: Belongs to the class, called with `ClassName.method()`
- Instance: Requires object, called with `object.method()`

```java
public static void hello() {}
public void instanceMethod() {}
```

---

## 🧠 Reflection: Runtime Method Inspection

Use reflection to inspect and invoke methods dynamically.

```java
import java.lang.reflect.Method;

public class Demo {
    public void greet() {
        System.out.println("Hello from reflection!");
    }

    public static void main(String[] args) throws Exception {
        Demo obj = new Demo();
        Method m = Demo.class.getMethod("greet");
        m.invoke(obj);
    }
}
```

📚 [Reflection API (Java 24)](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/reflect/Method.html)


## Summary

✔ Understand method structure and usage  
✔ Apply overloading and varargs  
✔ Learn to work with arrays and methods  
✔ Introduce reflection for runtime flexibility  
✔ Follow good design principles

🔗 [Course GitHub Repository](https://github.com/NSCarvalho/java-training-course)