package com.food.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.food.Gateway;

@Repository
public interface GatewayRepository extends JpaRepository<Gateway, Long> {
}

