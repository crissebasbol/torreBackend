package com.torre.shoal.models;

import lombok.Data;

@Data
public class Flags {
	private boolean benefits;
	private boolean canary;
	private boolean enlauSource;
	private boolean fake;
	private boolean featureDiscovery;
	private boolean firstSignalSent;
	private boolean signalsOnboardingCompleted;
	private boolean importingLinkedin;
	private boolean onBoarded;
	private boolean remoter;
	private boolean signalsFeatureDiscovery;
	private boolean importingLinkedinRecommendations;
	private boolean contactsImported;
	private boolean appContactsImported;
	private boolean genomeCompletionAcknowledged;
}