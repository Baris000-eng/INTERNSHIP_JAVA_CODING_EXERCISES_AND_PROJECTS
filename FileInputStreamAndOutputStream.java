package baris.kaplan;
import baris.kaplan.file.FileInputStreamOperation;
import baris.kaplan.file.FileOperation;

import java.io.*;

public class FileInputStreamAndOutputStream {

    public static void main(String[] args){
        String string_path = "/Users/barissss/eclipse-workspace/JIG-G2-2022/src/baris.kaplan/f.txt";
        String welcome = "Welcome to OBSS !!";
        FileInputStreamOperation fis = new FileInputStreamOperation();
        fis.fileRead(string_path);
        fis.fileWrite(string_path,welcome);
        benchmark(string_path,fis);
    }




    public static void benchmark(String string_path, FileOperation fo){
        System.out.println("\n" + fo.info());
        StringBuilder sb = new StringBuilder("Hello");
        for(int i=0;i<100;i++){
           sb.append("Hello \n");
        }
        long start = System.nanoTime();
        fo.fileWrite(string_path,sb.toString());
        long end = System.nanoTime();

        long diff = end - start;

        System.out.println("\n The execution time in nanoseconds is : " + diff + " \n");











    }
}
