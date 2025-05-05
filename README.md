# Streamflow Recommendation Service

A high-performance, scalable recommendation system built with Spring Boot and reactive technologies.

## Technology Stack

- Java 21
- Spring Boot (WebFlux)
- Apache Cassandra
- Apache Kafka
- Docker
- OpenAPI (Swagger)

## Project Structure

```
recommendation-service/
├── recommendation-service-core/     # Core business logic
├── recommendation-service-data/     # Data persistence layer
├── recommendation-service-api/      # REST API controllers
└── recommendation-service-kafka/    # Kafka event consumers
```

## Key Features

- Real-time user viewing event processing
- Non-blocking reactive API endpoints
- Precalculated recommendations storage
- Scalable event ingestion via Kafka
- Persistent storage with Cassandra

## Getting Started

### Prerequisites

- Docker
- Java 21
- Maven/Gradle

### Running Locally

1. Start dependencies:

```bash
docker-compose up -d
```

2. Build the application:

```bash
./mvnw clean install
```

3. Run the service:

```bash
./mvnw spring-boot:run
```

The API documentation will be available at: `http://localhost:8080/swagger-ui.html`

## API Endpoints

- `GET /users/{userId}/recommendations` - Retrieve recommendations for a user

## Development Phases

1. Initial Setup

   - Project structure and dependencies
   - Docker environment setup

2. Core Implementation

   - Recommendation logic
   - Data persistence
   - API development

3. Testing & Optimization
   - Unit and integration tests
   - Load testing
   - Performance optimization

## License

This project is licensed under the MIT License.
