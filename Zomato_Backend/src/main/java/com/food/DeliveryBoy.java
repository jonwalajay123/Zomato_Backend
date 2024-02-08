package com.food;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class DeliveryBoy {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
	 private Long deliveryboyId;
	    private String deliveryboyName;
	    private String contactNumber;
	    private String latitude;
	    private String longitude;
	    private String email;
	    private String currentStatus;
	    private String active;
	    private String city;
	    
	    
		public Long getDeliveryboyId() {
			return deliveryboyId;
		}
		public void setDeliveryboyId(Long deliveryboyId) {
			this.deliveryboyId = deliveryboyId;
		}
		public String getDeliveryboyName() {
			return deliveryboyName;
		}
		public void setDeliveryboyName(String deliveryboyName) {
			this.deliveryboyName = deliveryboyName;
		}
		public String getContactNumber() {
			return contactNumber;
		}
		public void setContactNumber(String contactNumber) {
			this.contactNumber = contactNumber;
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
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public DeliveryBoy(Long deliveryboyId, String deliveryboyName, String contactNumber, String latitude,
				String longitude, String email, String currentStatus, String active, String city) {
			super();
			this.deliveryboyId = deliveryboyId;
			this.deliveryboyName = deliveryboyName;
			this.contactNumber = contactNumber;
			this.latitude = latitude;
			this.longitude = longitude;
			this.email = email;
			this.currentStatus = currentStatus;
			this.active = active;
			this.city = city;
		}
		public DeliveryBoy() {
			super();
			// TODO Auto-generated constructor stub
		}
	    
	    
}
