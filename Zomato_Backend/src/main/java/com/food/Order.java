package com.food;


import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "orders")
public class Order{
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
	    private Long orderId;
	    private String orderStatus;
	    private String orderAmount;
	    private String orderDiscount;
	    private String tax;
	    private String distance;
	    private String active;
	    private LocalDateTime generate;
	    @Column(name = "updated_at") // Renaming the column
	    private LocalDateTime updatedAt;

	    
	    @JsonManagedReference
	    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
	    private List<OrderItem> orderitem;
	    
	    
	    @ManyToOne
	    @JoinColumn(name = "user_id") // Ensure this matches the actual FK column name
	    @JsonBackReference
	    private User user;
	    
	    

		public Order(User user) {
			super();
			this.user = user;
		}

		public User getUser() {
			return user;
		}

		public void setUser(User user) {
			this.user = user;
		}

		public Long getOrderId() {
			return orderId;
		}

		public void setOrderId(Long orderId) {
			this.orderId = orderId;
		}

		public String getOrderStatus() {
			return orderStatus;
		}

		public void setOrderStatus(String orderStatus) {
			this.orderStatus = orderStatus;
		}

		public String getOrderAmount() {
			return orderAmount;
		}

		public void setOrderAmount(String orderAmount) {
			this.orderAmount = orderAmount;
		}

		public String getOrderDiscount() {
			return orderDiscount;
		}

		public void setOrderDiscount(String orderDiscount) {
			this.orderDiscount = orderDiscount;
		}

		public String getTax() {
			return tax;
		}

		public void setTax(String tax) {
			this.tax = tax;
		}

		public String getDistance() {
			return distance;
		}

		public void setDistance(String distance) {
			this.distance = distance;
		}

		public String getActive() {
			return active;
		}

		public void setActive(String active) {
			this.active = active;
		}

		public LocalDateTime getGenerate() {
			return generate;
		}

		public void setGenerate(LocalDateTime generate) {
			this.generate = generate;
		}

		

		public LocalDateTime getUpdatedAt() {
			return updatedAt;
		}

		public void setUpdatedAt(LocalDateTime updatedAt) {
			this.updatedAt = updatedAt;
		}

		public List<OrderItem> getOrderitem() {
			return orderitem;
		}

		public void setOrderitem(List<OrderItem> orderitem) {
			this.orderitem = orderitem;
		}

		
		public Order(Long orderId, String orderStatus, String orderAmount, String orderDiscount, String tax,
				String distance, String active, LocalDateTime generate, LocalDateTime updatedAt,
				List<OrderItem> orderitem) {
			super();
			this.orderId = orderId;
			this.orderStatus = orderStatus;
			this.orderAmount = orderAmount;
			this.orderDiscount = orderDiscount;
			this.tax = tax;
			this.distance = distance;
			this.active = active;
			this.generate = generate;
			this.updatedAt = updatedAt;
			this.orderitem = orderitem;
		}

		public Order() {
			super();
			// TODO Auto-generated constructor stub
		}

     

		



		
}
	    
	    
	    
