package baris.kaplan.InnerClassExample;

public class InnerMain {
    public static void main(String[] args){
        Book.Publisher publisher = new Book.Publisher();

        publisher.name = "Fred";

        Book b1 = new Book();
        b1.setPublisher(publisher);


        System.out.println(b1.getPublisher());
        System.out.println(b1.getPublisher().name);

    }

}
