package com.torre.shoal.models;

import java.util.List;

import lombok.Data;

@Data
public class Job {
	private String id;
	private String category;
	private String name;
	private List<Organization> organizations;
	private List<String> responsibilities;
	private String fromMonth;
	private String fromYear;
	private boolean remote;
	private String additionalInfo;
	private boolean highlighted;
	private double weight;
	private int verifications;
	private int recommendations;
	private List<Object> media;
	private int rank;
	private String toMonth;
	private String toYear;
}