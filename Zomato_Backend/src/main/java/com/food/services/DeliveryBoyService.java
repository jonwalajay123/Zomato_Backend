package com.food.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.food.DeliveryBoy;
import com.food.repository.DeliveryBoyRepository;

import java.util.List;

@Service
public class DeliveryBoyService {
    @Autowired
    private DeliveryBoyRepository deliveryBoyRepository;

    public DeliveryBoy createDeliveryBoy(DeliveryBoy deliveryBoy) {
        return deliveryBoyRepository.save(deliveryBoy);
    }

    public List<DeliveryBoy> getAllDeliveryBoys() {
        return deliveryBoyRepository.findAll();
    }

    public DeliveryBoy getDeliveryBoyById(Long id) {
        return deliveryBoyRepository.findById(id).orElse(null);
    }

    public DeliveryBoy updateDeliveryBoy(Long id, DeliveryBoy deliveryBoyDetails) {
        return deliveryBoyRepository.findById(id)
            .map(deliveryBoy -> {
                deliveryBoy.setDeliveryboyName(deliveryBoyDetails.getDeliveryboyName());
                deliveryBoy.setContactNumber(deliveryBoyDetails.getContactNumber());
                deliveryBoy.setLatitude(deliveryBoyDetails.getLatitude());
                deliveryBoy.setLongitude(deliveryBoyDetails.getLongitude());
                deliveryBoy.setEmail(deliveryBoyDetails.getEmail());
                deliveryBoy.setCurrentStatus(deliveryBoyDetails.getCurrentStatus());
                deliveryBoy.setActive(deliveryBoyDetails.getActive());
                deliveryBoy.setCity(deliveryBoyDetails.getCity());
                return deliveryBoyRepository.save(deliveryBoy);
            }).orElse(null);
    }

    public void deleteDeliveryBoy(Long id) {
        deliveryBoyRepository.deleteById(id);
    }
}
