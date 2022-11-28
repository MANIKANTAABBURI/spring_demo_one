package com.manikanta.springdemo;

public class MyApp {

	public static void main(String[] args) {
		// Create the base ball coach object
		Coach theCoach = new TrackCoach();
		
		System.out.println(theCoach.getDailyWorkout());			
	}

}
