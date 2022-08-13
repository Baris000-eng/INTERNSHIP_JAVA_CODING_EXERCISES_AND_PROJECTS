package baris.kaplan;

public class UtilPairMain {
    public static void main(String[] args) {
        Pair<Integer, String> p1 = new Pair<>(1, "pineapple");
        Pair<Integer, String> p2 = new Pair<>(1, "watermelon");

        Pair<Integer, String> p3 = new Pair<>(1, "pineapple");
        Pair<Integer, String> p4 = new Pair<>(4, "pineapple");

        boolean is_same = Util.<Integer, String>compare(p1, p2);
        System.out.println(is_same);
        boolean same = Util.<Integer, String>compare(p2, p1);
        System.out.println(same);
        boolean s = Util.<Integer, String>compare(p3, p4);
        System.out.println(s);
        boolean a = Util.<Integer, String>compare(p1, p4);
        System.out.println(a);
        boolean b = Util.<Integer, String>compare(p1, p3);
        System.out.println(b);

    }
}
