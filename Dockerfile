FROM openjdk:8-jdk-alpine
Run addgroup -S spring && adduser -S spring -G spring
User spring:spring
ARG JAR_FILE=target/*.jar
Copy ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]