package com.example.reportapi.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.config.core.GrantedAuthorityDefaults;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.reportapi.repo.*;
import com.example.reportapi.domain.*;
import com.example.reportapi.dto.LoginResponseDto;
import com.example.reportapi.dto.TransactionReportResponseDto;
import com.example.reportapi.security.JwtProvider;

@Service
public class UserService {
	private static final Logger LOGGER = LoggerFactory.getLogger(UserService.class);
	private UserRepository userRepository;
	private AuthenticationManager authenticationManager;
	private RoleRepository roleRepository;
	private PasswordEncoder passwordEncoder;
	private JwtProvider jwtProvider;

	@Autowired
	public UserService(UserRepository userRepository, AuthenticationManager authenticationManager,
			RoleRepository roleRepository, PasswordEncoder passwordEncoder, JwtProvider jwtProvider) {
		this.userRepository = userRepository;
		this.authenticationManager = authenticationManager;
		this.roleRepository = roleRepository;
		this.passwordEncoder = passwordEncoder;
		this.jwtProvider = jwtProvider;

	}

	public LoginResponseDto login(String username, String password) {
		LOGGER.info("New user attempting to login" + username + " " + password);
		Optional<String> token = Optional.empty();
		Optional<User> user = userRepository.findByUsername(username);
		LoginResponseDto loginResponseDto = new LoginResponseDto(null, null);
		if (user.isPresent()) {
			try {

				authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
				token = Optional.of(jwtProvider.createToken(username, user.get().getRoles()));
				loginResponseDto.setToken(token.get());
				loginResponseDto.setStatus("APPROVED");
			} catch (AuthenticationException e) {
				LOGGER.info("Log in failed for user {}", username);
			}

		}

		return loginResponseDto;

	}

	public List<User> getAll() {
		return userRepository.findAll();

	}

}
