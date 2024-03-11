FROM openjdk:17-jdk-alpine

WORKDIR /app

COPY target/blog-backend-0.0.1-SNAPSHOT.jar .

CMD ["java", "-jar", "blog-backend-0.0.1-SNAPSHOT.jar"]
