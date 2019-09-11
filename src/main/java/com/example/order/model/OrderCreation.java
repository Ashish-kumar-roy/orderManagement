package com.example.order.model;

import org.springframework.stereotype.Component;
@Component
public class OrderCreation {
	
	private String orderDate;
	private String orderStatus;
	private String cutomerId;
	private int quantity;
	private int productId;
	private double price;
	private String productName;
	private String productType;
	private String modelId;
	private String name;
	private String customerNumber;
	private String cutomerType;
	private String StreetName;
	private String road;
	private long pincode;
	private String state;
	private String country;
	
	public OrderCreation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrderCreation(String orderDate, String orderStatus, String cutomerId, int quantity, int productId,
			double price, String productName, String productType, String modelId, String name, String customerNumber,
			String cutomerType, String streetName, String road, long pincode, String state, String country) {
		super();
		this.orderDate = orderDate;
		this.orderStatus = orderStatus;
		this.cutomerId = cutomerId;
		this.quantity = quantity;
		this.productId = productId;
		this.price = price;
		this.productName = productName;
		this.productType = productType;
		this.modelId = modelId;
		this.name = name;
		this.customerNumber = customerNumber;
		this.cutomerType = cutomerType;
		StreetName = streetName;
		this.road = road;
		this.pincode = pincode;
		this.state = state;
		this.country = country;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getCutomerId() {
		return cutomerId;
	}

	public void setCutomerId(String cutomerId) {
		this.cutomerId = cutomerId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getModelId() {
		return modelId;
	}

	public void setModelId(String modelId) {
		this.modelId = modelId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}

	public String getCutomerType() {
		return cutomerType;
	}

	public void setCutomerType(String cutomerType) {
		this.cutomerType = cutomerType;
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
	
	
	
	

}
