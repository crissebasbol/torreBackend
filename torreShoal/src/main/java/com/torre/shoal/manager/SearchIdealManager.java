package com.torre.shoal.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.torre.shoal.dto.RequestSearchIdealPerson;
import com.torre.shoal.services.SearchIdealService;

@Component
public class SearchIdealManager {
	
	private SearchIdealService searchIdealService;
	
	@Autowired
	public SearchIdealManager(SearchIdealService searchIdealService) {
		this.searchIdealService = searchIdealService;
	}
	
	public Object searchIdealPerson(RequestSearchIdealPerson requestSearchIdealPerson) {
		return this.searchIdealService.searchIdealPerson(requestSearchIdealPerson);
	}
	
	

}
