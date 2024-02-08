package com.food.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.food.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}

