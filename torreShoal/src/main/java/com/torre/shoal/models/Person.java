package com.torre.shoal.models;

import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public class Person {
	private String professionalHeadline;
	private double completion;
	private boolean showPhone;
	private Date created;
	private boolean verified;
	private Flags flags;
	private double weight;
	private String locale;
	private int subjectId;
	private String picture;
	private boolean hasEmail;
	private boolean isTest;
	private String name;
	private List<Link> links;
	private Location location;
	private String theme;
	private String id;
	private String pictureThumbnail;
	private boolean claimant;
	private String summaryOfBio;
	private String weightGraph;
	private String privateId;
}