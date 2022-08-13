package baris.kaplan.Exception;

public class MyCheckedException extends Exception {
    public Exception ex;
    public MyCheckedException(Exception ex){
        this.ex = ex;
    }
}
