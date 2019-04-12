package com.example.reportapi.dto;

import java.util.Date;

public class TransactionQueryDto {

	private Date fromDate;
	private Date toDate;
	private String status;
	private String operation;
	private Long merchandId;
	private Long acquirerId;
	private String  payamentMethod;
	private String errorCode;
	private String filterField;
	private String filterValue;
	private Long page;
	
	public TransactionQueryDto(Date fromDate, Date toDate, String status, String operation, Long merchandId,
			Long acquirerId, String payamentMethod, String errorCode, String filterField, String filterValue,
			Long page) {
		super();
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.status = status;
		this.operation = operation;
		this.merchandId = merchandId;
		this.acquirerId = acquirerId;
		this.payamentMethod = payamentMethod;
		this.errorCode = errorCode;
		this.filterField = filterField;
		this.filterValue = filterValue;
		this.page = page;
	}

	public Date getFromDate() {
		return fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public Date getToDate() {
		return toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public Long getMerchandId() {
		return merchandId;
	}

	public void setMerchandId(Long merchandId) {
		this.merchandId = merchandId;
	}

	public Long getAcquirerId() {
		return acquirerId;
	}

	public void setAcquirerId(Long acquirerId) {
		this.acquirerId = acquirerId;
	}

	public String getPayamentMethod() {
		return payamentMethod;
	}

	public void setPayamentMethod(String payamentMethod) {
		this.payamentMethod = payamentMethod;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getFilterField() {
		return filterField;
	}

	public void setFilterField(String filterField) {
		this.filterField = filterField;
	}

	public String getFilterValue() {
		return filterValue;
	}

	public void setFilterValue(String filterValue) {
		this.filterValue = filterValue;
	}

	public Long getPage() {
		return page;
	}

	public void setPage(Long page) {
		this.page = page;
	}
	
	
	
}
