package com.food.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.food.Coupon;
import com.food.repository.CouponRepository;

import java.util.List;

@Service
public class CouponService {
    @Autowired
    private CouponRepository couponRepository;

    public Coupon createCoupon(Coupon coupon) {
        return couponRepository.save(coupon);
    }

    public List<Coupon> getAllCoupons() {
        return couponRepository.findAll();
    }

    public Coupon getCouponById(Long id) {
        return couponRepository.findById(id).orElse(null);
    }

    public Coupon updateCoupon(Long id, Coupon couponDetails) {
        return couponRepository.findById(id)
            .map(coupon -> {
                coupon.setCouponCode(couponDetails.getCouponCode());
                coupon.setDiscount(couponDetails.getDiscount());
                coupon.setDiscountType(couponDetails.getDiscountType());
                coupon.setMinimumOrder(couponDetails.getMinimumOrder());
                coupon.setStartDate(couponDetails.getStartDate());
                coupon.setExpiryDate(couponDetails.getExpiryDate());
                return couponRepository.save(coupon);
            }).orElse(null);
    }

    public void deleteCoupon(Long id) {
        couponRepository.deleteById(id);
    }
}

