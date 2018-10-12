package strategies;

import main.Shape;

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
