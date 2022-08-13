package baris.kaplan;

public class EllipsisArgumentListExample {
    public static void main(String[] args){
         double avrg = average(3.4,4.5,5.6,6.7,7.8);
         System.out.printf("The average of the doubles is: %.6f", avrg); //formatting the average to 6 decimals
    }


    //we use ellipsis when we want to specify that the number of the parameters in the function is not specific.
    //meaning that inside the average(double ... numbers) function, we can use any amount of numbers (amount >=1).
    public static double average(double... numbers){ //ellipsis usage
        double total = 0.0;
        for(double d: numbers){
            total +=d;
        }
        return total/numbers.length;

    }
}
