package com.food.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.food.Gateway;
import com.food.services.GatewayService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/gateways")
public class GatewayController {

    @Autowired
    private GatewayService gatewayService;

    @GetMapping
    public ResponseEntity<List<Gateway>> getAllGateways() {
        List<Gateway> gateways = gatewayService.getAllGateways();
        return new ResponseEntity<>(gateways, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Gateway> getGatewayById(@PathVariable Long id) {
        Optional<Gateway> gateway = gatewayService.getGatewayById(id);
        return gateway.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<Gateway> createGateway(@RequestBody Gateway gateway) {
        Gateway createdGateway = gatewayService.createOrUpdateGateway(gateway);
        return new ResponseEntity<>(createdGateway, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Gateway> updateGateway(@PathVariable Long id, @RequestBody Gateway gateway) {
        Optional<Gateway> existingGateway = gatewayService.getGatewayById(id);
        if (existingGateway.isPresent()) {
            gateway.setGatewayId(id);
            Gateway updatedGateway = gatewayService.createOrUpdateGateway(gateway);
            return new ResponseEntity<>(updatedGateway, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteGateway(@PathVariable Long id) {
        Optional<Gateway> existingGateway = gatewayService.getGatewayById(id);
        if (existingGateway.isPresent()) {
            gatewayService.deleteGatewayById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}

