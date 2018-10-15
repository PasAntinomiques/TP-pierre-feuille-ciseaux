package strategies;

import main.Shape;

/**
 * @author Jules
 * One memory strat : plays the shape beating the last one played by the other player (plays randomly on the first turn)
 */
public class BeatLastStrat extends OneMemoryStrat implements Strategy {

	@Override
	public Shape chooseShape() {
		if(this.memory == null) {
			return Shape.randomShape();
		}
		else {
			return Shape.beatingShape(this.memory);
		}
	}

}
