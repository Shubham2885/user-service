package com.mohshub.us.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mohshub.us.api.common.response.UserResponse;
import com.mohshub.us.api.dto.LoginDTO;
import com.mohshub.us.api.dto.UserRequestDTO;
import com.mohshub.us.api.interfaces.IUserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private IUserService userService;
	
	@PostMapping("/saveUser")
	public UserResponse saveUser(@RequestBody UserRequestDTO userRequestDTO) {
		return userService.saveUser(userRequestDTO);
	}
	
	@PostMapping("/login")
	public UserResponse login(@RequestBody LoginDTO loginDTO) {
		return userService.login(loginDTO);
	}
}
