package com.moontech.entity;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
public class RegisterInfo {
	
	@NotBlank
	String name;
	@NotBlank
	String userName;
	@Email(message = "not valid email")
	String email;
	@NotBlank
	String password;
	String confirmPassword;
	
	String role;
	String city;
	String state;
	String country;
	String phoneNumber;
	

}
