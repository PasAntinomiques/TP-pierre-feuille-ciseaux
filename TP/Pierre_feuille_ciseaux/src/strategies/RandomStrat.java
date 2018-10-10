package strategies;

import java.util.Random;

import main.Shape;

public class RandomStrat implements Strategy {

	@Override
	public Shape chooseShape() {
		Random random = new Random();
		int nbAlea = random.nextInt(3) + 1;
		return Shape.fromInt(nbAlea);
	}

	@Override
	public void rememberShape(Shape s) {
		// Don't do anything
	}

}
