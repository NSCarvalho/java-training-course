---
marp: true
title: Session 13 - Unit Testing with JUnit 5 and Mockito
---

# Session 13: Unit Testing with JUnit 5 and Mockito

**Goals:**
- Understand the fundamentals of unit testing
- Learn how to use JUnit 5 for writing tests
- Learn how to mock dependencies using Mockito
- Understand test structure, lifecycle, and assertions

---

## 🧪 What is Unit Testing?

Unit testing is a type of software testing where individual components (units) of a program are tested in isolation.

- Ensures correctness of code logic
- Facilitates code refactoring
- Helps catch bugs early

---

## 📚 What is JUnit 5?

JUnit is the most widely used testing framework in the Java ecosystem.

**JUnit 5 = Platform + Jupiter (API) + Vintage (JUnit 4 support)**

📚 [JUnit 5 User Guide](https://junit.org/junit5/docs/current/user-guide/)

---

## 🚀 Basic JUnit 5 Test Structure

```java
import org.junit.jupiter.api.*;

public class CalculatorTest {

    @BeforeEach
    void setUp() {
        // setup logic
    }

    @Test
    void testAddition() {
        Assertions.assertEquals(5, 2 + 3);
    }

    @AfterEach
    void tearDown() {
        // cleanup logic
    }
}
```

---

## 📦 Assertions in JUnit 5

```java
assertEquals(expected, actual);
assertNotNull(object);
assertTrue(condition);
assertThrows(Exception.class, () -> { ... });
```

Use static import: `import static org.junit.jupiter.api.Assertions.*;`

📚 [Assertions - JUnit Docs](https://junit.org/junit5/docs/current/api/org.junit.jupiter.api/org/junit/jupiter/api/Assertions.html)

---

## 🔁 Test Lifecycle Annotations

| Annotation       | Description                     |
|------------------|---------------------------------|
| `@BeforeEach`    | Runs before each test method    |
| `@AfterEach`     | Runs after each test method     |
| `@BeforeAll`     | Runs once before all tests      |
| `@AfterAll`      | Runs once after all tests       |
| `@Test`          | Marks a test method             |
| `@Disabled`      | Disables a test temporarily     |

---

## 📌 Parameterized Tests

JUnit 5 supports parameterized tests:

```java
@ParameterizedTest
@ValueSource(ints = {1, 2, 3})
void testEven(int number) {
    assertTrue(number > 0);
}
```

📚 [Parameterized Tests - JUnit Docs](https://junit.org/junit5/docs/current/user-guide/#writing-tests-parameterized-tests)

---

## 🧰 What is Mockito?

Mockito is a mocking framework used to create test doubles of dependencies.

- Allows isolating units of code
- Avoids integration with external systems (e.g., DB, API)

📚 [Mockito Docs](https://site.mockito.org/)

---

## 🔄 Basic Mockito Usage

```java
import static org.mockito.Mockito.*;

List<String> mockedList = mock(List.class);
when(mockedList.get(0)).thenReturn("Hello");

assertEquals("Hello", mockedList.get(0));
```

---

## 💡 Injecting Mocks

```java
@ExtendWith(MockitoExtension.class)
class MyServiceTest {

    @Mock
    private Dependency dep;

    @InjectMocks
    private MyService service;

    @Test
    void testService() {
        when(dep.call()).thenReturn("Mocked");
        assertEquals("Mocked", service.execute());
    }
}
```

📚 [MockitoExtension - Javadoc](https://javadoc.io/doc/org.mockito/mockito-junit-jupiter/latest/org/mockito/junit/jupiter/MockitoExtension.html)

---

## 🔍 Verifying Behavior

```java
verify(mockedList).add("Item");
verify(mockedList, times(1)).clear();
```

- `times(n)`
- `never()`
- `atLeastOnce()`

---

## 🧪 Mock vs Spy

- **Mock**: Dummy implementation
- **Spy**: Real object but with partial mocking

```java
List<String> spyList = spy(new ArrayList<>());
```

---

## ✅ Summary

✅ You learned:
- How to structure tests with JUnit 5
- How to use assertions and lifecycle annotations
- How to mock and verify behavior with Mockito

🔗 [Course GitHub Repository](https://github.com/NSCarvalho/java-training-course)
