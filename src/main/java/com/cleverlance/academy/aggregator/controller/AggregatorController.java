package com.cleverlance.academy.aggregator.controller;

import com.cleverlance.academy.aggregator.model.Adress;
import com.cleverlance.academy.aggregator.model.Identification;
import com.cleverlance.academy.aggregator.model.Person;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AggregatorController {

    @GetMapping(path = "/identification")
    public ResponseEntity<Identification> getIdentification(){
        return ResponseEntity.ok(new Identification("mojeMeteostanice",
                new Adress("Danci", "2556/60", "Ricany"), new Person("Katerina", "Remesovax")));
    }
}
