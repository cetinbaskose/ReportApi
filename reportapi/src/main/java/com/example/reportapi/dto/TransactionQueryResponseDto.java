package com.example.reportapi.dto;

import java.util.ArrayList;

import com.example.reportapi.domain.Customer;
import com.example.reportapi.domain.Transaction;

public class TransactionQueryResponseDto {
	private Long per_page;
	private Long current_page;
	private String next_page_url;
	private String prev_page_url;
	private Long from;
	private Long to;

	ArrayList<DataDto> data = new ArrayList<DataDto>();

	public ArrayList<DataDto> getData() {
		return data;
	}

	public void setData(ArrayList<DataDto> data) {
		this.data = data;
	}

}
