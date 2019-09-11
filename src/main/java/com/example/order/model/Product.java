package com.example.order.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;
@Component
@Entity
@Table(name="Product")
public class Product {

	@Id
	@GeneratedValue
	private int productId;
	private String productName;
	private String productType;
	private String modelId;
	
	@ManyToOne
	private Order_details orderDetails;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int productId, String productName, String productType, String modelId, Order_details orderDetails) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productType = productType;
		this.modelId = modelId;
		this.orderDetails = orderDetails;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
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
	public Order_details getOrderDetails() {
		return orderDetails;
	}
	public void setOrderDetails(Order_details orderDetails) {
		this.orderDetails = orderDetails;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productType=" + productType
				+ ", modelId=" + modelId + ", orderDetails=" + orderDetails + "]";
	}
	
	
	
}
