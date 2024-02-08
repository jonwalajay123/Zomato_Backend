package com.food;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Cuision {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long cuisionId;
	private String cuision;
	private String active;
	public Long getCuisionId() {
		return cuisionId;
	}
	public void setCuisionId(Long cuisionId) {
		this.cuisionId = cuisionId;
	}
	public String getCuision() {
		return cuision;
	}
	public void setCuision(String cuision) {
		this.cuision = cuision;
	}
	public String getActive() {
		return active;
	}
	public void setActive(String active) {
		this.active = active;
	}
	public Cuision(Long cuisionId, String cuision, String active) {
		super();
		this.cuisionId = cuisionId;
		this.cuision = cuision;
		this.active = active;
	}
	public Cuision() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
