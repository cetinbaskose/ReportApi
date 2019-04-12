package com.example.reportapi.dto;

import java.util.Date;

import javax.validation.constraints.NotNull;

public class TransactionReportDto {

	@NotNull
	private Date fromDate;
	@NotNull
	private Date toDate;
	private int merchant;
	private int acquirer;

	public TransactionReportDto(@NotNull Date fromDate, @NotNull Date toDate, int merchant, int acquirer) {
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.merchant = merchant;
		this.acquirer = acquirer;
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

	public int getMerchant() {
		return merchant;
	}

	public void setMerchant(int merchant) {
		this.merchant = merchant;
	}

	public int getAcquirer() {
		return acquirer;
	}

	public void setAcquirer(int acquirer) {
		this.acquirer = acquirer;
	}

}
