# Kafkaesque

A repo to learn the basics of Confluent Kafka on local machine using Docker Image. 

## Installation and Usage Steps

1. Install docker and run the following to start the local kafka instance:

```bash
docker-compose up -d
```
2. Use the following commands to enter the instance:
(Use docker ps to get the container-id for Kafka Instance)

```bash
docker ps
docker exec -it <conatiner-id> /bin/bash
```

3. Create a topic called "franz-kafka" using:
```bash
kafka-topics --bootstrap-server localhost:9092 --create --topic franz-kafka --partitions 3 --replication-factor 1
```

4. Run the Java application with Java 17 (or later)

5. Use postman or similar application to make requests:
```
GET http://localhost:8080/api/kafka/consume
POST http://localhost:8080/api/kafka/publish?message=HelloWorld
```

## Demo
DemoVideo/Kafkaesqued.mov