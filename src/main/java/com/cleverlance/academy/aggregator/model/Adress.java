package com.cleverlance.academy.aggregator.model;

import lombok.Data;
import lombok.Value;

@Value
public class Adress {
    private String street;
    private String number;
    private String city;

}
