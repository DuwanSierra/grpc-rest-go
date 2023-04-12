FROM openjdk:17-jdk-slim-buster AS builder
WORKDIR /app

COPY ./microserviceb/build/libs/ ./build/libs/
# lightweight image
FROM openjdk:17-jdk-slim-buster

# Copy from builder folder
COPY --from=builder /app/build/libs/microserviceb-0.0.1-SNAPSHOT.jar /app/microserviceb-0.0.1-SNAPSHOT.jar

ARG MONGO_CONNECTION_STRING
ENV MONGO_CONNECTION_STRING $MONGO_CONNECTION_STRING


# expose port 8080 REST
EXPOSE 8081

# expose port 9090 gRPC
EXPOSE 9091

WORKDIR /app
ENTRYPOINT java -Dspring.profiles.active=prod -jar microserviceb-0.0.1-SNAPSHOT.jar