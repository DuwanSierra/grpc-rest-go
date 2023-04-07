package com.grpc.microserviceb.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor()
@NoArgsConstructor()
@Data
public class BotanicSpecieDTO {
    private Grupo grupo;
    private String familia;
    private String nombreCientifico;
    private EndemismoParaColombia endemismoParaColombia;
    private EstadoDeAmenaza estadoDeAmenaza;
    private String nativaDeColombia;
    private String especimenRepresentativo; 
}
