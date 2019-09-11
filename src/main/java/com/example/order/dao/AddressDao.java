package com.example.order.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.order.model.Address;


public interface AddressDao extends CrudRepository<Address, Integer>  {

}
