package com.grpc.microservicea.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor()
@NoArgsConstructor()
@Data()
public class PerformanceResponse {
    private float totalTime;
    private long totalItemsFound;
}
