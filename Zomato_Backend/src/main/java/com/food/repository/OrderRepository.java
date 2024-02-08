package com.food.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.food.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}

