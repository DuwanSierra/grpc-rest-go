package com.grpc.microservicea.controllers;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.grpc.microservicea.dto.PerformanceResponse;
import com.grpc.microservicea.infrastructure.services.IBotanicSpeciesRemote;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/botanical-species")
public class BotanicalSpecies {
    private final IBotanicSpeciesRemote botanicSpeciesRemote;

    public BotanicalSpecies(@Autowired() IBotanicSpeciesRemote botanicSpeciesRemote) {
        this.botanicSpeciesRemote = botanicSpeciesRemote;
    }
    @GetMapping
    public Mono<PerformanceResponse> getAllEmployees() {
        long start = System.nanoTime();    
        //This line when completed call at service return a Flux<BotanicSpecieRequest>
        return botanicSpeciesRemote.getAllBotanicSpecies(1000).flatMap(res -> {
            long elapsedTime = System.nanoTime() - start;
            float seconds = TimeUnit.SECONDS.convert(elapsedTime, TimeUnit.NANOSECONDS);
            return Mono.just(new PerformanceResponse(seconds));
        });
    }
}
