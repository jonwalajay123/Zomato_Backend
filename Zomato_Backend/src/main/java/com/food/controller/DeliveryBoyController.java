package com.food.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.food.DeliveryBoy;
import com.food.services.DeliveryBoyService;

import java.util.List;

@RestController
@RequestMapping("/api/deliveryBoy")
public class DeliveryBoyController {
    @Autowired
    private DeliveryBoyService deliveryBoyService;

    @PostMapping
    public DeliveryBoy createDeliveryBoy(@RequestBody DeliveryBoy deliveryBoy) {
        return deliveryBoyService.createDeliveryBoy(deliveryBoy);
    }

    @GetMapping
    public List<DeliveryBoy> getAllDeliveryBoys() {
        return deliveryBoyService.getAllDeliveryBoys();
    }

    @GetMapping("/{id}")
    public ResponseEntity<DeliveryBoy> getDeliveryBoyById(@PathVariable Long id) {
        DeliveryBoy deliveryBoy = deliveryBoyService.getDeliveryBoyById(id);
        if (deliveryBoy != null) {
            return ResponseEntity.ok(deliveryBoy);
        }
        return ResponseEntity.notFound().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<DeliveryBoy> updateDeliveryBoy(@PathVariable Long id, @RequestBody DeliveryBoy deliveryBoyDetails) {
        DeliveryBoy updatedDeliveryBoy = deliveryBoyService.updateDeliveryBoy(id, deliveryBoyDetails);
        if (updatedDeliveryBoy != null) {
            return ResponseEntity.ok(updatedDeliveryBoy);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDeliveryBoy(@PathVariable Long id) {
        deliveryBoyService.deleteDeliveryBoy(id);
        return ResponseEntity.ok().build();
    }
}

