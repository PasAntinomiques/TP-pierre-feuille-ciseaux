package tests;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import main.Player;
import main.Shape;

public class PlayerTest {
	@Test
	public void testPlay() {
		Player bob = new Player();
		assertTrue(bob.play() instanceof Shape);
	}
		
}
