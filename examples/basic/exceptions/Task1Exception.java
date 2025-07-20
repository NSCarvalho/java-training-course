package exceptions;

public class Task1Exception extends CustomException {

    public Task1Exception(String message) {
        super(message);
    }

    public Task1Exception(String message, Throwable cause) {
        super(message, cause);
    }
}


