package com.grpc.microserviceb.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.grpc.microserviceb.domain.commands.ICreateManyBotanicalSpeciesCommand;
import com.grpc.microserviceb.domain.dto.BotanicSpecieDTO;
import com.grpc.microserviceb.domain.queries.IFindBotanicSpeciesQuery;

import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/botanical-species")
public class BotanicSpecies {

    private final IFindBotanicSpeciesQuery findBotanicSpeciesQuery;
    private final ICreateManyBotanicalSpeciesCommand createManyBotanicalSpeciesCommand;
    public BotanicSpecies(@Autowired() IFindBotanicSpeciesQuery findBotanicSpeciesQuery , @Autowired() ICreateManyBotanicalSpeciesCommand createManyBotanicalSpeciesCommand) {
        this.findBotanicSpeciesQuery = findBotanicSpeciesQuery;
        this.createManyBotanicalSpeciesCommand = createManyBotanicalSpeciesCommand;
    }
    
    @GetMapping
    public Flux<ArrayList<BotanicSpecieDTO>> getAllSpecies(@RequestParam(required = true) int size) throws InterruptedException {
        return findBotanicSpeciesQuery.findAll(size);
    }

    @PostMapping
    public Flux<ArrayList<BotanicSpecieDTO>> saveAllSpecies(@RequestBody ArrayList<BotanicSpecieDTO> save) throws InterruptedException {
        return createManyBotanicalSpeciesCommand.saveAll(save);
    }
}
