package baris.kaplan;
import java.util.*; //importing all contents of java.util package by using .* notation
import java.util.*;
public class SystemInputOutput {
    public SystemInputOutput() {

    }

    public static void main(String[] args) {
        System.out.println("Enter a double value: ");
        Scanner sc = new Scanner(System.in);
        double d = sc.nextDouble();
        System.out.println(d);
    }
}
