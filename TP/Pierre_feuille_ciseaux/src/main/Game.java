package main;

public class Game {
	Player player1 = new Player();
	Player player2 = new Player();
	
	public void playOneTurn() {
		Shape s1 = player1.play();
		Shape s2 = player2.play();
		switch (s1.compareShape(s2)) {
		case 1:
			givePoints(player1, 1);
		case -1:
			givePoints(player2, 1);
		default:
		}
	}
	
	public void givePoints(Player player, int i) {
		player.addPoints(i);;
	}
}
