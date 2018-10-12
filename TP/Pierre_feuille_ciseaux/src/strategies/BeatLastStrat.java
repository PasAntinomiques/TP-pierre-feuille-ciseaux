package strategies;

import main.Shape;

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
