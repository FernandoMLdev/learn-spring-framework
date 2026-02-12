# Learn Spring Framework

## Overview
A Spring Boot 4.0.2 learning/demo project using Java and Maven. This is a console-only application (no web server) that starts, initializes the Spring context, and exits.

## Project Architecture
- **Language**: Java 19 (GraalVM CE 22.3.1)
- **Framework**: Spring Boot 4.0.2
- **Build Tool**: Maven (via Maven Wrapper `./mvnw`)
- **Project Layout**:
  - `src/main/java/com/spring/learn/learn_spring_framework/` - Main application code
  - `src/main/resources/` - Configuration files (application.properties)
  - `src/test/java/` - Test files
  - `pom.xml` - Maven project configuration

## How to Run
```bash
./mvnw spring-boot:run
```

## Recent Changes
- 2026-02-12: Initial import and setup for Replit environment. Adjusted Java version from 25 to 19 to match available toolchain.

## User Preferences
- None recorded yet.
