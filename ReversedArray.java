package baris.kaplan;

public class ReversedArray {
    public static void main(String[] args){
        int[]arr = new int[10];
        System.out.println("The original array is:");
        for(int i=0;i<10;i++){
            arr[i]=i;
            if(arr[i]!=9){
                System.out.print(arr[i]+",");
            } else {
                System.out.print(arr[i]);
            }
        }

        System.out.println("\n");
        System.out.println("The reversed array is:");
        for(int j=9;j>=0;j--){
            if(arr[j]!=0){
                System.out.print(arr[j]+",");
            } else {
                System.out.print(arr[j]);
            }
        }
    }
}
