package strategies;

import main.Shape;

/**
 * @author Jules
 * Abstract super class for one memory strategies
 */
public abstract class OneMemoryStrat implements Strategy {

	/**
	 * inique memory for the last shape played by the other player
	 */
	protected Shape memory = null;

	@Override
	public void rememberShape(Shape s) {
		// TODO Auto-generated method stub
		this.memory = s;
	}

}
