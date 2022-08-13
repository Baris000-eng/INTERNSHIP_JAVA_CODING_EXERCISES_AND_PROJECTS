package baris.kaplan.ThePen;

public class Rectangle extends Shape{
    private int width;
    private int height;
    private String color;

    public Rectangle(int width,int height,String color){
        super("pink");
        this.width=width;
        this.height=height;
        this.color=color;
    }


    public double getArea(){
        return width*height;
    }

    @Override
    public String getDrawingInfo(){
        return "The color of the rectangle is : "+getColor()+", The area of the rectangle is: "+getArea()+"";
    }







    public String getColor() {

        return color;
    }
}
