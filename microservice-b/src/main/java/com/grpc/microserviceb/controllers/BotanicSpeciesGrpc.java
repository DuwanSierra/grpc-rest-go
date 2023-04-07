package com.grpc.microserviceb.controllers;

import net.devh.boot.grpc.server.service.GrpcService;
import com.grpc.grpcinterface.grpc.BotanicalSpeciesGrpcServiceGrpc;

@GrpcService
public class BotanicSpeciesGrpc extends BotanicalSpeciesGrpcServiceGrpc.BotanicSpeciesImplBase {
    
}
