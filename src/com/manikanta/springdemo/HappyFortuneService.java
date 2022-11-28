package com.manikanta.springdemo;
import java.util.Random;

public class HappyFortuneService implements FortuneService {
	String[] fortunes = {"Today you might get injured!",
			"Your hard work is going to give you a clear result today",
			"Chances of hattrick are high"};
	private Random myRandom = new Random();
	@Override
	public String getFortune() {
		int index = myRandom.nextInt(fortunes.length);
		return fortunes[index];
	}

}
