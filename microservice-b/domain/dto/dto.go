package dto

type CompanyElement struct {
	No                        int64                 `json:"No."`
	Nit                       int64                 `json:"NIT"`
	RazonSocial               string                `json:"RAZON SOCIAL"`
	Supervisor                Supervisor            `json:"SUPERVISOR"`
	Región                    Región                `json:"REGIÓN"`
	DepartamentoDomicilio     DepartamentoDomicilio `json:"DEPARTAMENTO DOMICILIO"`
	CiudadDomicilio           string                `json:"CIUDAD DOMICILIO"`
	Ciiu                      string                `json:"CIIU"`
	Macrosector               Macrosector           `json:"MACROSECTOR"`
	IngresosOperacionales2018 float64               `json:"INGRESOS OPERACIONALES\n2018*"`
	GananciaPerdida2018       float64               `json:"GANANCIA (PERDIDA) 2018"`
	TotalActivos2018          float64               `json:"TOTAL ACTIVOS 2018"`
	TotalPasivos2018          float64               `json:"TOTAL PASIVOS 2018"`
	TotalPatrimonio2018       float64               `json:"TOTAL PATRIMONIO 2018"`
	IngresosOperacionales2017 float64               `json:"INGRESOS OPERACIONALES\n2017*"`
	GananciaPerdida2017       float64               `json:"GANANCIA (PERDIDA) 2017"`
	TotalActivos2017          float64               `json:"TOTAL ACTIVOS 2017"`
	TotalPasivos2017          float64               `json:"TOTAL PASIVOS 2017"`
	TotalPatrimonio2017       float64               `json:"TOTAL PATRIMONIO 2017"`
	GrupoEnNiif               GrupoEnNiif           `json:"GRUPO EN NIIF"`
}

type DepartamentoDomicilio string

const (
	Antioquia             DepartamentoDomicilio = "ANTIOQUIA"
	Atlantico             DepartamentoDomicilio = "ATLANTICO"
	BogotaDC              DepartamentoDomicilio = "BOGOTA D.C."
	Bolivar               DepartamentoDomicilio = "BOLIVAR"
	Boyaca                DepartamentoDomicilio = "BOYACA"
	Caldas                DepartamentoDomicilio = "CALDAS"
	Casanare              DepartamentoDomicilio = "CASANARE"
	Cauca                 DepartamentoDomicilio = "CAUCA"
	Cesar                 DepartamentoDomicilio = "CESAR"
	Choco                 DepartamentoDomicilio = "CHOCO"
	Cordoba               DepartamentoDomicilio = "CORDOBA"
	Cundinamarca          DepartamentoDomicilio = "CUNDINAMARCA"
	Guajira               DepartamentoDomicilio = "GUAJIRA"
	Huila                 DepartamentoDomicilio = "HUILA"
	Magdalena             DepartamentoDomicilio = "MAGDALENA"
	Meta                  DepartamentoDomicilio = "META"
	Nariño                DepartamentoDomicilio = "NARIÑO"
	NorteDeSantander      DepartamentoDomicilio = "NORTE DE SANTANDER"
	Quindio               DepartamentoDomicilio = "QUINDIO"
	Risaralda             DepartamentoDomicilio = "RISARALDA"
	SANAndresYProvidencia DepartamentoDomicilio = "SAN ANDRES Y PROVIDENCIA"
	Santander             DepartamentoDomicilio = "SANTANDER"
	Sucre                 DepartamentoDomicilio = "SUCRE"
	Tolima                DepartamentoDomicilio = "TOLIMA"
	Valle                 DepartamentoDomicilio = "VALLE"
)

type GrupoEnNiif string

const (
	NiifPlenasGrupo1     GrupoEnNiif = "NIIF PLENAS-GRUPO 1"
	NiifPymesGrupo2      GrupoEnNiif = "NIIF PYMES-GRUPO 2"
	REGIMENR414De2014CGN GrupoEnNiif = "REGIMEN R 414 de 2014 - CGN"
)

type Macrosector string

const (
	Agropecuario        Macrosector = "AGROPECUARIO"
	Comercio            Macrosector = "COMERCIO"
	Construcción        Macrosector = "CONSTRUCCIÓN"
	Manufactura         Macrosector = "MANUFACTURA"
	MineroHidrocarburos Macrosector = "MINERO-HIDROCARBUROS"
	Servicios           Macrosector = "SERVICIOS"
)

type Región string

const (
	BogotáCundinamarca Región = "Bogotá - Cundinamarca"
	CentroOriente      Región = "Centro - Oriente"
	CostaAtlántica     Región = "Costa Atlántica"
	CostaPacífica      Región = "Costa Pacífica"
	EjeCafetero        Región = "Eje Cafetero"
	Otros              Región = "Otros"
	REGIÓNAntioquia    Región = "Antioquia"
)

type Supervisor string

const (
	Superfinanciera Supervisor = "SUPERFINANCIERA"
	Supersalud      Supervisor = "SUPERSALUD"
	Superservicios  Supervisor = "SUPERSERVICIOS"
	Supersociedades Supervisor = "SUPERSOCIEDADES"
	Supervigilancia Supervisor = "SUPERVIGILANCIA"
)
