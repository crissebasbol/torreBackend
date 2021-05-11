package com.torre.shoal.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.torre.shoal.dto.RequestSearchIdealPerson;
import com.torre.shoal.manager.LoginManager;
import com.torre.shoal.manager.SearchIdealManager;
import com.torre.shoal.models.Bio;
import com.torre.shoal.models.People;

@RestController
public class Controller {
	
	private LoginManager loginManager;
	private SearchIdealManager searchIdealManager;
	
	@Autowired
	public Controller(LoginManager loginManager, SearchIdealManager searchIdealManager) {
		this.loginManager = loginManager;
		this.searchIdealManager = searchIdealManager;
	}
	
	@GetMapping({Routes.PING})
	public String ping(){
		return "pong";
	}
	
	@GetMapping({Routes.LOGIN})
	public Optional<Bio> login(@PathVariable("username") String username) {
		
		return this.loginManager.loginWithTorre(username);
	}
	
	@PostMapping({Routes.SEACRH_IDEAL_PERSON})
	public Object searIdealPerdon(@RequestBody RequestSearchIdealPerson requestSearchIdealPerson) {
		
		return this.searchIdealManager.searchIdealPerson(requestSearchIdealPerson);
	}

}
