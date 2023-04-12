FROM openjdk:17-jdk-slim-buster AS builder
WORKDIR /app

COPY ./microservicea/build/libs/ /app/build/libs/
# lightweight image
FROM openjdk:17-jdk-slim-buster

# Copy from builder folder
COPY --from=builder /app/build/libs/microservicea-0.0.1-SNAPSHOT.jar /app/microservicea-0.0.1-SNAPSHOT.jar

ARG MICROSERVICEB_REST_URL
ENV MICROSERVICEB_REST_URL $MICROSERVICEB_REST_URL

ARG MICROSERVICEB_GRPC_URL
ENV MICROSERVICEB_GRPC_URL $MICROSERVICEB_GRPC_URL


# expose port 8080 REST
EXPOSE 8080

# expose port 9090 gRPC
EXPOSE 9090

WORKDIR /app
ENTRYPOINT java -Dspring.profiles.active=prod -jar microservicea-0.0.1-SNAPSHOT.jar