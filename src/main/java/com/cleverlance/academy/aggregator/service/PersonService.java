package com.cleverlance.academy.aggregator.service;

import com.cleverlance.academy.aggregator.model.Person;
import org.springframework.stereotype.Service;

import javax.validation.Valid;

@Service
public abstract class PersonService {
    public abstract void save(Person person);
}
