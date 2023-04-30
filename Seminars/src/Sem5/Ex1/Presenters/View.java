package Sem5.Ex1.Presenters;

import Sem5.Ex1.Model.Table;

import java.util.Collection;

public interface View {
    /**
     * Отобразить список столиков
     * @param tables список столиков
     */
    public void showTables(Collection<Table> tables);

    void showReservationStatus(int reservationNo);


    /**
     * Установить нового наблюдателя
     * @param observer наблюдатель (презентер)
     */
    void setObserver(ViewObserver observer);
}
