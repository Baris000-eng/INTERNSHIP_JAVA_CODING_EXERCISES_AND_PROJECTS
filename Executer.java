package baris.kaplan;
import java.io.*;
import java.util.*;

public class Executer {
    public static void main(String[] args) {
        GenericsUtility<StudentSerializable> gu = new GenericsUtility<StudentSerializable>();
        StudentSerializable s1 = new StudentSerializable("Ahmet",4444);
        gu.serialize(s1);
        StudentSerializable s2 = gu.deserialize();
        System.out.printf("The name of the student is: %s\n", s2.getName());
        System.out.printf("The id of the student is: %d\n",   s2.getId());
    }
}



