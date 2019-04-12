package com.example.reportapi.dto;

import com.example.reportapi.domain.Customer;

public class ClientResponseDto {

	Customer customerInfo;
	private String Name;

	public ClientResponseDto() {
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Customer getCustomerInfo() {
		return customerInfo;
	}

	public void setCustomerInfo(Customer customerInfo) {
		this.customerInfo = customerInfo;
	}

}
