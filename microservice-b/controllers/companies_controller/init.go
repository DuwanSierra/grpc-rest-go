package companies_controller

import (
	"net/http"

	"github.com/gin-gonic/gin"
)

func GetCompanies(c *gin.Context) {
	c.IndentedJSON(http.StatusOK, gin.H{"message": "pong"})
}
