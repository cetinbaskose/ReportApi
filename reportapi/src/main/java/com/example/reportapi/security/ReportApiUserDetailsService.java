package com.example.reportapi.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.example.reportapi.domain.User;
import com.example.reportapi.repo.UserRepository;

import static org.springframework.security.core.userdetails.User.withUsername;

import java.util.Optional;

@Component
public class ReportApiUserDetailsService implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	JwtProvider jwtProvider;

	@Override
	public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
		User user = userRepository.findByUsername(s).orElseThrow(
				() -> new UsernameNotFoundException(String.format("User with name %s does not exists", s)));

		return withUsername(user.getUsername())
				 .password(user.getPassword())
				 .authorities(user.getRoles())
				 .accountExpired(false)
				 .accountLocked(false)
				 .credentialsExpired(false)
				 .disabled(false)
				 .build();

	}

	public Optional<UserDetails> loadUserByJwtToken(String jwtToken) {
		if (jwtProvider.isValidToken(jwtToken)) {
			return Optional.of(withUsername(jwtProvider.getUsername(jwtToken))
					.authorities(jwtProvider.getRoles(jwtToken))
					.password("")
					.accountExpired(false)
					.accountLocked(false)
					.credentialsExpired(false)
					.disabled(false)
					.build()); 

		}

		return Optional.empty();
	}

}
