package com.grpc.microservicea.infrastructure.webclients;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.ExchangeStrategies;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class MicroserviceBRemoteClient {

    @Bean
    public WebClient microserviceBClient() {
        return WebClient
        .builder()
        .baseUrl("http://localhost:8081/")
        .exchangeStrategies(ExchangeStrategies
        .builder()
        .codecs(codecs -> codecs
            .defaultCodecs()
            .maxInMemorySize(1024 * 1024 * 1024))
        .build())
            .build();
    }
    
}
