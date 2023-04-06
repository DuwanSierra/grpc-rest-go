package com.grpc.microservicea.infrastructure.services;

import java.util.List;

import org.springframework.stereotype.Service;
import com.grpc.microservicea.dto.remotes.BotanicSpecieRequest;

import reactor.core.publisher.Mono;

@Service
public interface IBotanicSpeciesRemote {
    Mono<List<BotanicSpecieRequest>> getAllBotanicSpecies(long size);
}
