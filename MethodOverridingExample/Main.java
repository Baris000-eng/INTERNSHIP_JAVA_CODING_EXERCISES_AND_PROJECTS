package baris.kaplan.MethodOverridingExample;

public class Main {
    public static void main(String[] args) {
        Animal an = new Animal();
        System.out.println(an.makeNoise());
        Animal lion = new Lion();
        System.out.println(lion.makeNoise());

        Lion lion2 = new Lion();
        System.out.println(lion2.makeNoise());
        makeNoise(lion2); //polymorphism usage


    }


    public static void makeNoise(Animal a) {


    }
}
