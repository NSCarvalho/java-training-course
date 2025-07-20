# Simple Dictionary Manager

## Goal
Create a generic dictionary class that allows the user to add, retrieve, and remove words with their definitions. Use Java's `Map`, `Generics`, and `try-catch` for exception handling.

---

## Requirements

### 1. Class `Dictionary<K, V>`
- Internally uses a `Map<K, V>` (e.g., `HashMap<K, V>`)
- Implement the following methods:
    - `void add(K key, V value)`
    - `V get(K key)` → should throw an exception if the key doesn't exist
    - `void remove(K key)` → should throw an exception if the key doesn't exist

### 2. Class `Main`
- In the `main()` method:
    - Create a `Dictionary<String, String>` to store words and definitions.
    - Use `try-catch` to handle attempts to access or remove non-existing keys.

---

## Bonus (Optional)
- Create a custom exception `WordNotFoundException`
- Improve the user experience by adding a loop or menu for multiple operations

---

## Concepts Covered
- Java Generics
- Java Collections (`Map`, `HashMap`)
- Exception Handling (`try-catch`, `NoSuchElementException`)
