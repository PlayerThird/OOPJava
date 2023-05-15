package Menu.Buttons.ChoiseAnimal;

import Animals.Animal;
import Controler.MainPlayer;
import Menu.Menu;
import Menu.GameFrame;
import Moduls.Player;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChoiceCat<T extends Animal> implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        T animal = (T) ChoiseAnimal.ChoiseCat();
        Player<Animal> player = new Player<>(animal);
        MainPlayer.setPlayer(player);
        GameFrame.gameFrame();
        Menu.mainFrame.setVisible(false);

    }
}
