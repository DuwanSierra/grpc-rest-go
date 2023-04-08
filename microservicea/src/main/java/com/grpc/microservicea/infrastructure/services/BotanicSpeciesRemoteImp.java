package com.grpc.microservicea.infrastructure.services;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import com.grpc.microservicea.infrastructure.grpc.BotanicSpeciesGrpcRemote;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.grpc.microservicea.dto.remotes.BotanicSpecieRequest;

import reactor.core.publisher.Mono;

@Service
public class BotanicSpeciesRemoteImp implements IBotanicSpeciesRemote {

    private final WebClient microserviceBClient;
    Logger logger = LoggerFactory.getLogger(BotanicSpeciesRemoteImp.class);

    public BotanicSpeciesRemoteImp(@Autowired() WebClient microserviceBClient) {
        this.microserviceBClient = microserviceBClient;
    }

    @Override
    public Mono<List<BotanicSpecieRequest>> getAllBotanicSpecies(long size) {
        long start = System.nanoTime();
        return microserviceBClient.get()
        .uri("/botanical-species?size=" + size)
        .retrieve()
        .bodyToMono(new ParameterizedTypeReference<List<BotanicSpecieRequest>>() {})
                .doOnSuccess(res -> {
                    long elapsedTime = System.nanoTime() - start;
                    float milliseconds = TimeUnit.MILLISECONDS.convert(elapsedTime, TimeUnit.NANOSECONDS);
                    logger.info("Completed REST: "+milliseconds+" ms");
        });
    }
    
}
