### first lets talk about the spring mvc
Before Following this project, please make sure you have a solid foundation of java.

## 🌱 What is Spring MVC?

**Spring MVC** is a module of the Spring Framework that provides a robust Model-View-Controller architecture. It helps in building web applications in a clean, organized, and maintainable way.

- **Model** – Represents the data and business logic.
- **View** – Handles the presentation (e.g., HTML, Thymeleaf) what the users see.
- **Controller** – Handles user input and updates the model.


---

## Now, why spring mvc???

Clean separation of concerns

Built-in form handling and validation

Easy to extend and integrate with other Spring modules

## 🚀 Key Features

✅ Annotation-based controllers (`@Controller`, `@GetMapping`, etc.)  
✅ View resolvers for rendering HTML or JSON  
✅ Dependency injection and easy testing  
✅ Configurable via `application.properties` or `application.yml`

In simple term, the **controller** recives users request, interact with the **model** to get the request data and then tells the **views** what to display.

---
### How to configure maven.

# Download and Install Maven

- Go to the official Apache Maven download page <https://maven.apache.org/download.cgi>

- Download the latest binary zip archive (e.g., apache-maven-3.9.9-bin.zip).

- Extract the archive to a directory of your choice, for example:
C:\Program Files\Apache\Maven (Windows)
/usr/local/apache-maven (Linux/macOS), dont forget to extract to the Program Files
## How to set up env variables

# On Windows
- Open your: System Properties > Advanced > Environment Variables.
- Under System Variables, look for the variable named Path and click Edit.
- Click New and add the Maven bin directory path, for example: C:\Program Files\Apache\Maven\bin,
- click ok to save changes
- open a new command and run `mvn -version` You should see a Maven version info.


# On Linux/macOS
- Open your shell profile file (e.g., ~/.bashrc, ~/.zshrc).
- Add the following line, replacing the path with your Maven installation path: `export PATH=/usr/local/apache-maven/bin:$PATH`
- Save the file and reload the shell config: `source ~/.bashrc` or you might want to run `source ~/.zshrc`
- Verify Maven is installed, run `mvn -version`

# Run Maven Commads
- To install dependecies, navigate to the `pom.xml` file, add a dependecy and run `mvn clean install` to install.
- to start the project, run `mvn spring-boot:run`.