package com.grpc.microservicea.infrastructure.grpc;

import com.google.common.util.concurrent.ListenableFuture;
import com.grpc.grpcinterface.BotanicSpeciesGrpcServiceGrpc;
import com.grpc.grpcinterface.BotanicSpeciesRequest;
import com.grpc.grpcinterface.BotanicSpeciesResponse;
import com.grpc.microservicea.dto.remotes.BotanicSpecieRequest;
import com.grpc.microservicea.dto.remotes.EndemismoParaColombia;
import com.grpc.microservicea.dto.remotes.EstadoDeAmenaza;
import com.grpc.microservicea.dto.remotes.Grupo;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Service
public class BotanicSpeciesGrpcRemote implements IBotanicSpeciesGrpcRemote{

    Logger logger = LoggerFactory.getLogger(BotanicSpeciesGrpcRemote.class);
    @GrpcClient("microservice-a")
    private BotanicSpeciesGrpcServiceGrpc.BotanicSpeciesGrpcServiceStub botanicSpeciesGrpcServiceStub;
    @Override
    public Mono<List<BotanicSpecieRequest>> getAllBotanicSpecies(long size) {
        return Mono.create(res -> {
            try{
                BotanicSpeciesRequest request = BotanicSpeciesRequest.newBuilder().setSize(size).build();
                ArrayList<BotanicSpecieRequest> list = new ArrayList<>();
                long start = System.nanoTime();
                botanicSpeciesGrpcServiceStub.getAllBotanicalSpecies(request, new StreamObserver<BotanicSpeciesResponse>() {
                    @Override
                    public void onNext(BotanicSpeciesResponse value) {
                        value.getSpeciesList().forEach((specie -> {
                            BotanicSpecieRequest item = new BotanicSpecieRequest();
                            item.setFamilia(specie.getFamilia());
                            item.setEspcimenRepresentativo(specie.getEspecimenRepresentativo());
                            item.setNativaDeColombia(specie.getNativaDeColombia());
                            item.setNombreCientifico(specie.getNombreCientifico());
                            try {
                                if(!specie.getEstadoDeAmenaza().isEmpty() && EstadoDeAmenaza.forValue(specie.getEstadoDeAmenaza()) != null){
                                    item.setEstadoDeAmenaza(EstadoDeAmenaza.forValue(specie.getEstadoDeAmenaza()));
                                }
                                item.setGrupo(Grupo.forValue(specie.getGrupo()));
                                item.setEndemismoParaColombia(EndemismoParaColombia.forValue(specie.getEndemismoParaColombia()));
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                            list.add(item);
                        }));

                    }

                    @Override
                    public void onError(Throwable t) {
                        res.error(t);
                    }

                    @Override
                    public void onCompleted() {
                        long elapsedTime = System.nanoTime() - start;
                        float milliseconds = TimeUnit.MILLISECONDS.convert(elapsedTime, TimeUnit.NANOSECONDS);
                        logger.info("Completed GRPC: "+milliseconds+" ms");
                        res.success(list);
                    }
                });
            } catch (Exception e) {
                res.error(e);
            }
        });
    }
}
