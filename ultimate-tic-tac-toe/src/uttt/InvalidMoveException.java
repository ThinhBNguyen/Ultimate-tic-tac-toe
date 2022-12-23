package uttt;


public class InvalidMoveException extends Exception {


	public InvalidMoveException() {
		super();
	}
	
	public InvalidMoveException(String message) {
		super(message);
	}
	
	public InvalidMoveException(String message, Throwable err) {
		super(message, err);
	}
}
