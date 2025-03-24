#FROM eclipse-temurin:21
#LABEL authors="grisp"
#COPY target/DockerQAP-1.0-SNAPSHOT.jar app.jar
#ENTRYPOINT ["java","-jar","/app.jar"]
FROM eclipse-temurin:22
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]