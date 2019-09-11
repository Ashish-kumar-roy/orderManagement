package com.example.order.model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;
@Component
@Entity
@Table(name="Customer")
public class Customer {
	
	@Id
	@GeneratedValue()
	private int customerId;
	private String name;
	private String customerNumber;
	private String cutomerType;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name="Cutomer_Address", joinColumns = @JoinColumn(name="customerId"),
	           inverseJoinColumns=@JoinColumn(name="addressId"))
	private Collection<Address> address= new ArrayList<Address>();
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name="Cutomer_Order", joinColumns = @JoinColumn(name="customerId"),
	           inverseJoinColumns=@JoinColumn(name="orderId"))
	private Collection<Order_details> orders= new ArrayList<Order_details>(); 
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(int customerId, String name, String customerNumber, String cutomerType, Collection<Address> address,
			Collection<Order_details> orders) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.customerNumber = customerNumber;
		this.cutomerType = cutomerType;
		this.address = address;
		this.orders = orders;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
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

	public Collection<Address> getAddress() {
		return address;
	}

	public void setAddress(Collection<Address> address) {
		this.address = address;
	}

	public Collection<Order_details> getOrders() {
		return orders;
	}

	public void setOrders(Collection<Order_details> orders) {
		this.orders = orders;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", name=" + name + ", customerNumber=" + customerNumber
				+ ", cutomerType=" + cutomerType + ", address=" + address + ", orders=" + orders + "]";
	}

		
	

}
