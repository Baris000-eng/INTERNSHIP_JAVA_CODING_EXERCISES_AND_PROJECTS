package baris.kaplan.Exception;

public class Executor {

    public static int exec() throws MyCheckedException {
        int div = 0;
        try {
            div = Divider.divide();
        } catch (ArithmeticException ex) {
           throw ex;
        }
        return div;
    }

}

