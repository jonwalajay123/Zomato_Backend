package com.food;

import java.time.LocalDateTime;
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
public class Transaction {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
	private Long transactionId;
	private String paymentMethod;
	private String active;
	private String transactionStatus;
	private LocalDateTime datetime;
	
	@JsonManagedReference
    @OneToMany(mappedBy = "transaction", cascade = CascadeType.ALL)
    private List<Gateway> gateway;

	public Long getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(Long transactionId) {
		this.transactionId = transactionId;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public String getTransactionStatus() {
		return transactionStatus;
	}

	public void setTransactionStatus(String transactionStatus) {
		this.transactionStatus = transactionStatus;
	}

	public LocalDateTime getDatetime() {
		return datetime;
	}

	public void setDatetime(LocalDateTime datetime) {
		this.datetime = datetime;
	}

	public List<Gateway> getGateway() {
		return gateway;
	}

	public void setGateway(List<Gateway> gateway) {
		this.gateway = gateway;
	}

	public Transaction(Long transactionId, String paymentMethod, String active, String transactionStatus,
			LocalDateTime datetime, List<Gateway> gateway) {
		super();
		this.transactionId = transactionId;
		this.paymentMethod = paymentMethod;
		this.active = active;
		this.transactionStatus = transactionStatus;
		this.datetime = datetime;
		this.gateway = gateway;
	}

	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}
