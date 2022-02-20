package com.cleverlance.academy.aggregator.model;

import lombok.Value; //pouziti u konstantnich dat

import java.util.Objects;
import java.util.StringJoiner;

@Value
public class Person {

    private String firstName;
    private String lastName;

}
