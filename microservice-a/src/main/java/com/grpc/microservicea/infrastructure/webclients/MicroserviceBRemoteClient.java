package com.grpc.microservicea.infrastructure.webclients;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class MicroserviceBRemoteClient {

    @Bean
    public WebClient microserviceBClient() {
        return WebClient.create("http://localhost:8081/");
    }
    
}
