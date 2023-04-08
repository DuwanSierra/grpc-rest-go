package com.grpc.microserviceb.controllers;


import com.grpc.grpcinterface.BotanicSpeciesDto;
import com.grpc.grpcinterface.BotanicSpeciesGrpcServiceGrpc.BotanicSpeciesGrpcServiceImplBase;
import com.grpc.grpcinterface.BotanicSpeciesRequest;
import com.grpc.grpcinterface.BotanicSpeciesResponse;
import com.grpc.microserviceb.domain.dto.Grupo;
import com.grpc.microserviceb.domain.queries.IFindBotanicSpeciesQuery;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

@GrpcService
public class BotanicSpeciesGrpc extends BotanicSpeciesGrpcServiceImplBase {

    private final IFindBotanicSpeciesQuery findBotanicSpeciesQuery;
    public BotanicSpeciesGrpc(@Autowired() IFindBotanicSpeciesQuery findBotanicSpeciesQuery) {
        super();
        this.findBotanicSpeciesQuery = findBotanicSpeciesQuery;
    }
    @Override
    public void getAllBotanicalSpecies(BotanicSpeciesRequest request, StreamObserver<BotanicSpeciesResponse> responseObserver) {
        // this method iterates response and generate a response for each element
        findBotanicSpeciesQuery.findAll((int) request.getSize()).subscribe(botanicSpecies -> {
            try {
                botanicSpecies.forEach(botanicSpecie -> {
                    BotanicSpeciesDto.Builder botanicSpeciesDto = BotanicSpeciesDto.newBuilder();
                    botanicSpeciesDto.setNombreCientifico(botanicSpecie.getNombreCientifico());
                    botanicSpeciesDto.setFamilia(botanicSpecie.getFamilia());
                    botanicSpeciesDto.setGrupo(botanicSpecie.getGrupo().toValue());
                    botanicSpeciesDto.setEndemismoParaColombia(botanicSpecie.getEndemismoParaColombia().toValue());
                    botanicSpeciesDto.setEspecimenRepresentativo(botanicSpecie.getEspecimenRepresentativo());
                    try{
                        if(botanicSpecie.getEstadoDeAmenaza() != null){
                            botanicSpeciesDto.setEstadoDeAmenaza(botanicSpecie.getEstadoDeAmenaza().toValue());
                        }
                        if(botanicSpecie.getNativaDeColombia() != null){
                            botanicSpeciesDto.setNativaDeColombia(botanicSpecie.getNativaDeColombia());
                        }
                    }
                    catch (Exception e) {
                        e.printStackTrace();
                    }
                    responseObserver.onNext(BotanicSpeciesResponse.newBuilder().addSpecies(botanicSpeciesDto).build());
                });
                responseObserver.onCompleted();
            }
            catch (Exception e) {
                responseObserver.onError(e);
            }
        });

    }
}
