package Sem5.Ex1.Presenters;

import Sem5.Ex1.Model.Table;
import Sem5.Ex1.Model.TableModel;

import java.util.Collection;
import java.util.Date;

public class BookingPresenter implements ViewObserver {
    private final Model model;
    private final View view;
    Collection<Table> tables;//кэшируем

    public BookingPresenter(Model model, View view) {
        this.model = model;
        this.view = view;
        this.view.setObserver(this);//передаём текущий объект
    }

    /**
     * Загрузить список всех столиков
     */
    public void loadTables() {
        if (tables == null) {
            this.tables = model.loadTables();
        }
    }

    public void updateView() {
        this.view.showTables(tables);
    }

    /**
     * Отобразить результат бронирования столика
     *
     * @param reservationNo номер брони
     */
    private void updateReservationStatusView(int reservationNo) {
        view.showReservationStatus(reservationNo);
    }
    private void updateEditReservationStatusView(int oldNumber, int reservationNo) {
        view.showEditReservationStatus(oldNumber, reservationNo);
    }

    /**
     * Получили уведомление о попытке брони столика
     * @param orderDate дата брони
     * @param tableNo номер брони
     * @param name имя клиента
     */
    @Override
    public void onReservationTable(Date orderDate, int tableNo, String name) {
        int reservationNo = model.reservationTable(orderDate, tableNo, name);
        updateReservationStatusView(reservationNo);
    }

    @Override
    public void onChangeReservationTable(int oldNumber, Date orderDate, int tableNo, String name) {
        int reservationNo = model.changeReservationTeble(oldNumber, orderDate, tableNo, name);
        updateEditReservationStatusView(oldNumber,reservationNo);
    }




}
