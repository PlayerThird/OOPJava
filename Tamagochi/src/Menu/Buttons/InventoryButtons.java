package Menu.Buttons;

import Controler.MainPlayer;
import Menu.Buttons.BackOrGo.BackFromInventory;

import javax.swing.*;
import java.awt.*;

public class InventoryButtons {
    public static JEditorPane stuf(){

        String eat = Integer.toString(MainPlayer.player.getInventory().isEatStuf());
        String wat = Integer.toString(MainPlayer.player.getInventory().isWhaterStuf());
        String hea = Integer.toString(MainPlayer.player.getInventory().isMedikStuf());
        String hap = Integer.toString(MainPlayer.player.getInventory().isYummy());
        String en = Integer.toString(MainPlayer.player.getInventory().isBattery());
        String text = String.format("Stats:\n" +
                "Eat:%s\n" +
                "Water%s\n" +
                "Health:%s\n" +
                "Happy:%s\n" +
                "Battery\n(for Robot):%s\n",eat,wat,hea,hap,en);
        JEditorPane textField = new JEditorPane();
        textField.setText(text);
        textField.setBounds(0, 60, 120, 300);
        textField.setDragEnabled(false);
        textField.setEditable(false);
        Font font = new Font("Serif",Font.ITALIC,18);
        textField.setFont(font);
        textField.setCaretColor(Color.BLACK);

        return  textField;
    }
    public static JEditorPane activeStuf(){
        String autoEat = "Нет";
        String autoWhater = "Нет";
        String inuserance = "Нет";
        String toys = "Нет";
        String alarm = "Нет";
        String solar = "Нет";
        if (MainPlayer.player.getInventory().isAutoDispEat()) autoEat = "Есть";
        if (MainPlayer.player.getInventory().isAutoDispWhat()) autoWhater = "Есть";
        if (MainPlayer.player.getInventory().isInsurance()) inuserance = "Есть";
        if (MainPlayer.player.getInventory().isToys()) toys = "Есть";
        if (MainPlayer.player.getInventory().isAlarm()) alarm = "Есть";
        if (MainPlayer.player.getInventory().isSolarBattery()) solar = "Есть";
        String text = String.format("Passive:\n" +
                "Auto-dispenser(Eat):%s\n" +
                "Auto-dispenser(Water):%s\n" +
                "insurance(Health):%s\n" +
                "Toys(Happy):%s\n" +
                "Alarm(Energy):%s\n" +
                "Solar Battary(for Robot):%s",autoEat,autoWhater,inuserance,toys,alarm,solar);
        JEditorPane textField = new JEditorPane();
        textField.setText(text);

        textField.setDragEnabled(true);
        textField.setEditable(false);
        Font font = new Font("Serif",Font.ITALIC,16);
        textField.setFont(font);
        textField.setBounds(180, 60, 210, 300);
        textField.setCaretColor(Color.BLACK);

        return  textField;
    }
    public static JEditorPane whereWe(){

        String text = String.format("Инвентарь");
        JEditorPane textField = new JEditorPane();
        textField.setText(text);

        textField.setDragEnabled(true);
        textField.setEditable(false);
        Font font = new Font("Serif",Font.ITALIC,18);
        textField.setFont(font);
        textField.setBounds(135, 0, 120, 60);
        textField.setCaretColor(Color.BLACK);

        return  textField;
    }
    public static JButton backToGame(){
        JButton oneBut = new JButton("Назад");
        oneBut.addActionListener(new BackFromInventory());
        oneBut.setBounds(0,330,390,30);
        return oneBut;
    }
}
