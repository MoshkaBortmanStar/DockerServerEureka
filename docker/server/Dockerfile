FROM adoptopenjdk/openjdk8:latest
EXPOSE 8080
ARG JAR_FILE=./EurekaServer-0.0.1-spring-boot.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]