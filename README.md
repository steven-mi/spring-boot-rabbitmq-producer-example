# Spring Boot RabbitMQ Producer Example

Example of a small Spring Boot service for publishing messages in JSON to RabbitMQ. Example utilises Docker & docker-compose. 

## Start with docker-compose
```bash
docker-compose up 
```

## Start without docker-compose

Start RabbitMQ:
```
docker run -d -p 5672:5672 -p 15672:15672 --name my-rabbit rabbitmq:3-management
```

Start this application:
```
mvn clean package
java -jar ./target/demo-producer-0.0.1-SNAPSHOT.jar
```
