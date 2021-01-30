package com.mohshub.us.api.interfaces;

import com.mohshub.us.api.common.response.UserResponse;
import com.mohshub.us.api.dto.LoginDTO;
import com.mohshub.us.api.dto.UserRequestDTO;

public interface IUserService {

	public UserResponse saveUser(final UserRequestDTO userRequestDTO);
	public UserResponse getAllUsers();
	public UserResponse getUser(final Long userId);
	
	public UserResponse login(final LoginDTO loginDTO);
	
}
