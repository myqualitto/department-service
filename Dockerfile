FROM openjdk:8
EXPOSE 9091
ADD target/techhmr-departmentservice.jar techhmr-departmentservice.jar
ENTRYPOINT ["java","-jar","/techhmr-departmentservice.jar"]