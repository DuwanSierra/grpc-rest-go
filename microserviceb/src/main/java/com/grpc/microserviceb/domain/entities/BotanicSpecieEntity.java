package com.grpc.microserviceb.domain.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "botanicspecies")
@AllArgsConstructor
@Data
@NoArgsConstructor
public class BotanicSpecieEntity {
    @Id
    private String id;
    private Group group;
    private String family;
    private String scientificName;
    private EndemismForColombia endemismForColombia;
    private ThreatenedStatus threatenedStatus;
    private String nativeOfColombia;
    private String specimenRepresentative;
}
