package com.manikanta.springdemo;

public class CricketCoach implements Coach {

	
	private FortuneService fortuneService;	
	private String emailAddress;
	private String team;
	


	public String getEmailAddress() {
		return emailAddress;
	}


	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}


	public FortuneService getFortuneService() {
		return fortuneService;
	}


	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}


	public String getTeam() {
		return team;
	}


	public void setTeam(String team) {
		this.team = team;
	}


	public CricketCoach() {
		System.out.println("Cricket coach default constructor");
	}


	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice fast bowling for all day";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
