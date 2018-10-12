package main;

import strategies.PaperStrat;
import strategies.RockStrat;

public class Main {

	public static void main(String[] args) {
		Game game = new Game();
		game.getPlayer1().changeStrategy(new PaperStrat());;
		game.getPlayer2().changeStrategy(new RockStrat());;
		for (int i = 0; i < 10; i++) {
			game.playOneTurn();
			System.out.println("Game number : " + i);
			System.out.println(game.getPlayer1().getPoints());
			System.out.println(game.getPlayer2().getPoints());
			System.out.println("");
		}
	}

}
