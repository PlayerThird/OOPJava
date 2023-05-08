package Sem5.Ex1.View;

import Sem5.Ex1.Model.Table;
import Sem5.Ex1.Presenters.View;
import Sem5.Ex1.Presenters.ViewObserver;

import java.util.Collection;
import java.util.Date;

public class BookingView implements View {

    private ViewObserver observer;

    /**
     * Отобразить список столиков
     * @param tables список столиков
     */
    public void showTables(Collection<Table> tables) {
        for (Table table :
                tables) {
            System.out.println(table);
        }
    }

    /**
     * Отобразить результат брони
     * @param reservationNo номер брони
     */
    @Override
    public void showReservationStatus(int reservationNo) {
        if (reservationNo > 0){
            System.out.printf("Ваш столик был успешно забронирован. Номер брони #%d\n",reservationNo);
        } else {
            System.out.println("Ошибка бронирования столика\n");
        }
    }

    @Override
    public void showEditReservationStatus(int oldNumber, int reservationNo) {
        if (reservationNo > 0){
            System.out.printf("Вместо брони по номером %d.Заменили на новый Номер брони #%d\n",oldNumber,reservationNo);
        } else {
            System.out.println("Ошибка бронирования столика\n");
        }
    }

    /**
     * Установить наблюдателя
     *
     * @param observer наблюдатель (презентер)
     */
    @Override
    public void setObserver(ViewObserver observer) {
        this.observer = observer;
    }



    /**
     * Действие клиента (пользователь нажал на кнопку бронирования столика),
     * бронирование столика
     *
     * @param orderDate дата брони
     * @param tableNo   номер столика
     * @param name      имя клиента
     */
    public void reservationTable(Date orderDate, int tableNo, String name) {
        observer.onReservationTable(orderDate, tableNo, name);
    }


    /**
     * Действие клиента (пользователь нажал на кнопку брони),
     * бронь столика
     * @param oldReservation идентификатор бронирования(старый)
     * @param reservationDate дата бронирования
     * @param tableNo номер столика
     * @param name имя
     */
    public void changeReservationTeble(int oldReservation, Date reservationDate, int tableNo, String name){
        observer.onChangeReservationTable(oldReservation, reservationDate, tableNo, name);
        // TODO: Обратится к наблюдателю, указать на процедуру изменений бронирования столика
    }

}
