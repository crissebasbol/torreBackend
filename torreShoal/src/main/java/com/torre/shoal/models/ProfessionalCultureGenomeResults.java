package com.torre.shoal.models;

import java.util.List;

import lombok.Data;

@Data
public class ProfessionalCultureGenomeResults {
	private List<Group> groups;
	private List<Analysis> analyses;
}
