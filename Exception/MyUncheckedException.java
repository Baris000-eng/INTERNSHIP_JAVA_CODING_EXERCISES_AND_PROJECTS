package baris.kaplan.Exception;

public class MyUncheckedException extends RuntimeException {
    public Exception exc;

    public MyUncheckedException(Exception exc){
        this.exc = exc;
    }
}
