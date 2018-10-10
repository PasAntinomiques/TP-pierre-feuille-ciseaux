package main;

import java.util.Random;

public class Player {
	
	private int nbPoints;
	
	public Player() {
		this.nbPoints = 0;
	}
	
	public Shape play() {
		Random random = new Random();
		int nbAlea = random.nextInt(3) + 1;
		return Shape.fromInt(nbAlea);
	}
	
	public void addPoints(int i) {
		this.nbPoints += i;
	}
	
	public int getPoints() {
		return this.nbPoints;
	}
}
