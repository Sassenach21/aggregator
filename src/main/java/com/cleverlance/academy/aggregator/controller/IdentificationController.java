package com.cleverlance.academy.aggregator.controller;

import com.cleverlance.academy.aggregator.model.Adress;
import com.cleverlance.academy.aggregator.model.Identification;
import com.cleverlance.academy.aggregator.model.Person;
import com.cleverlance.academy.aggregator.service.IdentificationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IdentificationController implements IdentificationApi{

 private final IdentificationService identificationService;

    public IdentificationController(IdentificationService identificationService) {
        this.identificationService = identificationService;
    }

    public ResponseEntity<identification> getIdentification(){
        Identification identification  = this.identificationService.getIdentification( );
     return ResponseEntity.ok(new Identification()
             .name("Moje meteostanice")
             .owner(new Person().firstName("Jan").lastName("Novak"))
             .adress(new Adress().street("Hlavní").streetNumber("3").city("Praha")));
 }
}
