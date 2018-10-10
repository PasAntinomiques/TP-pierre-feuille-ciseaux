package main;

public class Game {
	
	public void playOneTurn() {
		Player player1 = new Player();
		Player player2 = new Player();
		
		Shape s1 = player1.play();
		Shape s2 = player2.play();
		if (s1.compareShape(s2)) {
//			givePoints(cmd)
		}
	}
	
	public int givePoints(int cmp) {
		return 0;
	}
}
