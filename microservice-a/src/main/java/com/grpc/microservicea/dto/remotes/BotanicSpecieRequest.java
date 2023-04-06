package com.grpc.microservicea.dto.remotes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor()
@NoArgsConstructor()
@Data
public class BotanicSpecieRequest {
    private Grupo grupo;
    private String familia;
    private String nombreCientifico;
    private EndemismoParaColombia endemismoParaColombia;
    private EstadoDeAmenaza estadoDeAmenaza;
    private String nativaDeColombia;
    private String espcimenRepresentativo; 
}
