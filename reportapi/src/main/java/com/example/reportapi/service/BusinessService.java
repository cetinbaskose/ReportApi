package com.example.reportapi.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.example.reportapi.domain.Customer;
import com.example.reportapi.domain.Transaction;
import com.example.reportapi.dto.ClientResponseDto;
import com.example.reportapi.dto.DataDto;
import com.example.reportapi.dto.ResponseDto;
import com.example.reportapi.dto.TransactionQueryResponseDto;
import com.example.reportapi.dto.TransactionReportResponseDto;
import com.example.reportapi.dto.TransactionResponseDto;
import com.example.reportapi.repo.AcquirerRepository;
import com.example.reportapi.repo.CustomerRepository;
import com.example.reportapi.repo.TransactionRepository;

@Service
public class BusinessService {
	private static final Logger LOGGER = LoggerFactory.getLogger(BusinessService.class);

	TransactionRepository transactionRepository;
	CustomerRepository customerRepository;
	AcquirerRepository acquirerRepository;

	public BusinessService(TransactionRepository transactionRepository, CustomerRepository customerRepository,
			AcquirerRepository acquirerRepository) {
		super();
		this.transactionRepository = transactionRepository;
		this.customerRepository = customerRepository;
		this.acquirerRepository = acquirerRepository;
	}

	public ClientResponseDto getClient(String transactionId) {
		LOGGER.info("get Client transactionId: " + transactionId);
		Optional<Transaction> transaction = transactionRepository.findBytransactionid(transactionId);

		Customer customer;
		ClientResponseDto clientResponseDto = null;

		if (transaction.isPresent()) {
			customer = customerRepository.findById(transaction.get().getCustomerId())
					.orElseThrow(() -> new RuntimeException("Customer does not exist CustomerId:" + transactionId));

			clientResponseDto = new ClientResponseDto();
			clientResponseDto.setCustomerInfo(customer);

		}

		return clientResponseDto; // ;customer
	}

	public TransactionReportResponseDto transactionReport(Date fromDate, Date toDate) {

		ArrayList<ResponseDto> responseDto = transactionRepository.findAllByTransactionDateBetween(fromDate, toDate);

		TransactionReportResponseDto result = new TransactionReportResponseDto();
		result.setResponse(responseDto);
		result.setStatus("APPROVED");

		return result;

	}

	public TransactionQueryResponseDto TransactionList() {
		TransactionQueryResponseDto transactionQueryResponse = new TransactionQueryResponseDto();
		ArrayList<DataDto> dataDtoArr = new ArrayList<DataDto>();

		for (Transaction transaction : transactionRepository.findAll()) {
			TransactionQueryResponseDto temp = new TransactionQueryResponseDto();

			DataDto dataDto = new DataDto();
			dataDto.setTransaction(transaction);

			dataDto.setCustomerInfo(customerRepository.findById(transaction.getCustomerid()).get());
			dataDto.setAcquirer(acquirerRepository.findById(transaction.getAcquirerid()).get());
			dataDtoArr.add(dataDto);

		}

		transactionQueryResponse.setData(dataDtoArr);

		return transactionQueryResponse;
	}

	
	public TransactionResponseDto transaction(String transactionId) {
		
		TransactionResponseDto transactionResponse = new TransactionResponseDto();
		
		LOGGER.info("get Client transactionId: " + transactionId);
		Optional<Transaction> transaction = transactionRepository.findBytransactionid(transactionId);

		Customer customer;
		

		if (transaction.isPresent()) {
      
			transactionResponse.setCustomerInfo(customerRepository.findById(transaction.get().getCustomerid()).get());
			transactionResponse.setAcquirer(acquirerRepository.findById(transaction.get().getAcquirerid()).get());
			transactionResponse.setTransaction(transaction.get());
		}
		
		
		
		
		return transactionResponse;
	}
	
	
}
