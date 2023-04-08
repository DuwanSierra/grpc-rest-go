package com.grpc.microservicea.infrastructure.grpc;

import com.grpc.microservicea.dto.remotes.BotanicSpecieRequest;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
public interface IBotanicSpeciesGrpcRemote {
    Mono<List<BotanicSpecieRequest>> getAllBotanicSpecies(long size);
}
