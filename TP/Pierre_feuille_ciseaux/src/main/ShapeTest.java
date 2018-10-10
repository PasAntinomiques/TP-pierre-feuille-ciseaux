package main;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ShapeTest {
	@Test
	public void testCompareShape() {
		assertTrue(Shape.PAPER.compareShape(Shape.ROCK) > 0);
		assertTrue(Shape.PAPER.compareShape(Shape.SCISSOR) < 0);
		assertTrue(Shape.PAPER.compareShape(Shape.PAPER) == 0);
		assertTrue(Shape.ROCK.compareShape(Shape.SCISSOR) > 0);
	}
}
