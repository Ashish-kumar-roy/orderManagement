package com.example.order.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.order.model.Product;

public interface ProductDao extends CrudRepository<Product, Integer> {

}
