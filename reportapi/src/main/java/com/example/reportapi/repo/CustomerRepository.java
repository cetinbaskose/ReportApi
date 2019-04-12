package com.example.reportapi.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.reportapi.domain.Customer;


public interface CustomerRepository extends JpaRepository<Customer,Long>{
	Optional<Customer> findById(long id);
}
