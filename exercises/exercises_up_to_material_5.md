---
marp: true
title: Exercise – Complete Person Profile (Scanner, Types, Arrays, Operators)
---

# Exercise Series: Person Profile Analysis

All exercises in this set build on each other. Start by collecting basic information about a person and progressively enhance the program to process and validate user data using arrays, operators, and logical conditions.

---

## 🧪 Exercise 1 – Read Person Data (Primitive Types & Scanner)

Create a Java program that reads personal information using **all Java primitive data types**:

| Type      | Field                             | Example Input     |
|-----------|-----------------------------------|-------------------|
| `byte`    | Number of children                | `2`               |
| `short`   | Years of experience               | `12`              |
| `int`     | Age                               | `30`              |
| `long`    | Tax Identification Number (NIF)   | `123456789`       |
| `float`   | Height in meters                  | `1.75`            |
| `float`   | weight in Kilo                    | `70`              |
| `double`  | Monthly salary                    | `1500.50`         |
| `boolean` | Employed?                         | `true`            |
| `char`    | Favorite letter                   | `A`               |

After collecting the data, print a structured summary.

---

## 🧩 Exercise 2 – Extend with Children Information (Arrays + Loops)

Enhance the program to:
- Ask the name of the person already collected in Exercise 1
- Ask for the number of children
- For each child, ask:
  - Their name
  - Their age
  - Their height
  - Their weight

Store:
- The names in an array
- The ages in an array
- ...

Print a list of children like:
```
Children:
1. Ana (5 years, ...)
2. João (7 years, ...)
```

---

## 🧮 Exercise 3 – Analyze Family Data (Arithmetic Operators)

Using the children’s data:
- Calculate and print:
  - Average age of children
  - Maximum and minimum child age
  - Average height/weight of children
  - Maximum and minimum child height/weight
  - Number of children under 6 years old

Example logic:
```java
int count = 0;
for (int age : childrenAges) {
    if (age < 6) count++;
}
```

After calculating the data, print a structured summary.

---

## 🔐 Exercise 4 – Validate Inputs (Logical Conditions)

Improve the program to include validations for all fields:

## ✅ Data Validation Rules

| Field                      | Validation                                                                 |
|---------------------------|-----------------------------------------------------------------------------|
| Number of children        | ≥ 0; must match the number of children collected                           |
| Age                       | Between 0 and 120                                                           |
| Tax ID (NIF)              | Exactly 9 digits; must start with valid digits (e.g., 1, 2, or 3)           |
| Height (m)                | Between 0.5 and 2.5                                                         |
| Weight (kg)               | Between 2 and 500                                                           |
| Monthly salary            | ≥ 0                                                                         |
| Employed?                 | If `false`, salary must be 0                                                |
| Favorite letter           | Must be a single letter (A-Z or a-z)                                       |

### ✅ Validation for each child

| Child Field               | Validation                                                                 |
|--------------------------|-----------------------------------------------------------------------------|
| Name                     | Not empty; only letters (may include spaces or hyphens)                     |
| Age                      | Between 0 and the parent's age                                              |
| Height (m)               | Between 0.4 and 2.2                                                         |
| Weight (kg)              | Between 2 and 200                                                           |

### 🔁 Cross-field validations

| Validation                                                                              |
|----------------------------------------------------------------------------------------|
| If the number of children is 0, no child data should be requested                          |
| Average age of children must be lower than the parents' age                            |
| If `employed == false` and salary > 0, show a warning                                   |


If any input is invalid, show a clear error message and ask again.

---

## 💡 Optional Extension

- Count how many children have names starting with a vowel
- Sort the children by age
- Check if the favorite letter is in the person's name

---

## 📚 Documentation

- [Java Scanner (Java 24 API)](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Scanner.html)
- [Arrays (Java 24 API)](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Arrays.html)
- [Operators - Java Tutorial](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html)
- [Control Flow Statements - Java Tutorial](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/flow.html)
