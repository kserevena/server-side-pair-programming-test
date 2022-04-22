package com.qumu.userstore.api;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class UserApiTest {

	@Autowired
	private MockMvc mockMvc;

	/**
	 * Given a user exists with the username leon
	 * When a user issues a GET request to the API for username leon
	 * Then the details of the user with username leon should be returned.
	 */
	@Test
	public void getUserWithUsernameLeon() throws Exception {
		this.mockMvc.perform(get("/users/leon"))
				.andDo(print())
				.andExpect(status().isOk())
				.andExpect(jsonPath("$.id").value("1"))
				.andExpect(jsonPath("$.username").value("leon"))
				.andExpect(jsonPath("$.firstName").value("Leon"))
				.andExpect(jsonPath("$.surname").value("Fernandez"))
				.andExpect(jsonPath("$.emailAddress").value("leon.fernandez@qumu.com"));
	}
}
