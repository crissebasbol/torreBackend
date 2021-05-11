package com.torre.shoal.models;

import java.util.List;

import lombok.Data;

@Data
public class People {
	private Aggregators aggregators;
	private int offset;
	private List<Result> results;
	private int size;
	private int total;
	
	@Data
	private class Aggregators {
		private List<Opento> opento;
		private List<Remoter> remoter;
		private List<Skill> skill;
		private List<Compensationrange> compensationrange;
	}
	
	@Data
	private class Opento {
		private int total;
		private String value;
	}

	@Data
	private class Remoter {
		private int total;
		private String value;
	}

	@Data
	private class Skill {
		private int total;
		private String value;
	}

	@Data
	private class Compensationrange {
		private int total;
		private String value;
	}
	
	@Data
	private class Result {
		private Context context;
		private Meta _meta;
		private Compensations compensations;
		private String locationName;
		private String name;
		private List<Object> openTo;
		private String picture;
		private String professionalHeadline;
		private boolean remoter;
		private List<Skill> skills;
		private String subjectId;
		private String username;
		private boolean verified;
		private double weight;
	}

	@Data
	private class Context {
		private Object signaled;
	}
	
	@Data
	private class Meta {
		private Ranker ranker;
		private Filter filter;
	}

	@Data
	private class Skill2 {
		private String name;
		private String skillRef;
		private double weight;
	}

	@Data
	private class Experiences {
		private double kotlin;
		private List<Projectmanagement> projectmanagement;
		private List<Management> management;
		private List<Leadership> leadership;
		private List<Teamwork> teamwork;
		private List<Dataanalysi> dataanalysis;
		private List<Machinelearning> machinelearning;
		private List<Flask> flask;
		private List<AW> aWS;
		private List<Datascience> datascience;
		private List<Python> python;
		private List<SoftwareDevelopment> softwareDevelopment;
		private List<Communication> communication;
		private List<Computervision> computervision;
		private List<BiomedicalMedicalengineering> biomedicalMedicalengineering;
		private List<Creativity> creativity;
	}

	@Data
	private class Criteria {
		private List<Skill> skills;
		private Experiences experiences;
		private String mode;
		private List<String> queries;
	}

	@Data
	private class Projectmanagement {
		private String experienceRef;
		private String name;
		private double months;
		private String category;
	}

	@Data
	private class Management {
		private String experienceRef;
		private String name;
		private double months;
		private String category;
	}

	@Data
	private class Leadership {
		private String experienceRef;
		private String name;
		private double months;
		private String category;
	}

	@Data
	private class Teamwork {
		private String experienceRef;
		private String name;
		private double months;
		private String category;
	}

	@Data
	private class Dataanalysi {
		private String experienceRef;
		private String name;
		private double months;
		private String category;
	}

	@Data
	private class Machinelearning {
		private String experienceRef;
		private String name;
		private double months;
		private String category;
	}

	@Data
	private class Flask {
		private String experienceRef;
		private String name;
		private double months;
		private String category;
	}

	@Data
	private class AW {
		private String experienceRef;
		private String name;
		private double months;
		private String category;
	}

	@Data
	private class Datascience {
		private String experienceRef;
		private String name;
		private double months;
		private String category;
	}

	@Data
	private class Python {
		private String experienceRef;
		private String name;
		private double months;
		private String category;
	}

	@Data
	private class SoftwareDevelopment {
		private String experienceRef;
		private String name;
		private double months;
		private String category;
	}

	@Data
	private class Communication {
		private String experienceRef;
		private String name;
		private double months;
		private String category;
	}

	@Data
	private class Computervision {
		private String experienceRef;
		private String name;
		private double months;
		private String category;
	}

	@Data
	private class BiomedicalMedicalengineering {
		private String experienceRef;
		private String name;
		private double months;
		private String category;
	}

	@Data
	private class Creativity {
		private String experienceRef;
		private String name;
		private double months;
		private String category;
	}

	@Data
	private class Person {
		private List<Skill> skills;
		private Experiences experiences;
		private String value;
		private double weight;
		private double completion;
		private double grammar;
	}

	@Data
	private class Input {
		private Criteria criteria;
		private Person person;
	}

	@Data
	private class Or {
		private String type;
		private double rank;
		private String scorer;
		private double score;
		private Input input;
		private boolean pass;
		private String id;
	}

	@Data
	private class And {
		private String type;
		private double rank;
		private double score;
		private List<Or> or;
		private String scorer;
		private Input input;
	}

	@Data
	private class Ranker {
		private String type;
		private double rank;
		private double score;
		private List<And> and;
	}

	@Data
	private class Filter {
		private String type;
		private boolean pass;
		private List<Or> or;
	}

	@Data
	private class Compensations {
	}
}
