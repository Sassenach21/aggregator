package com.cleverlance.academy.aggregator.model;

import lombok.Value; //pouziti u konstantnich dat

import javax.validation.constraints.Email;
import java.util.Objects;
import java.util.StringJoiner;

@Value
public class Person {

    private String firstName;
    private String lastName;

    @Email
    private String email;

    private String gender;

}
