# proyecto-integrador-backend
Springboot Back End Proyecto Integrador

## Requirements
- Java 21 or higher
- Gradle 7.0 or higher

## Getting Started

1. **Clone the repository**:
   ```sh
   git clone git@github.com:santiago-mejia-dt/proyecto-integrador-backend.git
   cd proyecto-integrador-backend
    ```
2. **Build the project**:
    ```sh
    ./gradlew clean build
    ```
3. **Run the application:**:
    ```sh
    ./gradlew bootRun
    ```
## API Documentation

### Question API
Forwards a question to an external service running on port 8000.

#### Request:
- Method: POST
- URL: http://localhost:8080/api/question
- Method: POST 
  - Headers:
    Content-Type: application/json
- Body:
  ```json
  {
    "question": "Cual es el concepto de trabajo?"
  }
  ```
#### Response:
- Status: 200 OK
- Content: 
  ```json
  {
    "answer": "Texto con la respuesta",
    "context": [
        "texto 1 ...",
        "texto 2 ...",
        "texto 3 ...",
        "texto 4 ..."
    ]
  }
   ```
#### Test with cURL

```sh
curl -X POST \
http://localhost:8080/api/question \
-H 'Content-Type: application/json' \
-d '{"question": "Cual es el concepto de trabajo?"}'
```

#### Test with Postman

- Open Postman
- Create a new POST request to http://localhost:8080/api/question
- Add header Content-Type: application/json
- In the Body tab:
  - Select raw
  - Choose JSON
  - Enter request body
- Click Send

### Monitoring

The application exposes the following Actuator endpoints:  
- Health check: http://localhost:8080/actuator/health
- Application info: http://localhost:8080/actuator/info
- Application metrics: http://localhost:8080/actuator/metrics
- Environment details: http://localhost:8080/actuator/env

These endpoints can be accessed via browser or any HTTP client.