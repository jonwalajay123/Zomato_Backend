package com.food.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.food.Items;

public interface ItemsRepository extends JpaRepository<Items, Long> {
    // Custom database operations if needed
}
