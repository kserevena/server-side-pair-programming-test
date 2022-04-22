package com.qumu.userstore.service;

import com.qumu.userstore.domain.User;
import com.qumu.userstore.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

	private final UserRepository userRepository;

	public User findByUsername(String username) {
		return userRepository.findByUsername(username);
	}
}
