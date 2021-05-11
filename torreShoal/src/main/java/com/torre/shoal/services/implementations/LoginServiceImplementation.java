package com.torre.shoal.services.implementations;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.torre.shoal.constants.TorreEndpoints;
import com.torre.shoal.models.Bio;
import com.torre.shoal.services.LoginService;

@Service
public class LoginServiceImplementation implements LoginService {

	private RestTemplate restTemplate;

	@Autowired
	public LoginServiceImplementation(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}
	
	@Override
	public Optional<Bio> loginWithTorre(String username) {
		var response = this.restTemplate.getForObject(TorreEndpoints.GET_BIO.replace("{username}", username), Bio.class);
		
		return Optional.of(response);
	}

}
