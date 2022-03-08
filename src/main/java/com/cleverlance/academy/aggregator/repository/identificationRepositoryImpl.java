package com.cleverlance.academy.aggregator.repository;

import com.cleverlance.academy.aggregator.model.Adress;
import com.cleverlance.academy.aggregator.model.Identification;
import com.cleverlance.academy.aggregator.model.Person;
import org.springframework.stereotype.Component;

@Component
public class identificationRepositoryImpl implements IdentificationRepository{


    @Override
    public Identification getIdentification() {
        return new Identification("Moje meteostanice",
                new Adress("Hlavní", "3", "Praha"),
                new Person("Jan", "Novak", "kkkkk", "m"));
    }
}
