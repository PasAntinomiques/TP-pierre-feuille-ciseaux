package strategies;

import main.Shape;

public abstract class OneMemoryStrat implements Strategy {

	protected Shape memory = null;

	@Override
	public void rememberShape(Shape s) {
		// TODO Auto-generated method stub
		this.memory = s;
	}

}
