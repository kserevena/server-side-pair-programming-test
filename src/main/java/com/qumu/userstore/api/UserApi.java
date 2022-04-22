package com.qumu.userstore.api;

import com.qumu.userstore.domain.User;
import com.qumu.userstore.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserApi {

	private final UserService userService;

	@GetMapping("/users/{username}")
	public User getByUsername(String username) {
		return userService.findByUsername(username);
	}

	// TODO Add an API method to create a new user.

	// TODO Add an API method to update an existing user.

	// TODO Add an API method to delete an existing user.
}
