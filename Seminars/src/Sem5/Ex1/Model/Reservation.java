package Sem5.Ex1.Model;

import java.util.Date;

public class Reservation {
    private Date date;
    private String name;
    private final int id;
    private static int counter= 1000;


    public int getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public String getName() {
        return name;
    }
    {
        id = ++counter;
    }

    public Reservation(Date date, String name) {
        this.date = date;
        this.name = name;
    }
}
