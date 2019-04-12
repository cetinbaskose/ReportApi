package com.example.reportapi.web;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.reportapi.domain.Customer;
import com.example.reportapi.dto.ClientDto;
import com.example.reportapi.dto.ClientResponseDto;
import com.example.reportapi.dto.TransactionDto;
import com.example.reportapi.dto.TransactionQueryDto;
import com.example.reportapi.dto.TransactionQueryResponseDto;
import com.example.reportapi.dto.TransactionReportDto;
import com.example.reportapi.dto.TransactionReportResponseDto;
import com.example.reportapi.dto.TransactionResponseDto;
import com.example.reportapi.service.BusinessService;

@RestController
@RequestMapping("/api/v3")
public class ApiController {
	@Autowired
	private BusinessService businessService;

	@PostMapping("/transactions/report")
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	public /* List <Transaction> */ TransactionReportResponseDto transactionReport(
			@RequestBody @Valid TransactionReportDto transactionReportDto) {
		return businessService.transactionReport(transactionReportDto.getFromDate(), transactionReportDto.getToDate());
	}

	@GetMapping("/client")

	@PreAuthorize("hasRole('ROLE_ADMIN')")
	public ClientResponseDto client(@RequestBody @Valid ClientDto clientDto) {

		return businessService.getClient(clientDto.getTransactionId());

	}

	@PostMapping("/transaction/list")
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	public TransactionQueryResponseDto transactionList(
			@RequestBody @Valid TransactionQueryDto transactionQueryParam) {
		return businessService.TransactionList();
	}
	
	
	@PostMapping("/transaction/")
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	public TransactionResponseDto transaction(
			@RequestBody @Valid TransactionDto transactionDto) {
		return businessService.transaction(transactionDto.getTransactionId());
	}

}
