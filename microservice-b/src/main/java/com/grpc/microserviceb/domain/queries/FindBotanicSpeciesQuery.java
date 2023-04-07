package com.grpc.microserviceb.domain.queries;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.grpc.microserviceb.domain.dto.BotanicSpecieDTO;
import com.grpc.microserviceb.infrastructure.BotanicSpecie.IBotanicSpecieRepository;

import reactor.core.publisher.Flux;

@Service
public class FindBotanicSpeciesQuery implements IFindBotanicSpeciesQuery{

    private final IBotanicSpecieRepository botanicSpecieRepository;

    public FindBotanicSpeciesQuery(@Autowired() IBotanicSpecieRepository botanicSpecieRepository) {
        this.botanicSpecieRepository = botanicSpecieRepository;
    }

    @Override
    public Flux<ArrayList<BotanicSpecieDTO>> findAll(int size) {
        Pageable pageable = PageRequest.ofSize(size);
        ArrayList<BotanicSpecieDTO> list = new ArrayList<BotanicSpecieDTO>();
        return botanicSpecieRepository.findByIdNotNull(pageable).flatMap((specie) -> {
            BotanicSpecieDTO dto = new BotanicSpecieDTO();
            dto.setNombreCientifico(specie.getScientificName());
            list.add(new BotanicSpecieDTO());
            return Flux.just(list);
        });
    }
    
}
