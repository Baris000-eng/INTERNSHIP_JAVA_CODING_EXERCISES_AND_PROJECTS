package baris.kaplan;

import java.io.Serializable;

public class StudentSerializable implements Serializable {
    private int id;
    private String name;

    public StudentSerializable(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
