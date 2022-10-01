package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.ITransaction;
import com.service.ITransactionService;

@RestController
@RequestMapping("/api")
public class ITransactionController {

	@Autowired
	ITransactionService transactionservice;
	
	@PostMapping("/addtransaction")
	public ITransaction addTransaction(@RequestBody ITransaction transaction) {
	
		ITransaction t = transactionservice.addTransaction(transaction);
		return t;
}
}