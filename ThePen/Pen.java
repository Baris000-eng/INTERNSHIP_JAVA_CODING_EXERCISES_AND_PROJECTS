package baris.kaplan.ThePen;

public class Pen {
    static int counter = 0;
    public void drawRectangle(Rectangle r){
        System.out.println(r.getArea());
    }

    public void drawCircle(Circle c){
        System.out.println(c.getCircleArea());
    }


    public void changeColorCircle(String color,Circle c){
        c.setColor(color);
    }

    public void changeColorRectangle(String color,Rectangle r){
        r.setColor(color);
    }

    public static int getCounter() {
        return counter;
    }

    public void setCounter(int counter){
        this.counter = counter;
    }


    public void draw(Drawable d){
        System.out.println(d.getDrawingInfo());
    }




}