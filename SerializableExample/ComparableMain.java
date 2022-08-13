package baris.kaplan.SerializableExample;

import java.util.ArrayList;
import java.util.List;

public class ComparableMain {

  public static void main(String[] args) {
      Student std1 = new Student("Ahmet", 1, 23);
      Student std2 = new Student("Mehmet", 200, 27);
      Student std3 = new Student("Ali", 300, 19);
      Student std4 = new Student("Hasan", 77, 18);
      List<Student> studentList = new ArrayList<>();


      studentList.add(std1);
      studentList.add(std2);
      studentList.add(std3);
      studentList.add(std4);

      for(Student student: studentList){
          System.out.print("Student name is: "+student.getName()+"," + " ");
          System.out.print("Student id is : "+student.getId()+"," + " ");
          System.out.print("Student age is: "+student.getAge()+"\n");
      }

      System.out.println();


      int size = studentList.size();
      System.out.println("The current size of the student list is : " + size + "");

      System.out.println();
      int i = 0;
      for (i = 0; i < size; i++) {
          System.out.print("Index: "+studentList.indexOf(studentList.get(i))+", ");
          System.out.print("Student: "+studentList.get(i) + "\n");
      }

      try {
          studentList.remove(0);
          studentList.remove(0);
          studentList.remove(1);
      } catch(NullPointerException npe){
          System.out.println("Invalid removing operation !!!");
          npe.printStackTrace();
          System.exit(0);
      }


      System.out.println();


      for(Student student: studentList){
          System.out.print("Student name is: "+student.getName()+"," + " ");
          System.out.print("Student id is : "+student.getId()+"," + " ");
          System.out.print("Student age is: "+student.getAge()+"\n");
      }


  }

}
