package Menu.Buttons.CommandForGame;

import Controler.MainPlayer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Charge implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        MainPlayer.player.getAnimal().plusEnergy(25);
    }
}
