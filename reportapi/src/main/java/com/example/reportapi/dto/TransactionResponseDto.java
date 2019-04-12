package com.example.reportapi.dto;

import com.example.reportapi.domain.Acquirer;
import com.example.reportapi.domain.Customer;
import com.example.reportapi.domain.Transaction;

public class TransactionResponseDto {

	private Customer customerInfo;
	private Transaction transaction;
	private Acquirer acquirer;
	
	
	
	public TransactionResponseDto(Customer customerInfo, Transaction transaction, Acquirer acquirer) {
		super();
		this.customerInfo = customerInfo;
		this.transaction = transaction;
		this.acquirer = acquirer;
	}
	
	
	public TransactionResponseDto() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Customer getCustomerInfo() {
		return customerInfo;
	}
	public void setCustomerInfo(Customer customerInfo) {
		this.customerInfo = customerInfo;
	}
	public Transaction getTransaction() {
		return transaction;
	}
	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}
	public Acquirer getAcquirer() {
		return acquirer;
	}
	public void setAcquirer(Acquirer acquirer) {
		this.acquirer = acquirer;
	}
	
	
	
	
	
}
