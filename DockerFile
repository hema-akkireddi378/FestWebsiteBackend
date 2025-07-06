# Step 1: Use an official Maven image to build the app
FROM maven:3.9.6-eclipse-temurin-21 AS build

# Set working directory
WORKDIR /app

# Copy pom.xml and download dependencies
COPY pom.xml .

RUN mvn dependency:go-offline

# Copy all source files
COPY . .

# Package the application
RUN mvn clean package -DskipTests

# Step 2: Use a lightweight JRE to run the app
FROM eclipse-temurin:21-jre

WORKDIR /app

# Copy built jar from builder
COPY --from=build /app/target/*.jar app.jar

# Set the entry point
ENTRYPOINT ["java", "-jar", "app.jar"]
