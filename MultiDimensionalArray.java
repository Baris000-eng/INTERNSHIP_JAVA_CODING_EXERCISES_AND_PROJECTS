package baris.kaplan;

import java.util.*;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        int[][] multiDimArr = new int[10][2];
        for (int i = 0; i < 10; i++) {
            Random rand = new Random();
            int a = rand.nextInt(0, 10001);
            int b = rand.nextInt(0, 101);
            multiDimArr[i][1] = a; //assigning random numbers to numbers column
            multiDimArr[i][0] = b; //assigning random numbers to codes column
        }
        int minNum = multiDimArr[0][1];
        int maxNum = multiDimArr[0][1];
        int minCode = multiDimArr[0][0];
        int maxCode = multiDimArr[0][0];

        System.out.println("Codes: ");
        for (int i = 0; i < 10; i++) {
            if (i != 9) {
                System.out.print(multiDimArr[i][0] + ",");
            } else {
                System.out.print(multiDimArr[i][0]);
            }

        }

        for (int k = 0; k < 2; k++) {
            System.out.println();
        }
        System.out.println("Numbers: ");
        for (int i = 0; i < 10; i++) {
            if (i != 9) {
                System.out.print(multiDimArr[i][1] + ",");
            } else {
                System.out.print(multiDimArr[i][1]);
            }
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            if (multiDimArr[i][0] <= minCode) {
                minCode = multiDimArr[i][0];
            } else if (multiDimArr[i][0] >= maxCode) {
                maxCode = multiDimArr[i][0];
            } else if (multiDimArr[i][1] <= minNum) {
                minNum = multiDimArr[i][1];
            } else if (multiDimArr[i][1] >= maxNum) {
                maxNum = multiDimArr[i][1];
            }
        }

        System.out.println();

        System.out.println("Max code is: " + maxCode);
        System.out.println("Min code is: " + minCode);
        System.out.println("Max number is: " + maxNum);
        System.out.println("Min number is: " + minNum);
    }


}
