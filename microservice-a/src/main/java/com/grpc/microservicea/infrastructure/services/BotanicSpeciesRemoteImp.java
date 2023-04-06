package com.grpc.microservicea.infrastructure.services;

import java.time.Duration;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.grpc.microservicea.dto.remotes.BotanicSpecieRequest;

import reactor.core.publisher.Mono;

@Service
public class BotanicSpeciesRemoteImp implements IBotanicSpeciesRemote {

    private final WebClient microserviceBClient;

    public BotanicSpeciesRemoteImp(@Autowired() WebClient microserviceBClient) {
        this.microserviceBClient = microserviceBClient;
    }

    @Override
    public Mono<List<BotanicSpecieRequest>> getAllBotanicSpecies(long size) {
        
        return microserviceBClient.get()
        .uri("/botanical-species?size=" + size)
        .retrieve()
        .bodyToFlux(BotanicSpecieRequest.class).collectList();
    }
    
}
