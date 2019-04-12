package com.example.reportapi.dto;

import javax.validation.constraints.NotNull;

public class TransactionDto {

	@NotNull
	private String transactionId;

	public TransactionDto(@NotNull String transactionId) {
		super();
		this.transactionId = transactionId;
	}

	public TransactionDto() {
	}
	
	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	
}
