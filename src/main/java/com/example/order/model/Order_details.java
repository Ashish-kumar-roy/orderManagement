package com.example.order.model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;
@Component
@Entity
@Table(name="order_deatils")
public class Order_details {
	
	@Id
	@GeneratedValue
	private int orderId;
	private String orderDate;
	private String orderStatus;
	private String cutomerId;
	private int quantity;
	private double price;
	
	@ManyToOne
	private Customer cutomer;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name="Order_Product", joinColumns = @JoinColumn(name="orderId"),
	           inverseJoinColumns=@JoinColumn(name="productId"))
	private Collection<Product> product= new ArrayList<Product>();

	public Order_details() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Order_details(int orderId, String orderDate, String orderStatus, String cutomerId, int quantity,
			double price, Customer cutomer, Collection<Product> product) {
		super();
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.orderStatus = orderStatus;
		this.cutomerId = cutomerId;
		this.quantity = quantity;
		this.price = price;
		this.cutomer = cutomer;
		this.product = product;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Customer getCutomer() {
		return cutomer;
	}

	public void setCutomer(Customer cutomer) {
		this.cutomer = cutomer;
	}

	public Collection<Product> getProduct() {
		return product;
	}

	public void setProduct(Collection<Product> product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "Order_details [orderId=" + orderId + ", orderDate=" + orderDate + ", orderStatus=" + orderStatus
				+ ", cutomerId=" + cutomerId + ", quantity=" + quantity + ", price=" + price + ", cutomer=" + cutomer
				+ ", product=" + product + "]";
	}
	
	

		}
