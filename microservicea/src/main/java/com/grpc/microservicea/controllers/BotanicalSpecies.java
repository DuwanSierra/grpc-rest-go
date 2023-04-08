package com.grpc.microservicea.controllers;

import java.util.concurrent.TimeUnit;

import com.grpc.microservicea.infrastructure.grpc.IBotanicSpeciesGrpcRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.grpc.microservicea.dto.PerformanceResponse;
import com.grpc.microservicea.infrastructure.services.IBotanicSpeciesRemote;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/botanical-species")
public class BotanicalSpecies {
    private final IBotanicSpeciesRemote botanicSpeciesRemote;
    private final IBotanicSpeciesGrpcRemote botanicSpeciesGrpcRemote;

    public BotanicalSpecies(@Autowired() IBotanicSpeciesRemote botanicSpeciesRemote, @Autowired() IBotanicSpeciesGrpcRemote botanicSpeciesGrpcRemote) {
        this.botanicSpeciesRemote = botanicSpeciesRemote;
        this.botanicSpeciesGrpcRemote = botanicSpeciesGrpcRemote;
    }
    @GetMapping
    public Mono<PerformanceResponse> getAllSpecies(@RequestParam(required = true) int size) {
        long start = System.nanoTime();    
        return botanicSpeciesRemote.getAllBotanicSpecies(size).flatMap(res -> {
            long elapsedTime = System.nanoTime() - start;
            float seconds = TimeUnit.MILLISECONDS.convert(elapsedTime, TimeUnit.NANOSECONDS);
            return Mono.just(new PerformanceResponse(seconds, res.size()));
        });
    }

    @GetMapping("/grpc")
    public Mono<PerformanceResponse> getAllSpeciesGrpc(@RequestParam(required = true) int size) {
        long start = System.nanoTime();
        return botanicSpeciesGrpcRemote.getAllBotanicSpecies(size).flatMap(res -> {
            long elapsedTime = System.nanoTime() - start;
            float seconds = TimeUnit.MILLISECONDS.convert(elapsedTime, TimeUnit.NANOSECONDS);
            return Mono.just(new PerformanceResponse(seconds, res.size()));
        });
    }
}
