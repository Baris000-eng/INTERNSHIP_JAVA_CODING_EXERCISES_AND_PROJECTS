package baris.kaplan.ThePen;

public class Main {
    public static void main(String[] args){
        Pen p = new Pen();
        Pen p2 = new Pen();



        Circle cir = new Circle(5,"Pink");
        p.drawCircle(cir);
        p.setCounter(p.getCounter()+1);

        Rectangle rec = new Rectangle(5,9,"Pink");
        p.drawRectangle(rec);
        p2.drawRectangle(rec);




        p2.setCounter(p2.getCounter()+1);
        p.setCounter(p.getCounter()+1);


        System.out.println(rec.getColor());
        System.out.println(cir.getColor());

        p.changeColorCircle("Black",cir);
        p.setCounter(p.getCounter()+1);
        p.changeColorRectangle("Green",rec);
        p.setCounter(p.getCounter()+1);

        System.out.println(rec.getColor());
        System.out.println(cir.getColor());




        System.out.println("The pen is used "+p.getCounter()+" times.");


    }

}
