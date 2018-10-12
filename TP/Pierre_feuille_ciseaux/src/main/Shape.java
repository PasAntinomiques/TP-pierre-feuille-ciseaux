package main;

import java.util.Random;

/**
 * @author Quentin POSSAMAI
 *
 */
public enum Shape {

	ROCK(3), PAPER(2), SCISSORS(1);
	
	private final int value;
	private Shape(int value) {
		this.value = value;
	}


	/**
	 * @param o another shape
	 * @return a negative number if this < o
	 * 		   a positive number if this > o
	 *         0 if this equals o
	 */
	public int compareShape(Shape o) {
		int res = Math.floorMod(o.value - this.value,3);
		switch (res){
		case 1:
			return 1;
		case 2:
			return -1;
		default:
			return 0;
		}
	}
	
	public int getValue() {
		return this.value;
	}
	
	public static Shape fromInt(int i) {
		switch(i) {
		case 1 :
			return SCISSORS;
		case 2 :
			return PAPER;
		default :
			return ROCK;
		}
	}
	
	public static Shape randomShape() {
		Random random = new Random();
		int nbAlea = random.nextInt(3) + 1;
		return Shape.fromInt(nbAlea);
	}

}
