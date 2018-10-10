package main;

public class Player {
	
	private int nbPoints;
	
	public Player() {
		
	}
	
	public Shape play() {
		return Shape.ROCK;
	}
	
	public void addPoints(int i) {
		this.nbPoints += i;
	}
	
	public void getPoints() {
		
	}
}
