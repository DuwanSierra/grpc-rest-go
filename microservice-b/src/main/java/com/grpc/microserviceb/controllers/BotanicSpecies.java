package com.grpc.microserviceb.controllers;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grpc.microserviceb.dto.BotanicSpecieDTO;

import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/botanical-species")
public class BotanicSpecies {
    @GetMapping
    public Flux<ArrayList<BotanicSpecieDTO>> getAllEmployees() throws InterruptedException {
        ArrayList<BotanicSpecieDTO> list = new ArrayList<BotanicSpecieDTO>();
        return Flux.just(list);
    }
}
