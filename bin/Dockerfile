FROM openjdk:21-jdk
WORKDIR /app
COPY . .
RUN chmod +x mvnw && ./mvnw clean package
EXPOSE 8080
CMD ["java","-jar","target/challenge-0.0.1-SNAPSHOT.jar"]

