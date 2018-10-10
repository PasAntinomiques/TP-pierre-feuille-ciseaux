package tests;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import main.Shape;

public class ShapeTest {
	@Test
	public void testCompareShape() {
		assertTrue(Shape.PAPER.compareShape(Shape.ROCK) > 0);
		assertTrue(Shape.PAPER.compareShape(Shape.SCISSORS) < 0);
		assertTrue(Shape.PAPER.compareShape(Shape.PAPER) == 0);
		assertTrue(Shape.ROCK.compareShape(Shape.SCISSORS) > 0);
	}
	
}
