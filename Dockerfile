FROM openjdk:8-jdk
RUN mkdir /app
WORKDIR /app
COPY target/docker-0.0.1-SNAPSHOT.jar /app
EXPOSE 8080

ENTRYPOINT ["java", "-jar", "docker-0.0.1-SNAPSHOT.jar"]