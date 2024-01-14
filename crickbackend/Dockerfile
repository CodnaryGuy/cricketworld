FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY target/*.jar crickbackend.jar
ENTRYPOINT ["java","-jar","/crickbackend.jar"]
EXPOSE 8080