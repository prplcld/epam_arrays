package by.silebin.arrays_task.service.exception;

public class NoElementsInArrayException extends Exception {
    public NoElementsInArrayException() {
    }

    public NoElementsInArrayException(String message) {
        super(message);
    }

    public NoElementsInArrayException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoElementsInArrayException(Throwable cause) {
        super(cause);
    }

}
