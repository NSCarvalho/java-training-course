package exceptions;

public class Task2Exception extends CustomException {

    public Task2Exception(String message) {
        super(message);
    }

    public Task2Exception(String message, Throwable cause) {
        super(message, cause);
    }
}


