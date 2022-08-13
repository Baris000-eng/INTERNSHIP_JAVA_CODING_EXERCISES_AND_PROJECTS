package baris.kaplan;

public class ForLoopExample2 {
    public static void main(String[] args) {
        int j = 0;
        for (j = 0; j < 10; j++) {
            if (j == 5) {
                continue; //continue command
            } else if (j == 8) {
                break; //break command
            }
            System.out.println("" + j);
        }
    }
}
