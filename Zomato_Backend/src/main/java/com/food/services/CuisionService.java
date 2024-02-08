package com.food.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.food.Cuision;
import com.food.repository.CuisionRepository;

import java.util.List;

@Service
public class CuisionService {
    @Autowired
    private CuisionRepository cuisionRepository;

    public Cuision createCuision(Cuision cuision) {
        return cuisionRepository.save(cuision);
    }

    public List<Cuision> getAllCuisons() {
        return cuisionRepository.findAll();
    }

    public Cuision getCuisionById(Long id) {
        return cuisionRepository.findById(id).orElse(null);
    }

    public Cuision updateCuision(Long id, Cuision cuisionDetails) {
        return cuisionRepository.findById(id)
                .map(cuision -> {
                    cuision.setCuision(cuisionDetails.getCuision());
                    cuision.setActive(cuisionDetails.getActive());
                    return cuisionRepository.save(cuision);
                }).orElseGet(() -> cuisionRepository.save(cuisionDetails));
    }

    public void deleteCuision(Long id) {
        cuisionRepository.deleteById(id);
    }
}
