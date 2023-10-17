package learning.exceptionHandling;

public class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}
