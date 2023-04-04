package main

import (
	"os"

	"github.com/DuwanSierra/grpc-rest-go/microservice-b/controllers/companies_controller"
	"github.com/gin-gonic/gin"
	"github.com/joho/godotenv"
)

func goDotEnvVariable(key string) string {
	err := godotenv.Load(".env")

	if err != nil {
		panic("Error loading .env file")
	}

	return os.Getenv(key)
}

/**
 * this function is used to configure routes
 */
func configureRoutes(engine *gin.Engine) *gin.Engine {
	router := gin.Default()
	router.GET("/companies", companies_controller.GetCompanies)
	return router
}

func main() {
	conn := goDotEnvVariable("MONGO_ADDRESS")
	println(conn)

	engine := gin.New()
	engine = configureRoutes(engine)
	engine.Use(gin.Recovery())
	engine.Run(":30")
}
