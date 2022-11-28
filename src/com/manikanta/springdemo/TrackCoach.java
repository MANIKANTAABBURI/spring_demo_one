package com.manikanta.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	public TrackCoach() {
		super();
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Hello message!"+fortuneService.getFortune();
	}
	
	// Init method
	public void doMyStartupStuff() {
		System.out.println("This is inside track coach init method");
	}
	// Destory method
	public void doMyCleanupStuff() {
		System.out.println("This is inside track coach destroy method ");
	}

}
