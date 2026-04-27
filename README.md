# java-demo

A small Spring Boot demo service for Java integration testing and Docker deployment practice.

## API

```text
GET /health
```

Response:

```json
{"status":"ok"}
```

```text
GET /api/message
```

Response:

```json
{"message":"Hello from Java demo"}
```

## Local workflow

Resolve dependencies:

```bash
mvn dependency:resolve
```

Run tests:

```bash
mvn test
```

Run the application:

```bash
mvn spring-boot:run
```

The service listens on port `8080` by default.

## Docker workflow

Build the image:

```bash
docker build -t java-demo .
```

Run the container:

```bash
docker run -d --name java-demo -p 8081:8080 java-demo
```

Check the container status:

```bash
docker inspect -f "{{.State.Running}}" java-demo
```

Test the endpoints:

```bash
curl http://localhost:8081/health
curl http://localhost:8081/api/message
```
