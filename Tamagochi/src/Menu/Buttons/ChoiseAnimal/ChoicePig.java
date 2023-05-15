package Menu.Buttons.ChoiseAnimal;

import Animals.Animal;
import Controler.MainPlayer;
import Menu.GameFrame;
import Menu.Menu;
import Moduls.Player;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChoicePig<T extends Animal> implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        T animal = (T) ChoiseAnimal.ChoisePig();
        Player<Animal> player = new Player<>(animal);
        MainPlayer.setPlayer(player);
        GameFrame.gameFrame();
        Menu.mainFrame.setVisible(false);
    }
}
