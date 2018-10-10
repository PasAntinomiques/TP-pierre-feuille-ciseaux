package strategies;

import main.Shape;

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
