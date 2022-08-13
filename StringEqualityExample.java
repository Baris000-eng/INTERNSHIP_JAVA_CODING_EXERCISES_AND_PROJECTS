package baris.kaplan;

public class StringEqualityExample {
    public static void main(String[]args){
        String str1 = new String("obss");
        String str2 = "obss";


        String str3 = "obss";
        String str4 = "obss";

        String str5 = "OBss";

        if(str1==str2){
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }


        if(str1.equals(str2)){
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }


        if(str3==str4){
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }


        if(str3.equals(str4)){
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }


        if(str3.equals(str5)){
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }

        if(str3.equalsIgnoreCase(str5)){
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }





    }
}
