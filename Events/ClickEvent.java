package baris.kaplan.Events;

import java.util.EventObject;


public class ClickEvent extends EventObject{
    private String date;
    private int id;

    public ClickEvent(Object object, int id, String date){
        super(object);
        this.date = date;
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
