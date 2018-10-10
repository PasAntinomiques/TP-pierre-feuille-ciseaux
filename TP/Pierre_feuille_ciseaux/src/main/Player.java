package main;

public class Player {
	
	private int nbPoints;
	
	public Player() {
		this.nbPoints = 0;
	}
	
	public Shape play() {
		return Shape.ROCK;
	}
	
	public void addPoints(int i) {
		this.nbPoints += i;
	}
	
	public int getPoints() {
		return this.nbPoints;
	}
}
