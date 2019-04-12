package com.example.reportapi.dto;

import java.util.ArrayList;

public class TransactionReportResponseDto {

	private String status;

	ArrayList<ResponseDto> response = new ArrayList<ResponseDto>();

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public ArrayList<ResponseDto> getResponse() {
		return response;
	}

	public void setResponse(ArrayList<ResponseDto> response) {
		this.response = response;
	}

}
