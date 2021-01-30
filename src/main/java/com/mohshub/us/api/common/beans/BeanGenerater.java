package com.mohshub.us.api.common.beans;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;

public class BeanGenerater {

	public final static BeanGenerater INSTANCE = new BeanGenerater();
	
	@Bean
	public ModelMapper getModelMapper() {
		return new ModelMapper();
	}
}
