package com.moontech.controller;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.moontech.entity.RegisterInfo;
import com.moontech.entity.User;

@RestController
@RequestMapping(value = "/api/auth")
public class AuthController {
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public User userRegister(@Valid @RequestBody RegisterInfo userInfo) {
		System.out.println();
		return null;
	}

}
