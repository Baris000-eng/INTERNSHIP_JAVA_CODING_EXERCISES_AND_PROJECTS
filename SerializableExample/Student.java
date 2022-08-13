package baris.kaplan.SerializableExample;

import java.io.Serializable;

public class Student implements Serializable,Comparable<Student> {
    /*transient*/ private String name;

    //Transient Data:
    //Some data are not serializable or you dont want to contain them
    //into the persistent data (for security reasons)
    private int id;
    private int age;
    private int no;
    public Student(String name, int id, int age){
        this.name = name;
        this.id = id;
        this.age = age;
    }

    /*public Student() {
           this.name= "";
           this.no=0;
    }*/

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }


    @Override
    public int hashCode(){
        return this.id;
    }


    @Override
    public boolean equals(Object object){
        if(object==null){
            System.out.println("The object is null !!!");
            throw new NullPointerException();
        }
       if(this.age==((Student)object).age){
           return true;
       }
           return false;
    }

    @Override
    public int compareTo(Student o) {
        if(o==null){
            System.out.println("student object is null");
            throw new NullPointerException();
        }
        if(this.id>o.id){
            return 1;
        } else if(this.id==o.id){
            return 0;
        }
            return -1;
    }
}
