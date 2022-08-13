package baris.kaplan;

import java.util.Random;
import java.util.*;

public class RandomNumbers {
    public static void main(String[] args){
        Random r = new Random();
        int attempt = 0;
        int rand = r.nextInt(4);
        System.out.println("***Welcome to Number Guessing Game***");
        while (true) {
            System.out.println("Please enter your guess: ");
            Scanner sc = new Scanner(System.in);
            int guess = sc.nextInt();
            attempt++;
            if (guess < rand) {
                System.out.println("Smaller guess is done");
            } else if (guess > rand) {
                System.out.println("Bigger guess is done");
            } else {
                System.out.println("You have won the game !");
                break;
            }
            if (attempt > 5) {
                System.out.println("Game Over. You cannot guess the number");
                System.out.println("The random number is " +rand);
                break;
            }
        }
    }
}
