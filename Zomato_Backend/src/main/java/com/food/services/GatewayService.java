package com.food.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.food.Gateway;
import com.food.repository.GatewayRepository;

import java.util.List;
import java.util.Optional;

@Service
public class GatewayService {

    @Autowired
    private GatewayRepository gatewayRepository;

    public List<Gateway> getAllGateways() {
        return gatewayRepository.findAll();
    }

    public Optional<Gateway> getGatewayById(Long id) {
        return gatewayRepository.findById(id);
    }

    public Gateway createOrUpdateGateway(Gateway gateway) {
        return gatewayRepository.save(gateway);
    }

    public void deleteGatewayById(Long id) {
        gatewayRepository.deleteById(id);
    }
}

