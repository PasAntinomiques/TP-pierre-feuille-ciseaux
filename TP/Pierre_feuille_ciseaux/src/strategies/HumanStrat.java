package strategies;

import java.io.IOException;

import main.Shape;
import util.Input;

public class HumanStrat implements Strategy {

	@Override
	public Shape chooseShape() {
		System.out.println("Veuillez saisir un entier appartenant à [1, 3]");
		int answer = 0;
		try {
			answer = Input.readInt();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return Shape.fromInt(answer);
	}

	@Override
	public void rememberShape(Shape s) {
		// TODO Auto-generated method stub
		
	}

}
