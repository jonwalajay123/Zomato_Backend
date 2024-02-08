package com.food;

import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table
public class Gateway {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
	private Long gatewayId;
	private String transactionStatus;
	private LocalDateTime dateTime;
	
	@ManyToOne
    @JoinColumn(name = "transaction_id")
    @JsonBackReference
    private Transaction transaction;

	public Long getGatewayId() {
		return gatewayId;
	}

	public void setGatewayId(Long gatewayId) {
		this.gatewayId = gatewayId;
	}

	public String getTransactionStatus() {
		return transactionStatus;
	}

	public void setTransactionStatus(String transactionStatus) {
		this.transactionStatus = transactionStatus;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}

	public Transaction getTransaction() {
		return transaction;
	}

	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}

	public Gateway(Long gatewayId, String transactionStatus, LocalDateTime dateTime, Transaction transaction) {
		super();
		this.gatewayId = gatewayId;
		this.transactionStatus = transactionStatus;
		this.dateTime = dateTime;
		this.transaction = transaction;
	}

	public Gateway() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	
}
