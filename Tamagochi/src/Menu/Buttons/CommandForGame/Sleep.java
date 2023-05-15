package Menu.Buttons.CommandForGame;

import Controler.MainPlayer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Sleep implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        int energy = MainPlayer.player.getAnimal().getEnergy() /2;
        MainPlayer.player.getAnimal().plusEnergy(energy);
    }
}
