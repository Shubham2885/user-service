package com.mohshub.us.api.common.converter;

import org.modelmapper.ModelMapper;

import com.mohshub.us.api.common.beans.BeanGenerater;
import com.mohshub.us.api.dto.UserRequestDTO;
import com.mohshub.us.api.entity.UserEntity;

public class Converter {
	
	private static ModelMapper modelMapper = BeanGenerater.INSTANCE.getModelMapper();

	public static UserEntity convertDtoToEntity(final UserRequestDTO sourceObj) {
		return modelMapper.map(sourceObj, UserEntity.class);
	}
}
