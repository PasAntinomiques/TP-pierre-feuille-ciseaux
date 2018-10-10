package strategies;

import main.Shape;

public interface Strategy {
	public Shape chooseShape();
	public void rememberShape(Shape s);
}
