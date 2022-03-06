package com.cleverlance.academy.aggregator.service;
import com.cleverlance.academy.aggregator.model.Identification;
import com.cleverlance.academy.aggregator.repository.IdentificationRepository;
import org.springframework.stereotype.Component;

@Component
public class IdentificationServiceImpl implements IdentificationRepository {

    private final IdentificationRepository identificationRepository;

    public IdentificationServiceImpl(IdentificationRepository identificationRepository) {
        this.identificationRepository = identificationRepository;
    }

    @Override
    public Identificaton getIdentification(){
        return this.identificationRepository.getIdentification();
    }
}
