#use an official OpenJDK runtime as a base image
FROM openjdk:17
#copy the built JAR file into container
COPY target/sbhello.jar sbhello.jar
#application port
EXPOSE 8085
#command to run the application
ENTRYPOINT ["java", "-jar", "/sbhello.jar"]