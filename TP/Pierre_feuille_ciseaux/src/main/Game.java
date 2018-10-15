package main;

public class Game {
	// The game is done with two players
	private Player player1 = new Player();
	private Player player2 = new Player();
	
	/**
	 * play one turn of a game instance
	 */
	public void playOneTurn() {
		// If strategy need last shape
		// It remembers it in order to play
		Shape s1 = player1.play();
		Shape s2 = player2.play();
		player1.remember(s2);
		player2.remember(s1);
		String result;
		switch (s1.compareShape(s2)) {
		case 1:
			player1.addPoints(1);
			result = "player 1";
			break;
		case -1:
			player2.addPoints(1);
			result = "player 2";
			break;
		default:
			result = "no one";
			break;
		}
		System.out.println("[TURN] 1 played " + s1 +" , 2 played " + s2 + " : " + result + " won !" );
	}
	
	/**
	 * @param player
	 * @param i is the point given to the player
	 */
	public void givePoints(Player player, int i) {
		player.addPoints(i);
	}
	
	/**
	 * @return The first player of a game
	 */
	public Player getPlayer1() {
		return this.player1;
	}
	
	/**
	 * @return The second player of a game
	 */
	public Player getPlayer2() {
		return this.player2;
	}
}
