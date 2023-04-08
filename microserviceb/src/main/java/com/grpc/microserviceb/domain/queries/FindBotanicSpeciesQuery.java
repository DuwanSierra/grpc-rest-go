package com.grpc.microserviceb.domain.queries;

import java.io.IOException;
import java.util.ArrayList;

import com.grpc.microserviceb.domain.dto.EndemismoParaColombia;
import com.grpc.microserviceb.domain.dto.EstadoDeAmenaza;
import com.grpc.microserviceb.domain.dto.Grupo;
import com.grpc.microserviceb.domain.entities.BotanicSpecieEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.grpc.microserviceb.domain.dto.BotanicSpecieDTO;
import com.grpc.microserviceb.infrastructure.BotanicSpecie.IBotanicSpecieRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class FindBotanicSpeciesQuery implements IFindBotanicSpeciesQuery{

    private final IBotanicSpecieRepository botanicSpecieRepository;

    public FindBotanicSpeciesQuery(@Autowired() IBotanicSpecieRepository botanicSpecieRepository) {
        this.botanicSpecieRepository = botanicSpecieRepository;
    }

    @Override
    public Mono<ArrayList<BotanicSpecieDTO>> findAll(int size) {
        Pageable pageable = PageRequest.ofSize(size);
        ArrayList<BotanicSpecieDTO> list = new ArrayList<>();
        return botanicSpecieRepository.findByIdNotNull(pageable).collectList().flatMap(botanicSpecies -> {
            botanicSpecies.forEach(botanicSpecie -> {
                list.add(Map(botanicSpecie));
            });
            return Mono.just(list);
        });
    }

    private BotanicSpecieDTO Map(BotanicSpecieEntity specie){
        BotanicSpecieDTO dto = new BotanicSpecieDTO();
        dto.setNombreCientifico(specie.getScientificName());
        dto.setFamilia(specie.getFamily());
        dto.setNativaDeColombia(specie.getNativeOfColombia());
        dto.setEspecimenRepresentativo(specie.getSpecimenRepresentative());
        try {
            if(specie.getGroup() != null){
                dto.setGrupo(Grupo.forValue(specie.getGroup().toValue()));
            }
            if(specie.getEndemismForColombia() != null){
                dto.setEndemismoParaColombia(EndemismoParaColombia.forValue(specie.getEndemismForColombia().toValue()));
            }
            if(specie.getThreatenedStatus() != null){
                dto.setEstadoDeAmenaza(EstadoDeAmenaza.forValue(specie.getThreatenedStatus().toValue()));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return dto;
    }
}
