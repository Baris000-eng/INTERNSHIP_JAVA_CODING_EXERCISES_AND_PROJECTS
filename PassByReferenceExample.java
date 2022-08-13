package baris.kaplan;

public class PassByReferenceExample {
    public static void main(String[] args) {
        PassByReferenceExample p = new PassByReferenceExample();
        StudentClass s = new StudentClass("Hasan", 3);
        System.out.println("Old name of the student is: " + s.getName());
        p.changeValue(s);
        System.out.println("New name of the student is: " + s.getName());
    }


    public void changeValue(StudentClass stu) {
        stu.setName("Ahmet");
        System.out.println("Name: " + stu.getName());
    }
}
