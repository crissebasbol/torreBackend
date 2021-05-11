package com.torre.shoal.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.torre.shoal.models.Bio;

@Service
public interface LoginService {
	
	public Optional<Bio> loginWithTorre(String username);
	
}
