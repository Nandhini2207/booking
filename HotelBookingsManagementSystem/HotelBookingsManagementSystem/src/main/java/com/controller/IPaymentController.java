package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.entity.IPayment;
import com.service.IPaymentService;

@RestController
@RequestMapping("/api")
public class IPaymentController {
	
	@Autowired
	IPaymentService paymentservice;
	
	@PostMapping("/addpayment")
	  public IPayment addpayments(@RequestBody IPayment payment) 
	  { 
		  IPayment p = paymentservice.addPayment(payment);
		  return p;
	  }
}
