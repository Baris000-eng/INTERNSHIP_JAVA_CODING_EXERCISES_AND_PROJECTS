package baris.kaplan.ThePen;

public class Circle {
    private int radius;
    private String color;
    public Circle(int radius,String color){
        this.radius=radius;
        this.color=color;
    }



    public double getCircleArea(){
        return Math.PI*(Math.pow(radius,2));
    }

    public void setColor(String color){
        this.color=color;
    }

    public String getColor(){
        return color;
    }
}
