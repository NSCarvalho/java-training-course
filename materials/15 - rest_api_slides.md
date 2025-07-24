
---
marp: true
title: Session 15 - RESTfull Services and Spring Boot
---

# Session 15: RESTfull Services and Spring Boot

**Goals:**
- Understand what REST is and its principles
- Learn how to design RESTfull APIs
- Create a complete REST API using Spring Boot

---

## 🌐 What is REST?

REST (Representational State Transfer) is an architectural style for designing networked applications.

### Principles:
- **Stateless**: Each request from client to server must contain all necessary information.
- **Client-Server**: Separation of concerns between frontend and backend.
- **Cacheable**: Responses must define themselves as cacheable or not.
- **Uniform Interface**: Standard methods (GET, POST, PUT, DELETE).
- **Layered System**: Client does not need to know whether it is connected directly to the end server.

📚 [REST - Wikipedia](https://en.wikipedia.org/wiki/Representational_state_transfer)

---

## 📦 HTTP Methods in REST

| Method | Description               | Example               |
|--------|---------------------------|-----------------------|
| GET    | Retrieve a resource       | `GET /users/1`        |
| POST   | Create a new resource     | `POST /users`         |
| PUT    | Update an existing resource | `PUT /users/1`     |
| DELETE | Delete a resource         | `DELETE /users/1`     |
| PATCH  | Partially update resource | `PATCH /users/1`      |

---

## 📄 RESTful API Design Best Practices

- Use **nouns** for resource names, not verbs (e.g. `/users`, not `/getUsers`)
- Use **plural** nouns (e.g. `/orders`, `/products`)
- Use nested URIs for relationships: `/users/123/orders`
- Handle errors with proper HTTP status codes
    - 200 OK
    - 201 Created
    - 400 Bad Request
    - 404 Not Found
    - 500 Internal Server Error
- Support filtering, pagination, and sorting

---

## 🚀 Example REST API with Spring Boot

### 📁 Project Structure
```
src/
├── main/
│   ├── java/com/example/demo/
│   │   ├── DemoApplication.java
│   │   ├── controller/UserController.java
│   │   ├── model/User.java
│   │   └── service/UserService.java
│   └── resources/
│       └── application.properties
```

---

## 💻 DemoApplication.java

```java
@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
```

---

## 🧍 User.java

```java
public class User {
    private Long id;
    private String name;
    private String email;

    // getters and setters
}
```

---

## ⚙️ UserService.java

```java
@Service
public class UserService {
    private Map<Long, User> userStore = new ConcurrentHashMap<>();
    private AtomicLong idCounter = new AtomicLong();

    public List<User> getAllUsers() {
        return new ArrayList<>(userStore.values());
    }

    public User getUserById(Long id) {
        return userStore.get(id);
    }

    public User createUser(User user) {
        long id = idCounter.incrementAndGet();
        user.setId(id);
        userStore.put(id, user);
        return user;
    }

    public User updateUser(Long id, User user) {
        user.setId(id);
        userStore.put(id, user);
        return user;
    }

    public void deleteUser(Long id) {
        userStore.remove(id);
    }
}
```

---

## 🌐 UserController.java

```java
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping
    public List<User> getAll() {
        return service.getAllUsers();
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> get(@PathVariable Long id) {
        User user = service.getUserById(id);
        if (user == null) return ResponseEntity.notFound().build();
        return ResponseEntity.ok(user);
    }

    @PostMapping
    public ResponseEntity<User> create(@RequestBody User user) {
        return new ResponseEntity<>(service.createUser(user), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<User> update(@PathVariable Long id, @RequestBody User user) {
        return ResponseEntity.ok(service.updateUser(id, user));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.deleteUser(id);
        return ResponseEntity.noContent().build();
    }
}
```

## 🔧 Maven Dependency for Spring Boot REST API

Make sure you have the following dependencies in your `pom.xml`:

```xml
<dependencies>
  <dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
  </dependency>
  <dependency>
    <groupId>com.fasterxml.jackson.core</groupId>
    <artifactId>jackson-databind</artifactId>
  </dependency>
  <dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-test</artifactId>
    <scope>test</scope>
  </dependency>
</dependencies>
```

---

## ⚙️ application.properties

```
server.port=8080
spring.main.allow-bean-definition-overriding=true
```

---

## 🧠 Advanced REST API Design

### URI Best Practices

- Use nouns to represent resources: `/users`, `/orders`
- Avoid using verbs: use HTTP methods instead of `/getUser`
- Use nested URIs for relationships: `/users/123/orders`

### HTTP Status Codes

| Code | Meaning                  |
|------|--------------------------|
| 200  | OK                       |
| 201  | Created                  |
| 204  | No Content               |
| 400  | Bad Request              |
| 401  | Unauthorized             |
| 403  | Forbidden                |
| 404  | Not Found                |
| 500  | Internal Server Error    |

### HATEOAS (Hypermedia as the Engine of Application State)

Provides navigation links with the responses:

```json
{
  "id": 1,
  "name": "Item A",
  "_links": {
    "self": { "href": "/items/1" },
    "all-items": { "href": "/items" }
  }
}
```

### Versioning

- URI versioning: `/api/v1/items`
- Header-based versioning: `Accept: application/vnd.company.v1+json`

### Content Negotiation

Support multiple formats using `Accept` header (e.g., `application/json`, `application/xml`).

---


## ✅ Summary

✅ You learned:
- REST principles and best practices
- How to design a RESTfull API
- How to create a full API using Spring Boot

🔗 [Spring Boot Documentation](https://spring.io/projects/spring-boot)
🔗 [Course GitHub Repository](https://github.com/NSCarvalho/java-training-course)
