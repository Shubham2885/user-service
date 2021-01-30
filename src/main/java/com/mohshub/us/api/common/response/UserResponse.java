package com.mohshub.us.api.common.response;

import lombok.Data;

@Data
public class UserResponse {
	
	private Object message;
	private int statusCode;
	private Object data;
}
