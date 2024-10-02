# Use an official OpenJDK runtime as a parent image
FROM openjdk:20-jdk-slim

# Set the working directory
WORKDIR /app

# Copy the JAR file from the build directory to the Docker image
COPY build/libs/DevopsHemsida-0.0.1-SNAPSHOT.jar app.jar

# Run the JAR file
ENTRYPOINT ["java", "-jar", "app.jar"]
