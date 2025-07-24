---
marp: true
title: Session 14 - Working with JDBC (Java Database Connectivity)
---

# Session 14: Working with JDBC (Java Database Connectivity)

**Goals:**
- Understand what JDBC is and why it is important
- Learn how to connect to a database using JDBC
- Perform CRUD operations with JDBC
- Handle resources and exceptions properly
- Understand JDBC best practices

---

## 🧱 What is JDBC?

JDBC (Java Database Connectivity) is a Java API that allows Java applications to interact with relational databases.

- Provides classes and interfaces for database communication
- Works with many RDBMS systems (MySQL, PostgreSQL, Oracle, etc.)
- Based on the standard SQL syntax

📚 [JDBC Overview - Oracle Docs](https://docs.oracle.com/javase/tutorial/jdbc/overview/index.html)

---

## 🔗 JDBC Architecture

1. Application
2. JDBC API
3. JDBC Driver Manager
4. JDBC Driver
5. Database

There are 4 types of JDBC drivers:
- Type 1: JDBC-ODBC bridge
- Type 2: Native-API driver
- Type 3: Network Protocol driver
- Type 4: Thin driver (pure Java)

---

## 🔌 Loading the JDBC Driver

```java
Class.forName("com.mysql.cj.jdbc.Driver");
```

For modern drivers, registering the driver manually is no longer necessary if using JDBC 4.0+.

---

## 🔐 Connecting to a Database

```java
String url = "jdbc:mysql://localhost:3306/mydb";
String username = "root";
String password = "password";

Connection conn = DriverManager.getConnection(url, username, password);
```

Always close connections in a `finally` block or use try-with-resources.

---

## 🛠️ Executing SQL Statements

### Statement

```java
Statement stmt = conn.createStatement();
ResultSet rs = stmt.executeQuery("SELECT * FROM users");
```

### PreparedStatement

```java
PreparedStatement ps = conn.prepareStatement("SELECT * FROM users WHERE id = ?");
ps.setInt(1, 1);
ResultSet rs = ps.executeQuery();
```

---

## ✍️ Inserting Data

```java
PreparedStatement ps = conn.prepareStatement("INSERT INTO users(name, age) VALUES (?, ?)");
ps.setString(1, "Alice");
ps.setInt(2, 30);
ps.executeUpdate();
```

---

## 📝 Updating and Deleting

```java
// Update
PreparedStatement ps = conn.prepareStatement("UPDATE users SET age = ? WHERE id = ?");
ps.setInt(1, 31);
ps.setInt(2, 1);
ps.executeUpdate();

// Delete
PreparedStatement ps = conn.prepareStatement("DELETE FROM users WHERE id = ?");
ps.setInt(1, 1);
ps.executeUpdate();
```

---

## 🔍 Reading Results

```java
ResultSet rs = ps.executeQuery();
while (rs.next()) {
    int id = rs.getInt("id");
    String name = rs.getString("name");
    System.out.println("ID: " + id + ", Name: " + name);
}
```

---

## 🧹 Resource Management

Always close the following:
- ResultSet
- Statement / PreparedStatement
- Connection

Use try-with-resources:

```java
try (Connection conn = DriverManager.getConnection(...);
     PreparedStatement ps = conn.prepareStatement(...);
     ResultSet rs = ps.executeQuery()) {
    // process result
}
```

---

## 🚫 Handling SQL Exceptions

Catch and log `SQLException`. Always log the SQL state and error code:

```java
catch (SQLException e) {
    System.err.println("SQL State: " + e.getSQLState());
    System.err.println("Error Code: " + e.getErrorCode());
    e.printStackTrace();
}
```

---

## 🔒 SQL Injection Prevention

Always use `PreparedStatement` instead of `Statement` to prevent SQL injection.

**Don't:**
```java
String sql = "SELECT * FROM users WHERE name = '" + userInput + "'";
```

**Do:**
```java
PreparedStatement ps = conn.prepareStatement("SELECT * FROM users WHERE name = ?");
ps.setString(1, userInput);
```

---

## 🏁 Transactions

```java
conn.setAutoCommit(false);
try {
    // multiple operations
    conn.commit();
} catch (SQLException e) {
    conn.rollback();
}
```

---

## 📦 Working with JDBC and Maven

Add the driver dependency to `pom.xml`:

```xml
<dependency>
  <groupId>mysql</groupId>
  <artifactId>mysql-connector-java</artifactId>
  <version>8.0.33</version>
</dependency>
```
📚 [JDBC Basics - Oracle Docs](https://docs.oracle.com/javase/tutorial/jdbc/basics/index.html)


---
## 🌐 Using DataSource Interface

The `DataSource` interface is a preferred alternative to using `DriverManager` because it provides better control for connection pooling, distributed transactions, and configuration via JNDI.

### Example with PostgreSQL

```java
import org.postgresql.ds.PGSimpleDataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class DataSourceExample {
    public static void main(String[] args) {
        PGSimpleDataSource dataSource = new PGSimpleDataSource();
        dataSource.setServerNames(new String[] {"localhost"});
        dataSource.setPortNumbers(new int[] {5432});
        dataSource.setDatabaseName("mydatabase");
        dataSource.setUser("myuser");
        dataSource.setPassword("mypassword");

        try (Connection conn = dataSource.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM my_table")) {

            while (rs.next()) {
                System.out.println("Row: " + rs.getString(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
```

📦 Maven Dependency for PostgreSQL:

```xml
<dependency>
  <groupId>org.postgresql</groupId>
  <artifactId>postgresql</artifactId>
  <version>42.7.3</version>
</dependency>
```

📚 [PostgreSQL JDBC Documentation](https://jdbc.postgresql.org/documentation/)


---
## ✅ Summary

✅ You learned:
- What JDBC is and how to use it
- How to connect to a database and perform CRUD
- How to manage resources and exceptions
- Best practices and security considerations

🔗 [Course GitHub Repository](https://github.com/NSCarvalho/java-training-course)