# Demo Producer

## Getting Started

Start RabbitMQ with Docker
```
docker run -d -p 5672:5672 -p 15672:15672 --name my-rabbit rabbitmq:3-management
```

Start this application:
```
mvn clean package
java -jar ./target/demo-producer-0.0.1-SNAPSHOT.jar
```