package com.example.order.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.order.model.Order_details;

public interface OrderDao extends CrudRepository<Order_details, Integer> {

}
