package com.torre.shoal.manager;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.torre.shoal.models.Bio;
import com.torre.shoal.services.LoginService;

@Component
public class LoginManager {
	
	LoginService loginService;
	
	@Autowired
	public LoginManager(LoginService loginService) {
		this.loginService = loginService;
	}
	
	public Optional<Bio> loginWithTorre(String username) {
		try {
			// TODO: save login in DB. 
			return this.loginService.loginWithTorre(username);
		} catch (Exception e) {
			return Optional.empty();
		}
	}

}
