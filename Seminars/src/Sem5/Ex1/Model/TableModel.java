package Sem5.Ex1.Model;

import Sem5.Ex1.Presenters.Model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class TableModel implements Model {

    private Collection<Table> tables;//вынуждены кешировать, т.к. нет нормальной БД

    public Collection<Table> loadTables() {
        if (tables == null) {

            tables = new ArrayList<>();

            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
        }
        return tables;
    }

    public int reservationTable(Date resetionDate, int tableNo, String name) {
        for (Table table :
                tables) {
            if (table.getNo() == tableNo) {
                Reservation reservation = new Reservation(resetionDate, name);
                table.getReservation().add(reservation);
                return reservation.getId();
            }
        }
        return -1;
        //а можно просто ошибкой выдать
//        throw new RuntimeException("Не корректный номер столика");
    }

    /**
     * Действие клиента (пользователь нажал на кнопку брони),
     * бронь столика
     *
     * @param oldReservation  идентификатор бронирования(старый)
     * @param reservationDate дата бронирования
     * @param tableNo         номер столика
     * @param name            имя
     */
    public int changeReservationTeble(int oldReservation, Date reservationDate, int tableNo, String name) {
        for (Table table :
                tables) {
            for (Reservation reserv :
                    table.getReservation()) {
                if (reserv.getId() == oldReservation) {
                    table.getReservation().remove(reserv);
                    return reservationTable(reservationDate, tableNo, name);
                }
            }
        }
        return -1;
    }
}
