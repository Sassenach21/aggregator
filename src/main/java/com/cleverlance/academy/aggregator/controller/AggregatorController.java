package com.cleverlance.academy.aggregator.controller;

import com.cleverlance.academy.aggregator.model.Identification;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@RestController
public class AggregatorController {

/*    @GetMapping(path = "/identification")
    public ResponseEntity<Identification> getIdentification(){
        return ResponseEntity.ok(new Identification("mojeMeteostanice",
                new Adress("Danci", "2556/60", "Ricany"), new Person("Katerina", "Remesovax")));
    }*/

    private final List<Identification> identifications = new ArrayList<>();
    @PostMapping("/server")
    public ResponseEntity<Void>saveServer(@RequestBody Identification identification){
        log.info("Server identification: {}", identification);
        return ResponseEntity.ok().build();
    }

    @GetMapping(path = "/server")
    public ResponseEntity<List<Identification>> getIdentification(){
        return ResponseEntity.ok(this.identifications);
    }

    @PostMapping("/server")

}
