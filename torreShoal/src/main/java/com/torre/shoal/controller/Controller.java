package com.torre.shoal.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.torre.shoal.manager.LoginManager;
import com.torre.shoal.models.Bio;

@RestController
public class Controller {
	
	private LoginManager loginManager;
	
	@Autowired
	public Controller(LoginManager loginManager) {
		this.loginManager = loginManager;
	}
	
	@GetMapping({Routes.PING})
	public String ping(){
		return "pong";
	}
	
	@GetMapping({Routes.LOGIN})
	public Optional<Bio> login(@PathVariable("username") String username) {
		
		return this.loginManager.loginWithTorre(username);
	}

}
