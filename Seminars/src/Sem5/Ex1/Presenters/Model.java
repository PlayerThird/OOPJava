package Sem5.Ex1.Presenters;

import Sem5.Ex1.Model.Table;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public interface Model {
    /**
     * Получение всех столиков в ресторане
     * @return столики
     */
    public Collection<Table> loadTables();

    /**
     * Бронирование столика
     * @param resetionDate дата брони
     * @param tableNo номер столика
     * @param name имя клиента
     * @return
     */
    int reservationTable(Date resetionDate, int tableNo, String name);
    int changeReservationTeble(int oldReservation, Date reservationDate, int tableNo, String name);
}
