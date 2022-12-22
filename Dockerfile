# Build step, where we copy our code to the image and build our service application
FROM maven:3.6.3-openjdk-17 AS build

WORKDIR /app
COPY . /app
RUN mvn clean package -DskipTests

# Copy jar from build image to production image for running application
FROM openjdk:17
WORKDIR /app
COPY --from=build /app/target/demo-producer-0.0.1-SNAPSHOT.jar /app
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app/demo-producer-0.0.1-SNAPSHOT.jar"]