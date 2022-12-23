package uttt;
 

public class MoveNotMadeException extends RuntimeException {

	public MoveNotMadeException() {
		super();
	}
	
	public MoveNotMadeException(String message) {
		super(message);
	}
	
	public MoveNotMadeException(String message, Throwable err) {
		super(message, err);
	}
	
}
