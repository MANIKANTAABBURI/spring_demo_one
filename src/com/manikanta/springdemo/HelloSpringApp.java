package com.manikanta.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// retrieve bean from spring container
		Coach trackCoach = context.getBean("trackCoach", Coach.class);
		Coach baseballCoach = context.getBean("baseballCoach", Coach.class);
		// Call methods on the bean
		System.out.println(trackCoach.getDailyWorkout());
		System.out.println(trackCoach.getDailyFortune());
		System.out.println("Do this you brat : "+baseballCoach.getDailyWorkout());
		System.out.println("Your fortune brat : "+baseballCoach.getDailyFortune());
		// Close context
		context.close();
	}

}
