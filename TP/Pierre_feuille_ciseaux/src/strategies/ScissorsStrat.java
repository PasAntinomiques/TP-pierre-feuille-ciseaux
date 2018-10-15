package strategies;

import main.Shape;

/**
 * @author Jules
 * Strat : always plays scissors 
 */
public class ScissorsStrat implements Strategy {

	@Override
	public Shape chooseShape() {
		return Shape.SCISSORS;
	}

	@Override
	public void rememberShape(Shape s) {
		// TODO Auto-generated method stub

	}

}
