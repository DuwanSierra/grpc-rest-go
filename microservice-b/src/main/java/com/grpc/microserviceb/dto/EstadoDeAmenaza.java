package com.grpc.microserviceb.dto;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum EstadoDeAmenaza {
    CASI_AMENAZADA, DATOS_INSUFICIENTES, EN_PELIGRO, EN_PELIGRO_CRTICO, NO_EVALUADA, PREOCUPACIN_MENOR, VULNERABLE;

    @JsonValue
    public String toValue() {
        switch (this) {
            case CASI_AMENAZADA: return "Casi Amenazada";
            case DATOS_INSUFICIENTES: return "Datos insuficientes";
            case EN_PELIGRO: return "En Peligro";
            case EN_PELIGRO_CRTICO: return "En Peligro Cr\u00edtico";
            case NO_EVALUADA: return "No evaluada";
            case PREOCUPACIN_MENOR: return "Preocupaci\u00f3n menor";
            case VULNERABLE: return "Vulnerable";
        }
        return null;
    }

    @JsonCreator
    public static EstadoDeAmenaza forValue(String value) throws IOException {
        if (value.equals("Casi Amenazada")) return CASI_AMENAZADA;
        if (value.equals("Datos insuficientes")) return DATOS_INSUFICIENTES;
        if (value.equals("En Peligro")) return EN_PELIGRO;
        if (value.equals("En Peligro Cr\u00edtico")) return EN_PELIGRO_CRTICO;
        if (value.equals("No evaluada")) return NO_EVALUADA;
        if (value.equals("Preocupaci\u00f3n menor")) return PREOCUPACIN_MENOR;
        if (value.equals("Vulnerable")) return VULNERABLE;
        throw new IOException("Cannot deserialize EstadoDeAmenaza");
    }
}
