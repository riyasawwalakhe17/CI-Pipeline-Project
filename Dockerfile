FROM openjdk:17.0.1-jdk-slim

WORKDIR /app

COPY target/CI-Pipeline-Project-0.0.2-SNAPSHOT.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]