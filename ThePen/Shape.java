package baris.kaplan.ThePen;

public abstract class Shape implements Drawable{
    abstract double getArea();

    public String color;

    public Shape(String color){
        this.color = color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    @Override
    public String getDrawingInfo() {
            return "The color of shape is "+getColor()+". The area of shape is "+getArea()+"";
    }
}
