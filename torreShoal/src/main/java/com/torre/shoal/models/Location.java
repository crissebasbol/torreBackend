package com.torre.shoal.models;

import lombok.Data;

@Data
public class Location {
	private String name;
	private String shortName;
	private String country;
	private double latitude;
	private double longitude;
	private String timezone;
	private int timezoneOffSet;
}