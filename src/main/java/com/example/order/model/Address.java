package com.example.order.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;
@Component
@Entity
@Table(name="Address")
public class Address {
	
	@Id
	@GeneratedValue
	private int addressId;
	private String StreetName;
	private String road;
	private long pincode;
	private String state;
	private String country;
	@ManyToOne
	private Customer cutomer;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(int addressId, String streetName, String road, long pincode, String state, String country) {
		super();
		this.addressId = addressId;
		StreetName = streetName;
		this.road = road;
		this.pincode = pincode;
		this.state = state;
		this.country = country;
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	
	public Customer getCutomer() {
		return cutomer;
	}

	public void setCutomer(Customer cutomer) {
		this.cutomer = cutomer;
	}

	public String getStreetName() {
		return StreetName;
	}

	public void setStreetName(String streetName) {
		StreetName = streetName;
	}

	public String getRoad() {
		return road;
	}

	public void setRoad(String road) {
		this.road = road;
	}

	public long getPincode() {
		return pincode;
	}

	public void setPincode(long pincode) {
		this.pincode = pincode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", StreetName=" + StreetName + ", road=" + road + ", pincode="
				+ pincode + ", state=" + state + ", country=" + country + "]";
	}
	
	
	
	
	

}
