package com.torre.shoal.models;

import java.util.List;

import lombok.Data;

@Data
public class Education {
	private String id;
	private String category;
	private String name;
	private List<Organization> organizations;
	private List<Object> responsibilities;
	private String fromMonth;
	private String fromYear;
	private String toMonth;
	private String toYear;
	private boolean remote;
	private String additionalInfo;
	private boolean highlighted;
	private int weight;
	private int verifications;
	private int recommendations;
	private List<Object> media;
	private int rank;
}