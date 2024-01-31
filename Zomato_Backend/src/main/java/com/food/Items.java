package com.food;


import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class Items {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
	private Long itemsId;
    private String itemstName;
    private String itemsMrp;
    private String discount;
    private String price;
    private String active;
    private String status;
    private String cuision;
    private String description;
    @ManyToOne
    @JoinColumn(name = "restaurant_id")
    @JsonBackReference
    private Restaurant restaurant;
	public Long getItemsId() {
		return itemsId;
	}
	public void setItemsId(Long itemsId) {
		this.itemsId = itemsId;
	}
	public String getItemstName() {
		return itemstName;
	}
	public void setItemstName(String itemstName) {
		this.itemstName = itemstName;
	}
	public String getItemsMrp() {
		return itemsMrp;
	}
	public void setItemsMrp(String itemsMrp) {
		this.itemsMrp = itemsMrp;
	}
	public String getDiscount() {
		return discount;
	}
	public void setDiscount(String discount) {
		this.discount = discount;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getActive() {
		return active;
	}
	public void setActive(String active) {
		this.active = active;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCuision() {
		return cuision;
	}
	public void setCuision(String cuision) {
		this.cuision = cuision;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Restaurant getRestaurant() {
		return restaurant;
	}
	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}
	public Items(Long itemsId, String itemstName, String itemsMrp, String discount, String price, String active,
			String status, String cuision, String description, Restaurant restaurant) {
		super();
		this.itemsId = itemsId;
		this.itemstName = itemstName;
		this.itemsMrp = itemsMrp;
		this.discount = discount;
		this.price = price;
		this.active = active;
		this.status = status;
		this.cuision = cuision;
		this.description = description;
		this.restaurant = restaurant;
	}
	public Items() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
}
