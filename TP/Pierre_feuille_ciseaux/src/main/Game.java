package main;

public class Game {
	private Player player1 = new Player();
	private Player player2 = new Player();
	
	public void playOneTurn() {
		Shape s1 = player1.play();
		Shape s2 = player2.play();
		switch (s1.compareShape(s2)) {
		case 1:
			player1.addPoints(1);
			break;
		case -1:
			player2.addPoints(1);
			break;
		default:
		}
	}
	
	public void givePoints(Player player, int i) {
		player.addPoints(i);
	}
	
	public Player getPlayer1() {
		return this.player1;
	}
	
	public Player getPlayer2() {
		return this.player2;
	}
}
