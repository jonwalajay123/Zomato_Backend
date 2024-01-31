package com.food.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.food.DeliveryBoy;

public interface DeliveryBoyRepository extends JpaRepository<DeliveryBoy, Long> {
    // Custom database operations if needed
}

