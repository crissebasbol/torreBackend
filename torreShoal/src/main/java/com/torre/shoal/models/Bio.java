package com.torre.shoal.models;

import java.util.List;

import lombok.Data;

@Data
public class Bio{
	 private Person person;
	 private Stats stats;
	 private List<Strength> strengths;
	 private List<Interest> interests;
	 private List<Experience> experiences;
	 private List<Object> awards;
	 private List<Job> jobs;
	 private List<Object> projects;
	 private List<Object> privateations;
	 private List<Education> education;
	 private List<Opportunity> opportunities;
	 private List<Language> languages;
	 private PersonalityTraitsResults personalityTraitsResults;
	 private ProfessionalCultureGenomeResults professionalCultureGenomeResults;

}




