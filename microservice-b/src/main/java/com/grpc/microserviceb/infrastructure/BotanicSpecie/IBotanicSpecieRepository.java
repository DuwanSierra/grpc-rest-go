package com.grpc.microserviceb.infrastructure.BotanicSpecie;

import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.grpc.microserviceb.domain.entities.BotanicSpecieEntity;

import reactor.core.publisher.Flux;



@Repository
public interface IBotanicSpecieRepository extends ReactiveMongoRepository<BotanicSpecieEntity, String>{
    Flux<BotanicSpecieEntity> findByIdNotNull(Pageable pageable);
}
