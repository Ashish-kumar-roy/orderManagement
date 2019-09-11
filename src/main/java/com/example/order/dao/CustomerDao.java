package com.example.order.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.order.model.Customer;

public interface CustomerDao extends CrudRepository<Customer, Integer> {

}
