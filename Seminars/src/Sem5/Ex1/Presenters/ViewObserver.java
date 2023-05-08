package Sem5.Ex1.Presenters;

import java.util.Date;

public interface ViewObserver {

    void onReservationTable(Date orderDate, int tableNo, String name);
    void onChangeReservationTable(int oldNumber,Date orderDate, int tableNo, String name);
}
