package com.deloitte;

import java.util.Random;

public class RandNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] article = {"the", "a",  "one", "some" };
		String [] noun = {"boy", "girl", "dog", "town", "car"};
		String [] verb =  {"drove", "jumped", "ran", "walked", "skipped"};
		String [] preposition = {"to", "from", "over", "under", "on"};
		Random rand=new Random();
		String sentence = "";
		sentence += article[rand.nextInt(3)];
		sentence = sentence.substring(0, 1).toUpperCase() + sentence.substring(1).toLowerCase();
		sentence += " "+noun[rand.nextInt(4)];
		sentence += " "+verb[rand.nextInt(4)];
		sentence += " "+preposition[rand.nextInt(4)];
		sentence += ".";
		System.out.println(sentence);
	}

}
