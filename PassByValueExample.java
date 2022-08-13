package baris.kaplan;

public class PassByValueExample {
    public static void main(String[] args){
        PassByValueExample p = new PassByValueExample();
        p.method1();



    }



    void method1(){
        int x = 999;
        changeValue(x);
        System.out.println("x is: "+x);
    }

    void changeValue(int x){
        x = x - 50;
        System.out.println("x is "+x+" now.");
        x = x + 125;
        System.out.println("x is "+x+" now.");
        x = x * 2;
        System.out.println("x is "+x+" now.");
        x = x / 5;
        System.out.println("x is "+x+" now.");
    }
}
