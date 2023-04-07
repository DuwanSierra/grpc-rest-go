package com.grpc.microserviceb.domain.dto;

import java.io.IOException;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum Grupo {
    ANGIOSPERMAS, GIMNOSPERMAS, LICOFITAS, PTERIDOFITAS;

    @JsonValue
    public String toValue() {
        switch (this) {
            case ANGIOSPERMAS: return "Angiospermas";
            case GIMNOSPERMAS: return "Gimnospermas";
            case LICOFITAS: return "Licofitas";
            case PTERIDOFITAS: return "Pteridofitas";
        }
        return null;
    }

    @JsonCreator
    public static Grupo forValue(String value) throws IOException {
        if (value.equals("Angiospermas")) return ANGIOSPERMAS;
        if (value.equals("Gimnospermas")) return GIMNOSPERMAS;
        if (value.equals("Licofitas")) return LICOFITAS;
        if (value.equals("Pteridofitas")) return PTERIDOFITAS;
        throw new IOException("Cannot deserialize Grupo");
    }
}