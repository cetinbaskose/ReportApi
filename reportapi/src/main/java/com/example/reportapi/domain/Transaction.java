package com.example.reportapi.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="transaction")
public class Transaction {
	@Id
	//@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name ="transactionid")
	private String transactionid;
	
	@Column(name ="customerid")
	private int customerid;
	
	@Column(name ="currency")
	private String currency;
	
	@Column(name="amount")
	private double amount;
	
	@Column(name="transactiondate")
	private Date transactionDate;
	
	@Column(name ="acquirerid")
	private int acquirerid;

	public Transaction(String transactionId, int clientId) {
		this.transactionid = transactionId;
		this.customerid = clientId;
	}
	


	public Transaction(String transactionid, int customerid, String currency, double amount, Date transactionDate,
			int acquirerid) {
		super();
		this.transactionid = transactionid;
		this.customerid = customerid;
		this.currency = currency;
		this.amount = amount;
		this.transactionDate = transactionDate;
		this.acquirerid = acquirerid;
	}



	protected Transaction()
	{}
	
	public String getTransactionId() {
		return transactionid;
	}

	public void setTransactionId(String transactionId) {
		this.transactionid = transactionId;
	}

	public int getCustomerId() {
		return customerid;
	}

	public void setCustomerId(int costumerId) {
		this.customerid = costumerId;
	}

	public String getTransactionid() {
		return transactionid;
	}

	public void setTransactionid(String transactionid) {
		this.transactionid = transactionid;
	}

	public int getCustomerid() {
		return customerid;
	}

	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Date getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}

	public int getAcquirerid() {
		return acquirerid;
	}

	public void setAcquirerid(int acquirerid) {
		this.acquirerid = acquirerid;
	}


	
}
