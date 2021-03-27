package by.silebin.arrays_task.reader.exception;

public class NoValidDataException extends Exception{
    public NoValidDataException() {
    }

    public NoValidDataException(String message) {
        super(message);
    }

    public NoValidDataException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoValidDataException(Throwable cause) {
        super(cause);
    }
}
