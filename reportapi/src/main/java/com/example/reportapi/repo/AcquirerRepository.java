package com.example.reportapi.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.reportapi.domain.Acquirer;

public interface AcquirerRepository extends JpaRepository<Acquirer,Long>{
	Optional<Acquirer> findById(long id);
	
}
