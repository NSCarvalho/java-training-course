---
marp: true
title: Session 10 - Introduction to Java Collections
---

# Session 10: Java Collections

**Goals:**
- Understand the Java Collections Framework
- Learn core interfaces: List, Set, Map, Queue, Stack
- Select the appropriate collection for each use case

---

## 📦 What is the Java Collections Framework?

A unified architecture for storing and manipulating groups of objects.

**Key Interfaces:**
- `List` - ordered, allows duplicates
- `Set` - unordered, no duplicates
- `Map` - key-value pairs
- `Queue` - FIFO
- `Deque` / `Stack` - LIFO

📚 [Oracle Docs: Interfaces](https://docs.oracle.com/javase/tutorial/collections/interfaces/index.html)

## 📑 List

```java
List<String> names = new ArrayList<>();
names.add("Alice");
```

- Maintains insertion order
- Allows random access

📚 [Oracle Docs: List](https://docs.oracle.com/javase/tutorial/collections/interfaces/list.html)

## 📌 Set

```java
Set<String> unique = new HashSet<>();
unique.add("A");
unique.add("A"); // still only one "A"
```

- No duplicates
- HashSet, LinkedHashSet, TreeSet

📚 [Oracle Docs: Set](https://docs.oracle.com/javase/tutorial/collections/interfaces/set.html)

## 🔑 Map

```java
Map<String, Integer> ages = new HashMap<>();
ages.put("Alice", 30);
```

- Key-value storage
- HashMap, TreeMap, LinkedHashMap

📚 [Oracle Docs: Map](https://docs.oracle.com/javase/tutorial/collections/interfaces/map.html)

## ⏩ Queue Interface

Represents a First-In-First-Out (FIFO) structure.

### Common Implementations:
- `LinkedList`
- `PriorityQueue`

```java
Queue<String> queue = new LinkedList<>();
queue.add("Task1");
queue.poll();
```

📚 [Queue Interface - Oracle Docs](https://docs.oracle.com/javase/tutorial/collections/interfaces/queue.html)

---

## 🔄 Deque Interface (Double-Ended Queue)

Supports element insertion/removal at both ends.

### Common Implementations:
- `ArrayDeque`: resizable array, no capacity restrictions

```java
Deque<String> deque = new ArrayDeque<>();
deque.addFirst("first");
deque.addLast("last");
```

📚 [Deque Interface - Oracle Docs](https://docs.oracle.com/javase/tutorial/collections/interfaces/deque.html)

---

## 🧱 Stack Class

LIFO (Last-In-First-Out) structure. Legacy class.

```java
Stack<Integer> stack = new Stack<>();
stack.push(1);
stack.pop();
```

Prefer `Deque` for stack behavior in modern code.

📚 [Stack - Java Docs](https://docs.oracle.com/javase/8/docs/api/java/util/Stack.html)

---
## 📚 Choosing the Right Collection

| Requirement              | Use             |
|--------------------------|------------------|
| Unique elements          | Set              |
| Preserve insertion order | List / LinkedHashMap |
| Key-value lookup         | Map              |
| Stack behavior           | Deque            |
| FIFO queue               | Queue            |

📚 [Oracle Docs: Collections](https://docs.oracle.com/javase/tutorial/collections/index.html)

---

## ✅ Summary

✅ You learned:
- Core collection interfaces: List, Set, Map, Queue, Deque
- Their key implementations and behaviors
- How to choose the right structure for each scenario
- 
🔗 [Course GitHub Repository](https://github.com/NSCarvalho/java-training-course)