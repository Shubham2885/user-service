package com.mohshub.us.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRequestDTO {

	private String firstName;
	private String lastName;
	private String mobileNumber;
	private String password;
}
