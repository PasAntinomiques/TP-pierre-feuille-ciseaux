package main;

import strategies.*;


public class Player {
	
	private int nbPoints;
	private Strategy strat;
	
	/**
	 * By default, strategy is random
	 */
	public Player() {
		this.strat = new RandomStrat();
		this.nbPoints = 0;
	}
	
	/**
	 * @return The shape of the chosen strategy
	 */
	public Shape play() {
		return this.strat.chooseShape();
	}
	
	/**
	 * @param i is the points to add to this player
	 */
	public void addPoints(int i) {
		this.nbPoints += i;
	}
	
	/**
	 * @return current points of the player
	 */
	public int getPoints() {
		return this.nbPoints;
	}
	
	/**
	 * @param strategy to play with
	 */
	public void changeStrategy(Strategy strategy) {
		this.strat = strategy;
	}
	
	/**
	 * @param s the shape to remember for play consequently
	 */
	public void remember(Shape s) {
		this.strat.rememberShape(s);
	}

	/* 
	 * Print the strategy and the point number
	 */
	@Override
	public String toString() {
		return "Player ["+strat.getClass().getSimpleName() + "] nbPoints : " + nbPoints;
	}
	
	
}
