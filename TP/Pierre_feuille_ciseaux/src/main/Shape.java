package main;

/**
 * @author Quentin POSSAMAI
 *
 */
public enum Shape {

	ROCK(1), PAPER(2), SCISSOR(3);
	
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
		switch ((o.value - this.value) % 3){
		case 1:
			return 1;
		case 2:
			return -1;
		default:
			return 0;
		}
		
	}

}
