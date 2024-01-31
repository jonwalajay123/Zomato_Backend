package com.food;

import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Restaurant {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
	    private Long restaurantId;
	    private String restaurantName;
	    private String contactNumber;
	    private String Address;
	    private String latitude;
	    private String longitude;
	    private String email;
	    private String contactPerson;
	    private LocalTime openingTime;
	    private LocalTime closingTime;
	    private String currentStatus;
	    private String active;
	    private String otp;
	    private String logo;
	    private String city;
	    private String state;
	    private String pincode;
	    private String type;
	    private String cuision;
	    private String description;
		public Long getRestaurantId() {
			return restaurantId;
		}
		public void setRestaurantId(Long restaurantId) {
			this.restaurantId = restaurantId;
		}
		public String getRestaurantName() {
			return restaurantName;
		}
		public void setRestaurantName(String restaurantName) {
			this.restaurantName = restaurantName;
		}
		public String getContactNumber() {
			return contactNumber;
		}
		public void setContactNumber(String contactNumber) {
			this.contactNumber = contactNumber;
		}
		public String getAddress() {
			return Address;
		}
		public void setAddress(String address) {
			Address = address;
		}
		public String getLatitude() {
			return latitude;
		}
		public void setLatitude(String latitude) {
			this.latitude = latitude;
		}
		public String getLongitude() {
			return longitude;
		}
		public void setLongitude(String longitude) {
			this.longitude = longitude;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getContactPerson() {
			return contactPerson;
		}
		public void setContactPerson(String contactPerson) {
			this.contactPerson = contactPerson;
		}
		public LocalTime getOpeningTime() {
			return openingTime;
		}
		public void setOpeningTime(LocalTime openingTime) {
			this.openingTime = openingTime;
		}
		public LocalTime getClosingTime() {
			return closingTime;
		}
		public void setClosingTime(LocalTime closingTime) {
			this.closingTime = closingTime;
		}
		public String getCurrentStatus() {
			return currentStatus;
		}
		public void setCurrentStatus(String currentStatus) {
			this.currentStatus = currentStatus;
		}
		public String getActive() {
			return active;
		}
		public void setActive(String active) {
			this.active = active;
		}
		public String getOtp() {
			return otp;
		}
		public void setOtp(String otp) {
			this.otp = otp;
		}
		public String getLogo() {
			return logo;
		}
		public void setLogo(String logo) {
			this.logo = logo;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public String getPincode() {
			return pincode;
		}
		public void setPincode(String pincode) {
			this.pincode = pincode;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
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
		public Restaurant(Long restaurantId, String restaurantName, String contactNumber, String address,
				String latitude, String longitude, String email, String contactPerson, LocalTime openingTime,
				LocalTime closingTime, String currentStatus, String active, String otp, String logo, String city,
				String state, String pincode, String type, String cuision, String description) {
			super();
			this.restaurantId = restaurantId;
			this.restaurantName = restaurantName;
			this.contactNumber = contactNumber;
			Address = address;
			this.latitude = latitude;
			this.longitude = longitude;
			this.email = email;
			this.contactPerson = contactPerson;
			this.openingTime = openingTime;
			this.closingTime = closingTime;
			this.currentStatus = currentStatus;
			this.active = active;
			this.otp = otp;
			this.logo = logo;
			this.city = city;
			this.state = state;
			this.pincode = pincode;
			this.type = type;
			this.cuision = cuision;
			this.description = description;
		}
		public Restaurant() {
			super();
			// TODO Auto-generated constructor stub
		}


}
