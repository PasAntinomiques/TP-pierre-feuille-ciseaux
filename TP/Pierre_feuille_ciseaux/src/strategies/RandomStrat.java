package strategies;

import main.Shape;

/**
 * @author Jules
 * Strat : always plays a random choosen Shape
 */
public class RandomStrat implements Strategy {

	@Override
	public Shape chooseShape() {
		return Shape.randomShape();
	}

	@Override
	public void rememberShape(Shape s) {
		// Don't do anything
	}

}
