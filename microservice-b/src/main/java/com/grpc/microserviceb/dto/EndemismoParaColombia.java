package com.grpc.microserviceb.dto;

import java.io.IOException;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum EndemismoParaColombia {
    DES, NO, SI;

    @JsonValue
    public String toValue() {
        switch (this) {
            case DES: return "DES";
            case NO: return "NO";
            case SI: return "SI";
        }
        return null;
    }

    @JsonCreator
    public static EndemismoParaColombia forValue(String value) throws IOException {
        if (value.equals("DES")) return DES;
        if (value.equals("NO")) return NO;
        if (value.equals("SI")) return SI;
        throw new IOException("Cannot deserialize EndemismoParaColombia");
    }
}
