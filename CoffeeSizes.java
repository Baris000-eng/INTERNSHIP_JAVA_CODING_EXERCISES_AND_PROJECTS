package baris.kaplan;

import java.util.Arrays;

public enum CoffeeSizes {
    MEDIUM("Medium",3),
    SMALL("Small",1),
    LARGE("Large",5);
    private String name;
    private double litres;

    public static void main(String[] args){
        CoffeeSizes[] cs = new CoffeeSizes[3];
        CoffeeSizes cs1 = CoffeeSizes.MEDIUM;
        CoffeeSizes cs2 = CoffeeSizes.LARGE;
        CoffeeSizes cs3 = CoffeeSizes.SMALL;
        cs[0] = cs1;
        cs[1] = cs2;
        cs[2] = cs3;
        for(int i=0;i<cs.length;i++){
            System.out.print(cs[i] + "," + cs[i].name + "," + cs[i].litres + "\n");
        }
    }
    private CoffeeSizes(String name,double litres){
        this.name = name;
        this.litres = litres;
    }

    public String getName(){
        return name;
    }

    public double getLitres(){
        return litres;
    }
}
