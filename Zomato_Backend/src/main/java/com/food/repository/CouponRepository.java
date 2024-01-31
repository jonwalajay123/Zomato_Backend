package com.food.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.food.Coupon;


public interface CouponRepository extends JpaRepository<Coupon, Long> {
}


