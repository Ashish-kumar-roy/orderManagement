package com.example.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.order.model.OrderCreation;
import com.example.order.service.OrderService;

@RestController
@RequestMapping("order")
public class OrderController {
	
	@Autowired
	private OrderService orderService;

	@PostMapping(path = "/createOrder", consumes = { MediaType.APPLICATION_XML_VALUE,
			MediaType.APPLICATION_JSON_VALUE }, produces = { MediaType.APPLICATION_XML_VALUE,
					MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<String> createTrip(@RequestBody OrderCreation orderCreation) {
             
		int ID=orderService.createOrder(orderCreation);
		return new ResponseEntity<>("Your Order Id Is "+String.valueOf(ID),HttpStatus.CREATED);

	}
	
	@GetMapping(path = "/{orderId}", produces = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<String> getUser(@PathVariable String orderId){
		
		String status=orderService.getOrderStatus(Integer.valueOf(orderId));
		
		if(null != status) {
			return new ResponseEntity<>(status, HttpStatus.OK);
		}else {
			return new ResponseEntity<>( HttpStatus.NO_CONTENT);
		}
		
		
	}
	
	@PutMapping(path = "/updateOrderStatus")
	public ResponseEntity<String> getUser(@RequestParam(value="Id") int Id,@RequestParam(value="status") String status ){
		
		String newstatus=orderService.UpdateOrderStatus(Integer.valueOf(Id),status);
		
		if(null != newstatus) {
			return new ResponseEntity<>(newstatus, HttpStatus.OK);
		}else {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
	}
}
