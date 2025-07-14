# 🧪 Java Polymorphism Exercises

## Exercise 1 – Animals and Polymorphism

### 📋 Description:
Create a base class `Animal` with a method `makeSound()`. Then create two subclasses: `Dog` and `Cat`, each overriding the method to produce the correct sound.

In the `Main` class, instantiate the animals and use a loop to demonstrate polymorphism.

### ✅ Requirements:
- Class `Animal` with method `makeSound()`
- Subclass `Dog` overrides `makeSound()` to print "Woof!"
- Subclass `Cat` overrides `makeSound()` to print "Meow!"
- In `Main`, create a list of `Animal` objects and iterate, calling `makeSound()`

### 🎯 Learning Goals:
- Method overriding
- Polymorphism using superclass references
- Array or list iteration in Java

---

## Exercise 2 – Calculator with Polymorphism and Loop

### 📋 Description:
Create a console euroCalculator that uses polymorphism for basic operations (addition, subtraction, multiplication, division). Each operation should be implemented as a separate class.

The program must ask the user to input two numbers and choose the operation via a menu. The euroCalculator should run in a loop until the user chooses to exit.

### ✅ Requirements:
1. Create an interface `Operation` with method `double calculate(double a, double b)`
2. Implement the following classes:
  - `Addition`
  - `Subtraction`
  - `Multiplication`
  - `Division` (with error handling for division by zero)
3. In the `Calculator` class:
  - Prompt the user for two numbers
  - Display a menu:
    ```
    1 - Addition
    2 - Subtraction
    3 - Multiplication
    4 - Division
    0 - Exit
    ```
  - Instantiate the correct class based on the user's choice
  - Use polymorphism to execute the operation
  - Display the result
  - Repeat until user chooses to exit

### 🎯 Learning Goals:
- Interfaces and implementing classes
- Polymorphism via interface reference
- Control flow with loops and switch
- Exception handling (e.g., division by zero)
