package com.example.reportapi.dto;

import javax.validation.constraints.NotNull;

public class ClientDto {

	@NotNull
	private String transactionId;

	public ClientDto(String transactionId) {

		this.transactionId = transactionId;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public ClientDto() {
        super();
    }
}
