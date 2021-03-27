package by.silebin.arrays_task.service.exception;

public class EmptyArrayException extends Exception {
    public EmptyArrayException() {
    }

    public EmptyArrayException(String message) {
        super(message);
    }

    public EmptyArrayException(String message, Throwable cause) {
        super(message, cause);
    }

    public EmptyArrayException(Throwable cause) {
        super(cause);
    }

}
