package strategies;

import main.Shape;

/**
 * @author Jules
 * Strat : always play Paper
 */
public class PaperStrat implements Strategy {

	@Override
	public Shape chooseShape() {
		return Shape.PAPER;
	}

	@Override
	public void rememberShape(Shape s) {
		// TODO Auto-generated method stub
		
	}

}
