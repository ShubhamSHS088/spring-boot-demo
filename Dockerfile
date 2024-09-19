FROM openjdk:22
EXPOSE 8080
COPY target/spring-boot-demo.jar .
ENTRYPOINT ["java", "-jar", "/spring-boot-demo.jar"]