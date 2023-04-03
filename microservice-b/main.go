package main

import (
	"os"

	"github.com/DuwanSierra/grpc-rest-go/microservice-b/infrastructure/databases/mongo"
	"github.com/gin-gonic/gin"
)

func main() {
	conn := os.Getenv("MONGO_ADDRESS")

	mongoClient, err := mongo.NewClient(conn)
	if err != nil {
		panic("Connection could not be established")
	}

	engine := gin.New()
	engine.Use(gin.Recovery())

	engine.Run(":30")
}
