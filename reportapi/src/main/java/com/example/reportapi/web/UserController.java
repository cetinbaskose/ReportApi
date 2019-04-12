package com.example.reportapi.web;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;

import com.example.reportapi.service.BusinessService;
import com.example.reportapi.service.UserService;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.example.reportapi.domain.Customer;
import com.example.reportapi.domain.Transaction;
import com.example.reportapi.domain.User;
import com.example.reportapi.dto.ClientDto;
import com.example.reportapi.dto.LoginDto;
import com.example.reportapi.dto.LoginResponseDto;
import com.example.reportapi.dto.TransactionQueryDto;
import com.example.reportapi.dto.TransactionQueryResponseDto;
import com.example.reportapi.dto.TransactionReportDto;
import com.example.reportapi.dto.TransactionReportResponseDto;

@RestController
@RequestMapping("/api/v3")
public class UserController {

	private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

	@Autowired
	private UserService userService;


	@PostMapping("/merchant/user/login")
	public LoginResponseDto login2(@RequestBody @Valid LoginDto loginDto) {

		return userService.login(loginDto.getUsername(), loginDto.getPassword());
	}

	@GetMapping("/merchant/user")
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	public List<User> getAllUsers() {
		return userService.getAll();
	}

}
