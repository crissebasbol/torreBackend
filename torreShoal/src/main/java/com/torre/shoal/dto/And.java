package com.torre.shoal.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class And {
	@JsonProperty("skill/role")
	private SkillRole skillRole;
}
