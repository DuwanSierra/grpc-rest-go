package main

import (
	"github.com/DuwanSierra/grpc-rest-go/microservice-b/controllers/companies_controller"
	"github.com/DuwanSierra/grpc-rest-go/microservice-b/infrastructure/mongocustomclient"
	"github.com/gin-gonic/gin"
)

/**
 * this function is used to configure routes
 */
func configureRoutes(engine *gin.Engine) *gin.Engine {
	router := gin.Default()
	router.GET("/companies", companies_controller.GetCompanies)
	return router
}

func main() {
	mongocustomclient.InitMongoClient()
	engine := gin.New()
	engine = configureRoutes(engine)
	engine.Use(gin.Recovery())
	engine.Run(":30")
}
