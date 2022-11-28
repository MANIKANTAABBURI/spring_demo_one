package com.manikanta.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifecycleDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifecycle-applicationContext.xml");
		
		Coach theCoach = context.getBean("trackCoach", Coach.class);
		Coach alphaCoach = context.getBean("trackCoach", Coach.class);
		
		boolean areTheySame = (theCoach == alphaCoach);
		System.out.println("Is the bean Singleton or not : "+areTheySame);
		System.out.println("Memory location of theCoach : "+theCoach);
		System.out.println("Memory location of alphaCoach : "+alphaCoach);
		
		context.close();
	}

}

