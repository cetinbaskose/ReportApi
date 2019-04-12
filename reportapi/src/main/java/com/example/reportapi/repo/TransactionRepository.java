package com.example.reportapi.repo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.reportapi.domain.Transaction;
import com.example.reportapi.dto.ResponseDto;
import com.example.reportapi.dto.TransactionReportResponseDto;

public interface TransactionRepository
		extends CrudRepository<Transaction, Long> /* JpaRepository<Transaction, Long> */ {

	Optional<Transaction> findBytransactionid(String Id);

	ArrayList<Transaction> findAll();

	
	@Query("SELECT new com.example.reportapi.dto.ResponseDto(currency ,count(currency),sum(amount)) "
			+ " FROM Transaction" + " group by currency ")
	ArrayList<ResponseDto> findAllByTransactionDateBetween(Date fromDate, Date toDate);



}
