---
marp: true
title: Session 11 - Java Generics
---

# Session 11: Generics in Java

**Goals:**
- Understand generic classes and methods
- Learn about type safety, type erasure, wildcards, and bounds
- Write reusable generic code

---

## 🧬 What Are Generics?

Generics provide **compile-time type safety** and eliminate casts.

```java
List<String> list = new ArrayList<>();
```

---

## 📦 Generic Class

```java
class Box<T> {
    private T value;
    public void set(T value) { this.value = value; }
    public T get() { return value; }
}
```

Usage:
```java
Box<String> box = new Box<>();
box.set("Java");
```

---

## 🔁 Generic Methods

```java
public <T> void printArray(T[] array) {
    for (T element : array) {
        System.out.println(element);
    }
}
```

---

## 🔄 Wildcards

- `<?>` - any type
- `<? extends Number>` - any subtype of Number
- `<? super Integer>` - any supertype of Integer

---

## 🧭 Bounded Type Parameters

```java
<T extends Number> void process(T t) {
    System.out.println(t.doubleValue());
}
```

---

## 🔚 Type Erasure

At runtime, all generics are erased and replaced with raw types.

```java
List<String> -> List
```

📚 [Oracle Docs: Generics](https://docs.oracle.com/javase/tutorial/java/generics/)

🔗 [Course GitHub Repository](https://github.com/NSCarvalho/java-training-course)