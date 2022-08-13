package baris.kaplan.SerializableExample;

import java.util.HashSet;
import java.util.*;

public class ComparableMainForSets {
    public static void main(String[] args){
        Set<Student>studentSet = new HashSet<>();
        Student std = new Student("Barış",12345,30);
        studentSet.add(std);
        studentSet.add(new Student("Ege", 23456, 25));
        studentSet.add(new Student("Ege", 23456, 25));
        studentSet.add(new Student("Berker", 34567, 29));

        System.out.println("Size1: "+studentSet.size());

        //A Set is a collection type which cannot contain duplicate elements
        studentSet.remove(std);

        System.out.println("Size2: "+studentSet.size());

        studentSet.remove(new Student("Ege", 23456, 25));
        System.out.println("Size3: "+studentSet.size());
        studentSet.remove(new Student("Ege", 23456, 25));
        System.out.println("Size4: "+studentSet.size());
        studentSet.remove(new Student("Ege", 23456, 25));
        System.out.println("Size5: "+studentSet.size());
        studentSet.remove(new Student("Berker", 34567, 29));
        System.out.println("Size6: "+studentSet.size());

        studentSet.remove(std);
        System.out.println("Size7: "+studentSet.size());





    }
}
