package com.torre.shoal.models;

import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public class Interest {
	private String id;
	private int code;
	private String name;
	private List<Object> media;
	private Date created;
	private String additionalInfo;
}
