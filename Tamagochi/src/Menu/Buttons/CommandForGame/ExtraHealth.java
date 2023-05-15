package Menu.Buttons.CommandForGame;

import Controler.MainPlayer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExtraHealth implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        MainPlayer.player.getAnimal().plusHealth(100-MainPlayer.player.getAnimal().getHealth());
    }
}
