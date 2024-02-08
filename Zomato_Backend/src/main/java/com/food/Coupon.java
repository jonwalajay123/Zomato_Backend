package com.food;



import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table
public class Coupon {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long couponId;
	private String couponCode;
	private String discount;
	private String discountType;
	private String minimumOrder;
	private LocalDate startDate;
	private  LocalDate expiryDate;
	
	public Long getCouponId() {
		return couponId;
	}
	public void setCouponId(Long couponId) {
		this.couponId = couponId;
	}
	public String getCouponCode() {
		return couponCode;
	}
	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}
	public String getDiscount() {
		return discount;
	}
	public void setDiscount(String discount) {
		this.discount = discount;
	}
	public String getDiscountType() {
		return discountType;
	}
	public void setDiscountType(String discountType) {
		this.discountType = discountType;
	}
	public String getMinimumOrder() {
		return minimumOrder;
	}
	public void setMinimumOrder(String minimumOrder) {
		this.minimumOrder = minimumOrder;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}
	public Coupon(Long couponId, String couponCode, String discount, String discountType, String minimumOrder,
			LocalDate startDate, LocalDate expiryDate) {
		super();
		this.couponId = couponId;
		this.couponCode = couponCode;
		this.discount = discount;
		this.discountType = discountType;
		this.minimumOrder = minimumOrder;
		this.startDate = startDate;
		this.expiryDate = expiryDate;
	}
	public Coupon() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}

