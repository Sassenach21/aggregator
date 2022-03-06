package com.cleverlance.academy.aggregator.controller.mapper;

import com.cleverlance.academy.aggregator.model.Adress;
import com.cleverlance.academy.aggregator.model.Identification;
import org.springframework.web.bind.annotation.Mapping;

@Mapper
public interface IdentificationMapper {

    Identification toIdentification(com.cleverlance.academy.aggregator.model.Identification identification);

    @Mapping(target="adress.streetNumber", source = "adress.number" )
    Adress toAdress();

}
