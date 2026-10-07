# Gemini Spring Boot Integration 🚀

![Spring Boot](https://img.shields.io/badge/Spring%20Boot-4.1.0-brightgreen.svg)
![Java](https://img.shields.io/badge/Java-21-orange.svg)
![Spring AI](https://img.shields.io/badge/Spring%20AI-2.0.0-blue.svg)
![Gemini AI](https://img.shields.io/badge/AI-Google%20Gemini-4285F4.svg)
![Maven](https://img.shields.io/badge/Build-Maven-C71A36.svg)
![License](https://img.shields.io/badge/License-MIT-green.svg)

A Spring Boot application demonstrating the integration of **Google Gemini AI with Spring AI**.

This project shows how a Java/Spring Boot application can integrate with Google's Gemini models through the **Spring AI Google GenAI integration**, providing a clean foundation for building AI-powered applications and services.

---

## 🌟 Features

* **Google Gemini Integration**
  Integrates Google Gemini AI with Spring Boot using Spring AI.

* **Spring AI Integration**
  Uses the Spring AI Google GenAI starter instead of directly calling Gemini REST APIs.

* **Gemini Chat Model**
  Configures the Gemini chat model through Spring Boot application properties.

* **Externalized API Key**
  Reads the Gemini API key from the `GOOGLE_GEMINI_KEY` environment variable.

* **Spring Boot 4**
  Built using Spring Boot 4.1.0.

* **Java 21**
  Uses Java 21 as the application runtime.

* **Maven Wrapper**
  Includes Maven Wrapper scripts so the project can be built without requiring a globally installed Maven version.

* **REST/Web Application Support**
  Uses Spring Boot WebMVC as the web layer.

* **Extensible AI Architecture**
  Provides a foundation for adding prompts, chat applications, structured responses, memory, tools, advisors, and other Spring AI capabilities.

---

## 🛠️ Technologies Used

| Technology            | Version / Details       |
| --------------------- | ----------------------- |
| Java                  | 21                      |
| Spring Boot           | 4.1.0                   |
| Spring AI             | 2.0.0                   |
| AI Provider           | Google Gemini           |
| AI Integration        | Spring AI Google GenAI  |
| Web Framework         | Spring Boot WebMVC      |
| Build Tool            | Maven                   |
| Dependency Management | Spring AI BOM           |
| Lombok                | Optional                |
| Testing               | Spring Boot WebMVC Test |

---

## 🏗️ Architecture

The application uses Spring AI as the abstraction layer between the Spring Boot application and Google Gemini.

```text
                  +----------------------+
                  |    Spring Boot App   |
                  +----------+-----------+
                             |
                             v
                  +----------------------+
                  |      Spring AI       |
                  +----------+-----------+
                             |
                             v
                  +----------------------+
                  |    Google GenAI      |
                  +----------+-----------+
                             |
                             v
                  +----------------------+
                  |     Gemini Model     |
                  +----------+-----------+
                             |
                             v
                     Generated Response
```

### Request Flow

```text
Client
  |
  v
Spring Boot Application
  |
  v
Application AI Logic
  |
  v
Spring AI
  |
  v
Google GenAI
  |
  v
Google Gemini
  |
  v
AI Response
```

Spring AI provides the application-facing abstraction, while the Google GenAI integration handles communication with the Gemini model.

---

## 📋 Prerequisites

Before running the project, make sure you have:

1. **JDK 21** or later
2. **Google Gemini API Key**
3. Git
4. Maven, or use the Maven Wrapper included with the project

Verify Java:

```bash
java -version
```

The project is configured for Java 21.

---

## 🔑 Get a Gemini API Key

You need a Google Gemini API key to run the application.

You can create/manage Gemini API keys through:

[Google AI Studio](https://aistudio.google.com/)

> **Important:** Never commit your Gemini API key to GitHub or place a real API key directly in source control.

---

# 🚀 Getting Started

## 1. Clone the Repository

```bash
git clone https://github.com/dinesh-veer/GeminiSpringBootIntegration.git
cd GeminiSpringBootIntegration
```

---

## 2. Configure the Gemini API Key

The application expects the Gemini API key through the following environment variable:

```text
GOOGLE_GEMINI_KEY
```

### macOS / Linux

```bash
export GOOGLE_GEMINI_KEY="YOUR_GEMINI_API_KEY"
```

### Windows PowerShell

```powershell
$env:GOOGLE_GEMINI_KEY="YOUR_GEMINI_API_KEY"
```

Verify on macOS/Linux:

```bash
echo $GOOGLE_GEMINI_KEY
```

Verify on Windows PowerShell:

```powershell
echo $env:GOOGLE_GEMINI_KEY
```

---

## 3. Build the Application

The repository includes the Maven Wrapper.

### macOS / Linux

```bash
./mvnw clean package
```

### Windows

```cmd
mvnw.cmd clean package
```

You can also use Maven directly if it is installed:

```bash
mvn clean package
```

---

## 4. Run the Application

### macOS / Linux

```bash
./mvnw spring-boot:run
```

### Windows

```cmd
mvnw.cmd spring-boot:run
```

---

# 🤖 Google Gemini Integration

The project uses the Spring AI Google GenAI starter:

```xml
<dependency>
    <groupId>org.springframework.ai</groupId>
    <artifactId>spring-ai-starter-model-google-genai</artifactId>
</dependency>
```

This allows the application to use Spring AI APIs while Google Gemini acts as the underlying AI model provider.

The integration can be represented as:

```text
Spring Boot
     |
     v
Spring AI
     |
     v
Google GenAI
     |
     v
Gemini
```

---

# 🧠 Gemini Chat Model

The project is configured to use:

```text
gemini-3.5-flash
```

The model is configured through Spring AI's Google GenAI configuration.

Example:

```yaml
spring:
  ai:
    google:
      genai:
        api-key: ${GOOGLE_GEMINI_KEY}
        chat:
          model: gemini-3.5-flash
```

The API key is intentionally externalized through:

```text
${GOOGLE_GEMINI_KEY}
```

This prevents credentials from being hard-coded into the application configuration.

---

# ⚙️ Configuration

The application configuration is maintained under:

```text
src/main/resources/application.yml
```

A typical configuration for the Gemini integration is:

```yaml
spring:
  application:
    name: GeminiSpringBootIntegration

  ai:
    google:
      genai:
        api-key: ${GOOGLE_GEMINI_KEY}
        chat:
          model: gemini-3.5-flash
```

### Configuration Properties

| Property                            | Description                  |
| ----------------------------------- | ---------------------------- |
| `spring.application.name`           | Spring Boot application name |
| `spring.ai.google.genai.api-key`    | Google Gemini API key        |
| `spring.ai.google.genai.chat.model` | Gemini chat model            |

---

# 📦 Maven Configuration

The project uses:

```text
Java       : 21
Spring Boot: 4.1.0
Spring AI  : 2.0.0
```

The relevant Maven properties are:

```xml
<properties>
    <java.version>21</java.version>
    <spring-ai.version>2.0.0</spring-ai.version>
</properties>
```

Spring AI dependencies are managed through the Spring AI BOM.

```xml
<dependencyManagement>
    <dependencies>
        <dependency>
            <groupId>org.springframework.ai</groupId>
            <artifactId>spring-ai-bom</artifactId>
            <version>${spring-ai.version}</version>
            <type>pom</type>
            <scope>import</scope>
        </dependency>
    </dependencies>
</dependencyManagement>
```

---

# 📚 Main Dependencies

## Spring Boot WebMVC

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-webmvc</artifactId>
</dependency>
```

Provides the web application infrastructure.

---

## Spring AI Google GenAI

```xml
<dependency>
    <groupId>org.springframework.ai</groupId>
    <artifactId>spring-ai-starter-model-google-genai</artifactId>
</dependency>
```

Provides Spring AI integration with Google's GenAI/Gemini models.

---

## Lombok

```xml
<dependency>
    <groupId>org.projectlombok</groupId>
    <artifactId>lombok</artifactId>
    <optional>true</optional>
</dependency>
```

Lombok can be used to reduce Java boilerplate code.

---

# 📂 Project Structure

```text
GeminiSpringBootIntegration/
│
├── .mvn/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │
│   │   └── resources/
│   │       └── application.yml
│   │
│   └── test/
│       └── java/
│
├── .gitattributes
├── .gitignore
├── HELP.md
├── LICENSE
├── mvnw
├── mvnw.cmd
├── pom.xml
└── README.md
```

---

# 🧪 Testing

The project includes Spring Boot WebMVC testing support.

Run tests with:

### macOS / Linux

```bash
./mvnw test
```

### Windows

```cmd
mvnw.cmd test
```

Or:

```bash
mvn test
```

---

# 💡 Spring AI Extension Ideas

This project can be used as a starting point for exploring additional Spring AI features.

Possible extensions include:

### Prompt Engineering

Create reusable prompts for specific application use cases.

```text
User Input
    |
    v
Prompt Template
    |
    v
Spring AI
    |
    v
Gemini
    |
    v
Response
```

### Structured Output

Use Gemini to generate structured Java objects instead of plain text responses.

### Conversation Memory

Maintain conversation context across multiple interactions.

### Advisors

Add Spring AI advisors for logging, memory, security, prompt processing, and other cross-cutting concerns.

### Tools

Allow the AI model to interact with application-defined tools and services.

### Multimodal AI

Extend the application to explore Gemini capabilities beyond text-based chat where supported by the configured model and Spring AI version.

---

# 🔐 Security Considerations

Never store API credentials directly in:

* `application.yml`
* Java source code
* Git commits
* README files
* Docker images
* Public repositories

Use environment variables:

```bash
export GOOGLE_GEMINI_KEY="YOUR_GEMINI_API_KEY"
```

For production applications, consider using a secure secret-management solution appropriate for your deployment environment.

---

# 🐛 Troubleshooting

## Gemini API Key Not Found

Check whether the environment variable is configured.

```bash
echo $GOOGLE_GEMINI_KEY
```

If the result is empty:

```bash
export GOOGLE_GEMINI_KEY="YOUR_GEMINI_API_KEY"
```

Restart the application after setting the variable.

---

## Java Version Problem

Check the installed Java version:

```bash
java -version
```

The project requires Java 21.

---

## Maven Build Problem

Try a clean build:

```bash
./mvnw clean package
```

If dependency resolution fails, verify your network connection and Maven repository access.

---

## Gemini Authentication Problem

If Gemini requests fail, verify:

1. The API key is valid.
2. `GOOGLE_GEMINI_KEY` is configured.
3. The application was restarted after configuring the key.
4. The Gemini API is available for the configured Google project/API key.
5. The configured model is available for your Gemini API setup.

---

# 🔄 Application Lifecycle

The general application lifecycle is:

```text
Start Spring Boot
       |
       v
Load application.yml
       |
       v
Read GOOGLE_GEMINI_KEY
       |
       v
Initialize Spring AI
       |
       v
Initialize Google GenAI Integration
       |
       v
Configure Gemini Chat Model
       |
       v
Application Ready
```

---

# 🌱 Extending the Application

The current project provides a foundation for building more advanced Gemini-powered Spring Boot applications.

Some possible future examples:

```text
Gemini Spring Boot Application
│
├── Chat
│
├── Prompt Templates
│
├── Structured Output
│
├── Conversation Memory
│
├── Advisors
│
├── AI Tools
│
├── RAG
│
└── Multimodal AI
```

These features can be added incrementally using Spring AI.

---

# 🤝 Contributing

Contributions are welcome!

If you find a bug, have an improvement, or want to add another Spring AI/Gemini example, feel free to open an issue or submit a pull request.

### 1. Fork the Project

Fork the repository on GitHub.

### 2. Create a Feature Branch

```bash
git checkout -b feature/AmazingFeature
```

### 3. Commit Your Changes

```bash
git add .
git commit -m "Add AmazingFeature"
```

### 4. Push the Branch

```bash
git push origin feature/AmazingFeature
```

### 5. Open a Pull Request

Create a pull request against the main repository.

---

# 📖 Documentation

Complete project documentation is available through GitHub Pages:

**GeminiSpringBootIntegration Documentation**

https://dinesh-veer.github.io/GeminiSpringBootIntegration/

The documentation covers:

* Getting Started
* Architecture
* Gemini Chat
* Configuration
* Examples
* Troubleshooting

---

# 🔗 Repository

**GitHub Repository**

https://github.com/dinesh-veer/GeminiSpringBootIntegration

---

# 👨‍💻 Author

**Dinesh Veer**

GitHub:

https://github.com/dinesh-veer

---

# 📄 License

This project is open source and available under the **MIT License**.

See the [LICENSE](./LICENSE) file for details.

---

⭐ If this project helps you understand **Spring AI + Google Gemini integration**, consider giving the repository a star!
