package Menu.Buttons.CommandForGame;

import Controler.MainPlayer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GiveWhater implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        MainPlayer.player.getAnimal().plusWhater(25);
    }
}
