package strategies;

import main.Shape;

public interface Strategy {
	/**
	 * @return next Shape to be played (may consider he past played shapes)
	 */
	public Shape chooseShape();
	/**
	 * @param s Shape to be remembered by the Strategy
	 */
	public void rememberShape(Shape s);
}
