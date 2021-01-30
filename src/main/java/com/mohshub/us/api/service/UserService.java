package com.mohshub.us.api.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mohshub.us.api.common.converter.Converter;
import com.mohshub.us.api.common.messages.MessageCode;
import com.mohshub.us.api.common.response.UserResponse;
import com.mohshub.us.api.dto.LoginDTO;
import com.mohshub.us.api.dto.UserRequestDTO;
import com.mohshub.us.api.entity.UserEntity;
import com.mohshub.us.api.interfaces.IUserService;
import com.mohshub.us.api.repository.UserRepository;

@Service
public class UserService implements IUserService{

	@Autowired
	private UserRepository repository;
	
	@Override
	public UserResponse saveUser(UserRequestDTO userRequest) {
		UserEntity userEntity = repository.save(Converter.convertDtoToEntity(userRequest));
		UserResponse response = new UserResponse();
		response.setData(userEntity);
		return response;
	}

	@Override
	public UserResponse getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserResponse getUser(Long userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserResponse login(LoginDTO loginDTO) {
		UserResponse userResponse = new UserResponse();
		Optional<UserEntity> optional = repository.findByMobileNumber(loginDTO.getMobileNumber());
		if(optional.isPresent()) {
			if(loginDTO.getPassword().compareTo(optional.get().getPassword())==0) {
				userResponse.setMessage(MessageCode.LOGIN_SUCCESS);
			}else {
				userResponse.setMessage(MessageCode.INVALID_PASSWORD);
			}
		}else {
			userResponse.setMessage(MessageCode.USER_NOT_FOUND);
		}
		return userResponse;
	}

}
