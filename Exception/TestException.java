package baris.kaplan.Exception;

public class TestException {
    public static void main(String[]args) /*throws MyCheckedException*/{
        System.out.println("Program başladı ...");
        try {
            Executor.exec();
        } catch (MyCheckedException e) {
            System.out.println("MyCheckedException has occurred !!");
        } catch(ArithmeticException ex){
            System.out.println("An Exception happened !!!");
        } catch(Exception ex){
            System.out.println("A Different Exception happened !!!");
        }

        System.out.println("Program çalışmaya devam ediyor ...");
    }
}
