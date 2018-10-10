package image;

public class UnknownPixelException extends RuntimeException {

	public UnknownPixelException() {
	}
	
	public UnknownPixelException(String msg) {
		super(msg);
	}
}
