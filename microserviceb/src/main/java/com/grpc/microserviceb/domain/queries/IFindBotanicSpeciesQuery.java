package com.grpc.microserviceb.domain.queries;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.grpc.microserviceb.domain.dto.BotanicSpecieDTO;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public interface IFindBotanicSpeciesQuery {
    Mono<ArrayList<BotanicSpecieDTO>> findAll(int size);
}
