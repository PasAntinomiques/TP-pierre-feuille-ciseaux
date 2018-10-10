package strategies;

import main.Shape;

public class RockStrat implements Strategy {

	@Override
	public Shape chooseShape() {
		return Shape.ROCK;
	}

	@Override
	public void rememberShape(Shape s) {
		// TODO Auto-generated method stub
		
	}

}
