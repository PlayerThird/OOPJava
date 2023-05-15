package Menu.Buttons.ForSale;

import Controler.MainPlayer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SaleBattery implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        MainPlayer.player.getInventory().minusCoin(10);
        MainPlayer.player.getInventory().changeBatteryStuf(1);
    }
}
