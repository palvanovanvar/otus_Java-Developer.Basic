package lesson14;

public class TestException extends Exception {
    private int errorCode;

    public TestException(String message) {
        this(0, message);
    }

    public TestException(int errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }

    public int getErrorCode() {
        return errorCode;
    }
}