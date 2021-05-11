package com.torre.shoal.models;

import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public class Strength {
	private String id;
	private int code;
	private String name;
	private String additionalInfo;
	private int weight;
	private int recommendations;
	private List<Object> media;
	private Date created;
}
