package baris.kaplan;

import java.io.FileReader;
import java.io.FileWriter;

public class FileReadingExample {
    public static void main(String args[]) throws Exception {
        String path = "/Users/barissss/eclipse-workspace/JIG-G2-2022/src/baris.kaplan/f.txt";
        String s = "Benim adım Barış.";
        double init = System.currentTimeMillis();
        FileReader fr = new FileReader(path);
        if (fr == null) {
            System.out.println("Null File Reader Object !!");
            throw new NullPointerException();
        } else {
            int w;
            while ((w = fr.read()) != -1) {
                System.out.print((char)w);
            }

        }


        double end = System.currentTimeMillis();
        double diff = end - init;
        System.out.println();
        System.out.println("The execution time of file reading is : "+(diff)+" milliseconds.");
        System.out.println();
        double second =  ((double)diff / (Math.pow(10.0,3)));
        System.out.println("The execution time of file reading is : "+(second)+" seconds.");
        System.out.println();

        try {
            FileWriter fwr = new FileWriter(path, true);
            if (fwr == null) {
                System.out.println("Null File Writer Object !!");
                throw new NullPointerException();
            } else {
                int len = s.length();
                int r = 0;
                for (r = 0; r < len; r++) {
                    char ch = s.charAt(r);
                    fwr.write(ch);
                }
                fwr.close();
            }
        } catch (Exception e) {
            e.getStackTrace();
        }

        double mainEnd = System.currentTimeMillis();

        double secondDiff = mainEnd-end;

        System.out.println("The execution time of file writing is : "+(secondDiff)+" milliseconds.");
        System.out.println();
        double sec = (double) (diff / (Math.pow(10.0,3)));
        System.out.println("The execution time of file writing is : "+(sec)+" seconds.");
        System.out.println();
    }
}
