package com.mohshub.us.api.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "USER_TB")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity {

	@Id
	private int userId;
	private String firstName;
	private String lastName;
	private String mobileNumber;
	private String password;
	
}
