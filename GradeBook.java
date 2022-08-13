package baris.kaplan;

import java.util.*;

public class GradeBook {
    public static void main(String[] args) {
        int count = 0;
        int i = 0;
        int sum = 0;
        while (true) {
            try {
                String informativeMsg = "Enter " + (i + 1) + "";
                if (i == 0 || (3 <= i && i <= 9)) {
                    informativeMsg = informativeMsg.concat("th grade: ");
                } else if (i == 1) {
                    informativeMsg = informativeMsg.concat("nd grade: ");
                } else if (i == 2) {
                    informativeMsg = informativeMsg.concat("rd grade: ");
                }
                i++;
                System.out.println(informativeMsg);
                Scanner sc = new Scanner(System.in);
                int grade = sc.nextInt();
                if (grade == 101 || grade < 0 || i >= 10) {
                    break;
                } else {
                    sum = sum + grade;
                    count++;
                }
            } catch (InputMismatchException ex) {
                ex.printStackTrace();
            } catch (ArithmeticException e) {
                e.printStackTrace();
            }
        }

        double average = (double) sum / count;
        System.out.println("The average grade is : " + average);
    }
}
