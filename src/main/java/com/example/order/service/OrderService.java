package com.example.order.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.order.dao.AddressDao;
import com.example.order.dao.CustomerDao;
import com.example.order.dao.OrderDao;
import com.example.order.dao.ProductDao;
import com.example.order.model.Address;
import com.example.order.model.Customer;
import com.example.order.model.OrderCreation;
import com.example.order.model.Order_details;
import com.example.order.model.Product;

@Service
public class OrderService {
	
	@Autowired
	private OrderDao orderDao;
	
	@Autowired
	private CustomerDao customerDao;
	
	@Autowired
	private AddressDao addressDao;
	
	@Autowired
	private ProductDao productDao;
	
	@Autowired
	private Order_details order_details;
	
	@Autowired
	private Customer customer;
	
	@Autowired
	private Address address;
	
	@Autowired
	private Product product;
	
	
	
	public OrderService() {
		super();
		// TODO Auto-generated constructor stub
	}



	public int createOrder(OrderCreation orderCreation) {
		
		//createOrder
		order_details.setCutomerId(orderCreation.getCutomerId());
		order_details.setOrderDate(orderCreation.getOrderDate());
		order_details.setOrderStatus(orderCreation.getOrderStatus());
		order_details.setPrice(orderCreation.getPrice());
		order_details.setQuantity(orderCreation.getQuantity());
		
		//createProduct
		product.setModelId(orderCreation.getModelId());
		product.setProductName(orderCreation.getProductName());
		product.setProductType(orderCreation.getProductType());
		
		//createCustomer
		customer.setCustomerNumber(orderCreation.getCustomerNumber());
		customer.setCutomerType(orderCreation.getCutomerType());
		customer.setName(orderCreation.getName());
		
		
		//createAddress
		address.setCountry(orderCreation.getCountry());
		address.setPincode(orderCreation.getPincode());
		address.setRoad(orderCreation.getRoad());
		address.setState(orderCreation.getState());
		address.setStreetName(orderCreation.getStreetName());
		
		
		customer.getAddress().add(address);
		address.setCutomer(customer);
		
		customer.getOrders().add(order_details);
		order_details.setCutomer(customer);
		
		order_details.getProduct().add(product);
		product.setOrderDetails(order_details);
		
		customerDao.save(customer);
		addressDao.save(address);
		orderDao.save(order_details);
		productDao.save(product);
		
		
		return order_details.getOrderId();
	}



	public String getOrderStatus(Integer orderId) {
		
		boolean isRecordExist= orderDao.existsById(orderId);
		
		if(isRecordExist) {
			Optional<Order_details>  Order_detail=orderDao.findById(orderId);
			return  Order_detail.get().getOrderStatus();
		}
		else
			return null;
		
	}



	public String UpdateOrderStatus(Integer OrderId, String status) {
		
		
		boolean isRecordExist= orderDao.existsById(OrderId);
		
		if(isRecordExist) {
			Optional<Order_details>  Order_detail=orderDao.findById(OrderId);
			Order_detail.get().setOrderStatus(status);
			orderDao.save(Order_detail.get());
			return  Order_detail.get().getOrderStatus();
		}
		
		return null;
	}

	


	

	
}
