package mongocustomclient

import (
	"context"
	"log"
	"os"

	"github.com/joho/godotenv"
	"go.mongodb.org/mongo-driver/mongo"
	"go.mongodb.org/mongo-driver/mongo/options"
)

var collection *mongo.Collection
var ctx = context.TODO()
var mongoClient *mongo.Client

func goDotEnvVariable(key string) string {
	err := godotenv.Load(".env")

	if err != nil {
		panic("Error loading .env file")
	}

	return os.Getenv(key)
}

func InitMongoClient() {
	conn := goDotEnvVariable("MONGO_ADDRESS")
	clientOptions := options.Client().ApplyURI(conn)
	mongoClient, err := mongo.Connect(ctx, clientOptions)
	if err != nil {
		log.Fatal(err)
	}

	err = mongoClient.Ping(ctx, nil)
	if err != nil {
		log.Fatal(err)
	}

	collection = mongoClient.Database("tasker").Collection("tasks")
	return mongoClient
}
