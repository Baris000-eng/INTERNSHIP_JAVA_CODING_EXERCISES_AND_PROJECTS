package baris.kaplan.SerializableExample;

import java.io.*;

public class Main {
    public static Student std;

    public static void main(String[] args){

        String path = "/Users/barissss/eclipse-workspace/JIG-G2-2022/src/baris.kaplan/f.txt";
        serialize(path);
        deserialize(path);
        printStudentInfo();
    }

    public static void serialize(String path){
        std = new Student("Ahmet", 2, 20);
        try {
            FileOutputStream fos = new FileOutputStream(path);
            if(fos==null){
                System.out.println("fos object is null !!");
                throw new NullPointerException();
            }
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            if(oos==null){
                System.out.println("oos object is null !!!");
                throw new NullPointerException();
            }
            oos.writeObject(std);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }


    }


    public static void deserialize(String path){
        try {
            FileInputStream fs = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fs);
            std = (Student) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


    public static void printStudentInfo() {
        System.out.printf("Student Name: %s\n",std.getName());
        System.out.printf("Student Age: %d\n",std.getAge());
        System.out.printf("Student ID: %d\n",std.getId());
    }


}
