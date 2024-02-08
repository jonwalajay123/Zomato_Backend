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
public class OrderItem {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
	private Long orderitemId;
	private String  price;
	private String mrp;
	private String discount;
	private String quantity;
	private String totalAmount;
	private String active;
	
	    @ManyToOne
	    @JoinColumn(name = "order_id") // Ensure this matches the actual FK column name
	    @JsonBackReference
	    private Order order;

	public Long getOrderitemId() {
		return orderitemId;
	}

	public void setOrderitemId(Long orderitemId) {
		this.orderitemId = orderitemId;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getMrp() {
		return mrp;
	}

	public void setMrp(String mrp) {
		this.mrp = mrp;
	}

	public String getDiscount() {
		return discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public OrderItem(Long orderitemId, String price, String mrp, String discount, String quantity, String totalAmount,
			String active, Order order) {
		super();
		this.orderitemId = orderitemId;
		this.price = price;
		this.mrp = mrp;
		this.discount = discount;
		this.quantity = quantity;
		this.totalAmount = totalAmount;
		this.active = active;
		this.order = order;
	}

	public OrderItem() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
