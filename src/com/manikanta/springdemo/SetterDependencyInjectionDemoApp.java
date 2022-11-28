package com.manikanta.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDependencyInjectionDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		CricketCoach cricketCoach = context.getBean("cricketCoach", CricketCoach.class);
		System.out.println(cricketCoach.getDailyWorkout());
		System.out.println(cricketCoach.getDailyFortune());
		System.out.println(cricketCoach.getFortuneService().getFortune());
//		Call methods for literal values
		System.out.println("Email : " + cricketCoach.getEmailAddress());
		System.out.println("Team : " + cricketCoach.getTeam());
		context.close();
	}

}
