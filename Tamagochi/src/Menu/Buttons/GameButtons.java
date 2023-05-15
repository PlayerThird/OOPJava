package Menu.Buttons;

import Controler.MainPlayer;
import Menu.Buttons.BackOrGo.GoToInventory;
import Menu.Buttons.BackOrGo.GoToShop;
import Menu.Buttons.CommandForGame.*;


import javax.swing.*;
import java.awt.*;

public class GameButtons {

    public static JButton Shop() {
        JButton oneBut = new JButton("Магазин");
        oneBut.setBounds(0, 0, 120, 60);
        oneBut.addActionListener(new GoToShop());
        return oneBut;
    }
    public static JButton Inventory() {
        JButton oneBut = new JButton("Инвентарь");
        oneBut.setBounds(135, 0, 120, 60);
        oneBut.addActionListener(new GoToInventory());
        return oneBut;
    }
    public static JButton Game() {
        JButton oneBut = new JButton("Поиграть + 15");
        oneBut.setEnabled(true);
        if (MainPlayer.player.getAnimal().getHappy() > 80){
            oneBut.setEnabled(false);
        }
        oneBut.setBounds(135, 270, 120, 60);
        oneBut.addActionListener(new GiveHappy());
        return oneBut;//
    }
    public static JButton GiveEat() {
        JButton oneBut = new JButton("Покормить + 25");
        oneBut.setEnabled(true);
        if (MainPlayer.player.getAnimal().getEat() > 70){
            oneBut.setEnabled(false);
        }
        oneBut.setBounds(0, 270, 120, 60);
        oneBut.addActionListener(new GiveEat());
        return oneBut;
    }
    public static JButton Medicine() {

        JButton oneBut = new JButton("Полечить + 10");
        oneBut.setEnabled(true);
        if (MainPlayer.player.getAnimal().getHealth() > 90 || MainPlayer.player.getAnimal().getHealth() < 10){
            oneBut.setEnabled(false);
        }
        oneBut.setBounds(0, 330, 120, 30);
        oneBut.addActionListener(new GiveHealth());
        return oneBut;
    }
    public static JButton Emergency() {
        JButton oneBut = new JButton("Больница");
        oneBut.setEnabled(true);
        if (MainPlayer.player.getAnimal().getHealth() > 10){
            oneBut.setEnabled(false);
        }
        oneBut.setBounds(0, 360, 120, 30);
        oneBut.addActionListener(new ExtraHealth());
        return oneBut;
    }
    public static JButton GiveWhater() {
        JButton oneBut = new JButton("Поить + 25");
        oneBut.setEnabled(true);
        if (MainPlayer.player.getAnimal().getWhater() > 70){
            oneBut.setEnabled(false);
        }
        oneBut.setBounds(270, 270, 120, 60);
        oneBut.addActionListener(new GiveWhater());
        return oneBut;
    }
    public static JButton Sleep() {
        JButton oneBut = new JButton();
        oneBut.setEnabled(true);
        if (MainPlayer.player.getAnimal().getEnergy() > 70){
            oneBut.setEnabled(false);
        }
        if (MainPlayer.player.getAnimal().name == "Robot"){
            oneBut.setText("Зарядить +25");
            oneBut.addActionListener(new Charge());
        }else {
            oneBut.setText("Поспать");
            oneBut.addActionListener(new Sleep());
        }
        oneBut.setBounds(270, 330, 120, 60);
        return oneBut;
    }
    public static JTextArea status(){

        String eat = Integer.toString(MainPlayer.player.getAnimal().getEat());
        String wat = Integer.toString(MainPlayer.player.getAnimal().getWhater());
        String hea = Integer.toString(MainPlayer.player.getAnimal().getHealth());
        String hap = Integer.toString(MainPlayer.player.getAnimal().getHappy());
        String en = Integer.toString(MainPlayer.player.getAnimal().getEnergy());
        String text = String.format("Stats:\n" +
                "Eat:%s\n" +
                "Water%s\n" +
                "Health:%s\n" +
                "Happy:%s\n" +
                "Energy:%s\n",eat,wat,hea,hap,en);
        JTextArea textField = new JTextArea(text);

        textField.setBounds(270, 0, 120, 145);
        textField.setDragEnabled(false);
        textField.setEditable(false);
        Font font = new Font("Serif",Font.ITALIC,18);
        textField.setFont(font);
        textField.setBackground(Color.LIGHT_GRAY);
        textField.setCaretColor(Color.BLACK);
        return  textField;
    }

}
