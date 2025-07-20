---
marp: true
title: Session 12 - Introduction to Maven for Java Projects
---

# Session 12: Introduction to Maven for Java Projects

**Goals:**
- Understand the purpose and structure of Maven
- Learn how to create a Maven project from scratch
- Convert an existing non-Maven project into a Maven project
- Manage dependencies and plugins using the `pom.xml`

---

## 🧱 What is Maven?

Maven is a build automation and dependency management tool for Java projects.

- Uses XML-based configuration file `pom.xml`
- Manages project lifecycle: compile, test, package, install, deploy
- Automatically downloads dependencies from remote repositories

📚 [Maven in 5 Minutes - Apache Docs](https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html)

---

## 📁 Maven Standard Project Structure

```
project-name/
├── pom.xml
└── src
    ├── main
    │   └── java
    │       └── com
    │           └── example
    │               └── App.java
    └── test
        └── java
            └── com
                └── example
                    └── AppTest.java
```

📚 [Introduction to the Standard Directory Layout](https://maven.apache.org/guides/introduction/introduction-to-the-standard-directory-layout.html)

---

## 🚀 Creating a Maven Project from Scratch

Use the following command to generate a new Maven project:

```bash
mvn archetype:generate -DgroupId=com.example -DartifactId=my-app \
  -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
```

This creates a project with a default structure and a working `App.java`.

📚 [Maven Archetypes - Apache Docs](https://maven.apache.org/archetypes/)

---

## 🔄 Converting a Non-Maven Project to Maven

1. Create a `pom.xml` in the root directory.
2. Move your source code to `src/main/java`
3. Move tests to `src/test/java`
4. Add dependencies in `pom.xml`
5. Build using:

```bash
mvn compile
```

📚 [Introduction to POM](https://maven.apache.org/guides/introduction/introduction-to-the-pom.html)

## 🧪 Running and Testing

- **Compile:**
```bash
mvn compile
```

- **Run tests:**
```bash
mvn test
```

- **Package (JAR):**
```bash
mvn package
```

- **Run JAR:**
```bash
java -jar target/my-app-1.0-SNAPSHOT.jar
```

---

## 📦 Adding Dependencies

Add dependencies in the `pom.xml` inside the `<dependencies>` tag:

```xml
<dependencies>
  <dependency>
    <groupId>org.apache.commons</groupId>
    <artifactId>commons-lang3</artifactId>
    <version>3.12.0</version>
  </dependency>
</dependencies>
```

📚 [Maven Central Repository](https://search.maven.org/)

---

## 📂 Useful Maven Plugins

- `maven-compiler-plugin`: Set Java version
- `maven-surefire-plugin`: Test execution
- `maven-jar-plugin`: Create executable JARs
- `maven-dependency-plugin`: Manage dependencies

Example:

```xml
<build>
  <plugins>
    <plugin>
      <groupId>org.apache.maven.plugins</groupId>
      <artifactId>maven-compiler-plugin</artifactId>
      <version>3.10.1</version>
      <configuration>
        <source>17</source>
        <target>17</target>
      </configuration>
    </plugin>
  </plugins>
</build>
```

📚 [Apache Maven Plugins Index](https://maven.apache.org/plugins/index.html)

---

## 🔧 Define the Main Class for Execution

If your project has multiple classes with `main`, specify the entry point in `pom.xml` using the `maven-jar-plugin`.

```xml
<build>
  <plugins>
    <plugin>
      <groupId>org.apache.maven.plugins</groupId>
      <artifactId>maven-jar-plugin</artifactId>
      <version>3.3.0</version>
      <configuration>
        <archive>
          <manifest>
            <mainClass>com.example.MainApp</mainClass>
          </manifest>
        </archive>
      </configuration>
    </plugin>
  </plugins>
</build>
```

💡 After building, run with:

```bash
java -jar target/my-app-1.0-SNAPSHOT.jar
```

---

## 🧱 Additional Maven Topics

### 🔄 Maven Phases

- `validate`: Check project structure
- `compile`: Compile source code
- `test`: Run unit tests
- `package`: Bundle the compiled code
- `verify`: Run integration tests
- `install`: Install to local repository
- `deploy`: Deploy to remote repository

📚 [Maven Build Lifecycle](https://maven.apache.org/guides/introduction/introduction-to-the-lifecycle.html)

---

### 🧰 Maven Profiles

Used to customize builds (e.g., dev, test, prod environments):

```xml
<profiles>
  <profile>
    <id>dev</id>
    <properties>
      <env>development</env>
    </properties>
  </profile>
</profiles>
```

Activate with:

```bash
mvn package -Pdev
```

📚 [Maven Profiles - Docs](https://maven.apache.org/guides/introduction/introduction-to-profiles.html)

---

### 📁 Resource Management

Put non-code files in `src/main/resources`. Maven includes them in the classpath automatically.

```text
src/
 └── main/
     └── resources/
         └── config.properties
```

Read them with:

```java
InputStream in = getClass().getResourceAsStream("/config.properties");
```

---

### 🧪 Integration with IDEs

Modern IDEs (like IntelliJ, Eclipse) support:

- Auto-importing dependencies
- Generating Maven projects from GUI
- Managing plugins and profiles visually

---

### 📜 Dependency Scope

| Scope      | Purpose                             |
|------------|-------------------------------------|
| `compile`  | Available everywhere (default)      |
| `provided` | Needed for compilation but provided by runtime (e.g., servlet-api) |
| `runtime`  | Not needed for compile, only at runtime |
| `test`     | Used only during testing            |
| `system`   | Provided as a system path           |

---
📚 [Maven Docs](https://maven.apache.org/guides/index.html)

## ✅ Summary

✅ You learned:

- What Maven is and how to use it
- How to create and convert projects
- Dependency management and plugin usage
- How to define the main class in multi-class projects
- Profiles, phases, scopes, and resource handling

🔗 [Course GitHub Repository](https://github.com/NSCarvalho/java-training-course)
