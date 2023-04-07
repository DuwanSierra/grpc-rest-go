package com.grpc.microserviceb.domain.commands;

import java.io.IOException;
import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.grpc.microserviceb.domain.dto.BotanicSpecieDTO;

import reactor.core.publisher.Flux;

@Service
public interface ICreateManyBotanicalSpeciesCommand {
    Flux<ArrayList<BotanicSpecieDTO>> saveAll(ArrayList<BotanicSpecieDTO> speciesSave);
}
