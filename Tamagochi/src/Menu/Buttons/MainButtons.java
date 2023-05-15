package Menu.Buttons;

import Animals.*;
import Menu.Buttons.ChoiseAnimal.*;
import Menu.FileNamesIcons;

import javax.swing.*;

public class MainButtons extends JButton{
    public static JButton CatBut(){
        JButton oneBut = new JButton(new ImageIcon(FileNamesIcons.setCat()));
        oneBut.setBounds(145, 0, 100, 100);
        oneBut.setEnabled(true);//доступна для нажатия, false отключает "нажимность"
        oneBut.addActionListener(new ChoiceCat<Cat>());
        return oneBut;
    }
    public static JButton PigBut(){
        JButton oneBut = new JButton(new ImageIcon(FileNamesIcons.setPig()));
        oneBut.setBounds(145, 290, 100, 100);
        oneBut.addActionListener(new ChoicePig<Pig>());
        return oneBut;
    }
    public static JButton PandBut(){
        JButton oneBut = new JButton(new ImageIcon(FileNamesIcons.setPanda()));
        oneBut.setBounds(0, 90, 100, 100);
        oneBut.addActionListener(new ChoicePanda<Panda>());
        return oneBut;
    }
    public static JButton DogBut(){
        JButton oneBut = new JButton(new ImageIcon(FileNamesIcons.setDog()));
        oneBut.setBounds(0, 190, 100, 100);
        oneBut.addActionListener(new ChoiceDog<Dog>());
        return oneBut;
    }
    public static JButton ChikBut(){
        JButton oneBut = new JButton(new ImageIcon(FileNamesIcons.setChik()));
        oneBut.setBounds(290, 90, 100, 100);
        oneBut.addActionListener(new ChoiceChicken<Chicken>());
        return oneBut;
    }
    public static JButton RoboBut(){
        JButton oneBut = new JButton(new ImageIcon(FileNamesIcons.setRobo()));
        oneBut.setBounds(290, 190, 100, 100);
        oneBut.addActionListener(new ChoiceRobot<Robot>());
        return oneBut;
    }
}
