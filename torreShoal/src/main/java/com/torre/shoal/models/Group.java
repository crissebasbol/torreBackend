package com.torre.shoal.models;

import lombok.Data;

@Data
public class Group {
	private String id;
	private int order;
	private double median;
	private double stddev;
	private String text;
	private String answer;
}
