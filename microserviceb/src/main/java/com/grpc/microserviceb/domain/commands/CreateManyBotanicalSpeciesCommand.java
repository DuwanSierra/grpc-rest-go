package com.grpc.microserviceb.domain.commands;

import java.io.IOException;
import java.util.ArrayList;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.grpc.microserviceb.domain.dto.BotanicSpecieDTO;
import com.grpc.microserviceb.domain.entities.BotanicSpecieEntity;
import com.grpc.microserviceb.domain.entities.EndemismForColombia;
import com.grpc.microserviceb.domain.entities.Group;
import com.grpc.microserviceb.domain.entities.ThreatenedStatus;
import com.grpc.microserviceb.infrastructure.BotanicSpecie.IBotanicSpecieRepository;

import reactor.core.publisher.Flux;

@Service
public class CreateManyBotanicalSpeciesCommand implements ICreateManyBotanicalSpeciesCommand {

    private final IBotanicSpecieRepository botanicSpecieRepository;

    public CreateManyBotanicalSpeciesCommand(IBotanicSpecieRepository botanicSpecieRepository) {
        this.botanicSpecieRepository = botanicSpecieRepository;
    }

    @Override
    public Flux<ArrayList<BotanicSpecieDTO>> saveAll(ArrayList<BotanicSpecieDTO> speciesSave) {
        try{
            ArrayList<BotanicSpecieEntity> speciesEntities = new ArrayList<BotanicSpecieEntity>();
            for (BotanicSpecieDTO specie : speciesSave) {
                BotanicSpecieEntity entity = new BotanicSpecieEntity();
                entity.setFamily(specie.getFamilia());
                entity.setGroup(Group.forValue(specie.getGrupo().toValue()));
                entity.setNativeOfColombia(specie.getNativaDeColombia());
                entity.setScientificName(specie.getNombreCientifico());
                entity.setSpecimenRepresentative(specie.getEspecimenRepresentativo());
                entity.setEndemismForColombia(EndemismForColombia.forValue(specie.getEndemismoParaColombia().toValue()));
                if(specie.getEstadoDeAmenaza() != null){
                    entity.setThreatenedStatus(ThreatenedStatus.forValue(specie.getEstadoDeAmenaza().toValue()));
                }
                entity.setId(UUID.randomUUID().toString());
                speciesEntities.add(entity);
            }
            botanicSpecieRepository.saveAll(speciesEntities).subscribe((res)->{
                System.out.println(res);
                Flux.just(speciesSave);
            });
        }
        catch(Exception e){
            throw new RuntimeException(e);
        }
        return Flux.just(speciesSave);
    }
    
}
