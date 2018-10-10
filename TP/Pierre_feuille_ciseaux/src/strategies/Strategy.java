package strategies;

public interface Strategy {
	public Shape chooseShape();
	public void rememberShape(Shape s);
}
