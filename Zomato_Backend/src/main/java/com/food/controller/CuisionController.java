package com.food.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.food.Cuision;
import com.food.services.CuisionService;

import java.util.List;

@RestController
@RequestMapping("/api/cuisons")
public class CuisionController {
    @Autowired
    private CuisionService cuisionService;

    @PostMapping
    public Cuision createCuision(@RequestBody Cuision cuision) {
        return cuisionService.createCuision(cuision);
    }

    @GetMapping
    public List<Cuision> getAllCuisons() {
        return cuisionService.getAllCuisons();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cuision> getCuisionById(@PathVariable Long id) {
        Cuision cuision = cuisionService.getCuisionById(id);
        return cuision != null ? ResponseEntity.ok(cuision) : ResponseEntity.notFound().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Cuision> updateCuision(@PathVariable Long id, @RequestBody Cuision cuisionDetails) {
        Cuision updatedCuision = cuisionService.updateCuision(id, cuisionDetails);
        return updatedCuision != null ? ResponseEntity.ok(updatedCuision) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCuision(@PathVariable Long id) {
        cuisionService.deleteCuision(id);
        return ResponseEntity.ok().build();
    }
}
