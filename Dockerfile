FROM openjdk:8-jdk-alpine
EXPOSE 9091
COPY target/*.jar department-service.jar
ENTRYPOINT ["java","-jar","/department-service.jar"]
