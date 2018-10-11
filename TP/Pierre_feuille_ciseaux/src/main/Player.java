package main;

import strategies.*;


public class Player {
	
	private int nbPoints;
	private Strategy strat;
	
	public Player() {
		this.strat = new RandomStrat();
		this.nbPoints = 0;
	}
	
	public Shape play() {
		return this.strat.chooseShape();
	}
	
	public void addPoints(int i) {
		this.nbPoints += i;
	}
	
	public int getPoints() {
		return this.nbPoints;
	}
	
	public void changeStrategy(Strategy strategy) {
		this.strat = strategy;
	}
}
