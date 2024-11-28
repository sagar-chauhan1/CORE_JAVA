package exception;

public class InvalidAgeException extends RuntimeException {
	
	public InvalidAgeException() {
		super("your age is less than 18.");
	}
}
