package com.torre.shoal.services;

import org.springframework.stereotype.Service;

import com.torre.shoal.dto.RequestSearchIdealPerson;

@Service
public interface SearchIdealService {

	public Object searchIdealPerson(RequestSearchIdealPerson requestSearchIdealPerson);
	
}
