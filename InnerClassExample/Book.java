package baris.kaplan.InnerClassExample;

public class Book {
    private Publisher publisher;

    public Publisher getPublisher(){
        return publisher;
    }

    public void setPublisher(Publisher publisher){
        this.publisher = publisher;
    }

    static class Publisher {
        String name;
        String country;

    }
}
