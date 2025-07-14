---
marp: true
title: Session 07 - Advanced Consolidation Exercises (24 Tasks)
---

# Session 07: Advanced Java Exercises

This worksheet contains 24 exercises of increasing complexity, covering advanced uses of methods, arrays, validation, recursion, overloading, varargs, and reflection.

---

## 🧪 Exercise 1 – Personal BMI Calculator

Ask the user for weight (kg) and height (m). Then:
- Validate both inputs
- Compute the BMI using the formula: BMI = weight / (height * height)
- Output the result with category (underweight, normal, overweight, etc.)
## 🧪 Exercise 2 – Multiple Choice Quiz

- Display 3 questions to the user (hardcoded)
- Use `Scanner` to get the answer to each question
- Validate the input and score correct answers
- Print total score at the end
## 🧪 Exercise 3 – Character Frequency Counter

- Ask the user to enter a string
- Count how many times each letter (a-z) appears
- Ignore case and spaces
- Display the frequency table
## 🧪 Exercise 4 – Sentence Statistics

- Ask the user to input a sentence
- Calculate:
    - Total words
    - Average word length
    - Longest word
- Display each result
## 🧪 Exercise 5 – String Utilities with Methods

Write methods to:
- Count vowels and consonants
- Convert strings to uppercase and lowercase
- Remove extra spaces

---

## 🧪 Exercise 6 – Recursive Factorial + Trace

Print each recursive call in the factorial calculation to illustrate the stack.

---

## 🧪 Exercise 7 – Recursive Palindrome Checker

Ask the user for a word and recursively determine if it is a palindrome.

---

## 🧪 Exercise 8 – Recursive Digit Sum

Ask the user for an integer and compute the sum of its digits using recursion.

---

## 🧪 Exercise 9 – Array-based Calculator with Methods

Build a euroCalculator that:
- Accepts an array of doubles
- Provides methods for: average, sum, min, max, median

---

## 🧪 Exercise 10 – Calculator with Overloaded Methods

Create a class with overloaded methods to:
- Add/subtract/multiply/divide for `int`, `double`, and `varargs`

---

## 🧪 Exercise 11 – Method Dispatcher Using Strings

Ask the user to input a method name (like "add", "multiply") and two values:
- Call the appropriate method via conditional logic
- Optional: upgrade using reflection

---

## 🧪 Exercise 12 – Varargs Utility

Write a method that accepts a variable number of scores and returns a letter grade based on average.

---

## 🧪 Exercise 13 – Reflection: Inspect Class Fields

Create a class `Employee` and use reflection to:
- List all fields and their types
- Modify field values at runtime

---

## 🧪 Exercise 14 – Method Statistics from Main File

- Define 4 static methods: `add`, `subtract`, `multiply`, `divide`
- Ask the user which one to execute
- Use reflection to invoke the selected method
- Show result
## 🧪 Exercise 15 – Shared Counter via Static Variable

- Use a global static variable `count`
- Create 3 static methods that increment the counter
- Track how many times each method is called
- Display final count
## 🧪 Exercise 16 – Sorting with Methods

Ask the user for a list of numbers and write a method to sort and display:
- Ascending and descending order
- Without using `Arrays.sort`

---

## 🧪 Exercise 17 – Encryptor Class (Char Shifting)

Create a method to encrypt a string by shifting each character N positions forward (Caesar cipher).

---

## 🧪 Exercise 18 – Validation Framework (Basic)

Create a reusable method that:
- Accepts a `value`, a `rule`, and an `error message`
- If rule fails, throws an exception or prints error

---

## 🧪 Exercise 19 – Print Table of Operations

Create a `MathTable` utility that:
- Given a number, prints a table of sums, products, and powers from 1 to 10

---

## 🧪 Exercise 20 – Recursively Reverse an Array

Write a recursive method to reverse an array of integers.
[1,2,3,4,5] -> [5,4,3,2,1]

---

## 🧪 Exercise 21 – Random Profile Generator

Generate N fake profiles (name, age, etc.)
- Use arrays, methods, and conditional logic
- Print as formatted table

---

## 🧪 Exercise 22 – Min-Max Recursively

Implement recursive functions to find:
- Minimum of an array
- Maximum of an array

---

## 🧪 Exercise 23 – Custom Console Menu

Create a reusable method that shows a menu and handles user input:
- Allow dynamic method linking via a lookup table or switch-case

---

## 🧪 Exercise 24 – Mini Test Framework

- Create several `test_*` methods in your main file
- Use reflection to discover and run all methods starting with `test_`
- Print which tests passed or failed (based on return values)