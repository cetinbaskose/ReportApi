package com.example.reportapi.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.reportapi.domain.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
	Optional<Role> findByRoleName(String Name);

}
