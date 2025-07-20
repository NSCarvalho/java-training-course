package exceptions;

public class Task3Exception extends RuntimeException {

    public Task3Exception(String message) {
        super(message);
    }

    public Task3Exception(String message, Throwable cause) {
        super(message, cause);
    }
}


