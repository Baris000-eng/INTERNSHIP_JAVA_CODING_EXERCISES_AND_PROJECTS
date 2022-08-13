package baris.kaplan;

public class StudentClass {
    private int id;
    private String name;

    public StudentClass(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public static void main(String[] args) {
        StudentClass stu1 = new StudentClass("Ahmet", 1);
        System.out.println("The id of stu1 is " + stu1.getId() + " now.");
        stu1.setName("Ahmet");
        StudentClass stu2 = stu1;
        System.out.println(stu1.getName());
        stu2.setName("Mehmet");
        System.out.println(stu1.getName());

        stu2.setId(22);
        System.out.println("The id of stu1 is " + stu1.getId() + " now.");

        stu2.setId(102);
        System.out.println("The id of stu1  is " + stu1.getId() + " now.");


    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
