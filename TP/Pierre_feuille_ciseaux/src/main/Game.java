package main;

public class Game {
	private Player player1 = new Player();
	private Player player2 = new Player();
	
	public void playOneTurn() {
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
