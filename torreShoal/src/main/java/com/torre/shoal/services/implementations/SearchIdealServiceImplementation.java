package com.torre.shoal.services.implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.torre.shoal.constants.TorreEndpoints;
import com.torre.shoal.dto.RequestSearchIdealPerson;
import com.torre.shoal.services.SearchIdealService;

@Service
public class SearchIdealServiceImplementation implements SearchIdealService {
	
	private RestTemplate restTemplate;

	@Autowired
	public SearchIdealServiceImplementation(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	@Override
	public Object searchIdealPerson(RequestSearchIdealPerson requestSearchIdealPerson) {
		
		return this.restTemplate.postForObject(TorreEndpoints.SEARCH_PEOPLE, requestSearchIdealPerson, Object.class);
	}

}
