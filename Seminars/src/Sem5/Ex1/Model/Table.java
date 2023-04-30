package Sem5.Ex1.Model;

import java.util.ArrayList;
import java.util.Collection;

public class Table {
    private static int counter;
    private final int no;
    private final Collection<Reservation> reservation = new ArrayList<>();


    {
        no = ++counter;
    }

    public int getNo() {
        return no;
    }

    public Collection<Reservation> getReservation() {
        return reservation;
    }

    @Override
    public String toString() {
        return String.format("Столик №%d",no);
    }
}
