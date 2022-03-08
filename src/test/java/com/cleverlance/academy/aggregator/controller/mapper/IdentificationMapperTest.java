package com.cleverlance.academy.aggregator.controller.mapper;

import com.cleverlance.academy.aggregator.model.Adress;
import com.cleverlance.academy.aggregator.model.Identification;
import com.cleverlance.academy.aggregator.model.Person;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

import static org.junit.jupiter.api.Assertions.*;

class IdentificationMapperTest {

    private static final IdentificationMapper MAPPER= Mappers.getMapper(IdentificationMapper.class);

    @Test
    void toIdentification(){

        Identification identification = new Identification("Moje meteostanice",
                new Adress("Danci", "2556/60", "Ricany"),
                new Person("Katerina", "Remesova", "kkk@gmail.com", "FEMALE"));

        Identification converted = MAPPER.toIdentification(identification);

        assertEquals("Moje meteostanice", converted.getName());
        assertEquals("Danci", converted.getAdress().getStreet());
        assertEquals("2556/60", converted.getAdress().getNumber());
        assertEquals("Ricany", converted.getAdress().getCity());
        assertEquals("Katerina", converted.getOwner().getFirstName());
        assertEquals("Remesova", converted.getOwner().getLastName());
        assertEquals("kkk", converted.getOwner().getEmail());
        assertEquals("f", converted.getOwner().getGender() );
    }

}