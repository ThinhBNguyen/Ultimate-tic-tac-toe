package uttt;

public class MultipleMovesException extends Exception {

	public MultipleMovesException() {
		super();
	}
	
	public MultipleMovesException(String message) {
		super(message);
	}
	
	public MultipleMovesException(String message, Throwable err) {
		super(message, err);
	}
	
}
