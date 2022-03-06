package com.cleverlance.academy.aggregator.controller.mapper;

import com.cleverlance.academy.aggregator.model.Adress;
import com.cleverlance.academy.aggregator.model.Identification;
import com.cleverlance.academy.aggregator.model.Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IdentificationMapperTest {

    private static final IdentificationMapper MAPPER= Mappers.getMapper(IdentificationMapper.class);

    @Test
    void toIdentification(){

        Identification identification = new Identification("mojeMeteostanice",
                new Adress("Danci", "2556/60", "Ricany"), new Person("Katerina", "Remesova");
        org.openapitools.model.Identification converted = MAPPER.toIdentification(Identification);

    }

}