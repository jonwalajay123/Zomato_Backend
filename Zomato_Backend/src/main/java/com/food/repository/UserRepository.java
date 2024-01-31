package com.food.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.food.User;

public interface UserRepository extends JpaRepository<User, Long> {
    // Custom database operations if needed
}

