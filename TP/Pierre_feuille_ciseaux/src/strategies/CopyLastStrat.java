package strategies;

import main.Shape;

/**
 * @author Jules
 * One memory strat : plays the shape last played by the other player (plays randomly on the first turn)
 */
public class CopyLastStrat extends OneMemoryStrat implements Strategy {

	@Override
	public Shape chooseShape() {
		if(this.memory == null) {
			return Shape.randomShape();
		}
		else {
			return this.memory;
		}
		
	}


}
