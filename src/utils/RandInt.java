package utils;

import java.util.Random;

public class RandInt {
	
	public static int getRandInt(int min, int max) {
	    Random rand = new Random();
	    return rand.nextInt((max - min) + 1) + min;
	}
	
}
