package com.food.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.food.Restaurant;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
    // Custom database operations if needed
}

