package Sem5.Ex1;

import Sem5.Ex1.Model.TableModel;
import Sem5.Ex1.Presenters.BookingPresenter;
import Sem5.Ex1.View.BookingView;

import java.util.Date;
//в MVP модули не пересекаются
public class Program {
    /**
     * TODO: Дз
     * Метод changeReservationTeble должен жить!
     * @param args
     */



    public static void main(String[] args) {
        TableModel tableModel = new TableModel();
        BookingView bookingView = new BookingView();
        BookingPresenter bookingPresenter = new BookingPresenter(tableModel,bookingView);
        bookingPresenter.loadTables();
        bookingPresenter.updateView();

        bookingView.reservationTable(new Date(),3,"Волк");//эмуляция выбора меню
        bookingView.changeReservationTeble(1001,new Date(),4,"Волк");
    }
}
