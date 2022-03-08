package com.cleverlance.academy.aggregator.service;

import com.cleverlance.academy.aggregator.model.Identification;
import org.springframework.stereotype.Service;

@Service
public interface IdentificationService {
    Identification getIdentification();
}
