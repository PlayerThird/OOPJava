package Menu.Buttons;

import Controler.MainPlayer;
import Menu.Buttons.BackOrGo.BackFromShop;
import Menu.Buttons.ForSale.*;

import javax.swing.*;
import java.awt.*;

public class ShopButtons {
    public static JButton backToGame(){
        JButton oneBut = new JButton("Назад");
        oneBut.addActionListener(new BackFromShop());
        oneBut.setBounds(0,330,390,30);
        return oneBut;
    }
    public static JEditorPane upText(){
        String text = "Расходники:        Магазин:        Пассив:";
        JEditorPane textArea = new JEditorPane();
        textArea.setText(text);

        textArea.setDragEnabled(true);
        textArea.setEditable(false);

        Font font = new Font("Serif", Font.BOLD,18);
        textArea.setFont(font);

        textArea.setBounds(0,0,390,60);
        return textArea;
    }
    public static JEditorPane leftText(){
        String text = "Еда\n\n" +
                "Вода\n\n" +
                "Медицина\n\n" +
                "Вкусняшки\n\n" +
                "Батарейки\n" +
                "(для робота)";
        JEditorPane textArea = new JEditorPane();
        textArea.setText(text);

        textArea.setDragEnabled(true);
        textArea.setEditable(false);

        Font font = new Font("Serif", Font.BOLD,20);
        textArea.setFont(font);

        textArea.setBounds(0,60,120,300);
        return textArea;
    }
    public static JEditorPane howManyInInvent(){
        String eat = Integer.toString(MainPlayer.player.getInventory().isEatStuf());
        String wat = Integer.toString(MainPlayer.player.getInventory().isWhaterStuf());
        String hea = Integer.toString(MainPlayer.player.getInventory().isMedikStuf());
        String hap = Integer.toString(MainPlayer.player.getInventory().isYummy());
        String en = Integer.toString(MainPlayer.player.getInventory().isBattery());



        String text = String.format("%s\n\n" +
                "%s\n\n" +
                "%s\n\n" +
                "%s\n\n" +
                "%s\n",eat,wat,hea,hap,en);
        JEditorPane textArea = new JEditorPane();
        textArea.setText(text);

        textArea.setDragEnabled(true);
        textArea.setEditable(false);

        Font font = new Font("Serif", Font.BOLD,20);
        textArea.setFont(font);

        textArea.setBounds(120,60,20,300);
        return textArea;
    }
    public static JPopupMenu saleInvent(){
        JPopupMenu manyButton = new JPopupMenu();
        manyButton.add(saleEat());
        manyButton.add(saleWater());
        manyButton.add(saleMedicine());
        manyButton.add(saleYummy());
        manyButton.add(saleBattery());
        manyButton.setEnabled(true);
        manyButton.setVisible(true);
        manyButton.setBounds(140,60,50,300);
        return manyButton;
    }
    public static JButton saleEat(){
        JButton oneBut = new JButton("+1");
        oneBut.setEnabled(true);
        if (MainPlayer.player.getInventory().getCoins() < 10) oneBut.setEnabled(false);
        oneBut.addActionListener(new SaleEat());
        oneBut.setBounds(140,60,50,20);
        return oneBut;
    }
    public static JButton saleWater(){
        JButton oneBut = new JButton("+1");
        oneBut.setEnabled(true);
        if (MainPlayer.player.getInventory().getCoins() < 10) oneBut.setEnabled(false);
        oneBut.addActionListener(new SaleWater());
        oneBut.setBounds(140,100,50,20);
        return oneBut;
    }
    public static JButton saleMedicine(){
        JButton oneBut = new JButton("+1");
        oneBut.setEnabled(true);
        if (MainPlayer.player.getInventory().getCoins() < 10) oneBut.setEnabled(false);
        oneBut.addActionListener(new SaleMedic());
        oneBut.setBounds(140,140,50,20);
        return oneBut;
    }
    public static JButton saleYummy(){
        JButton oneBut = new JButton("+1");
        oneBut.setEnabled(true);
        if (MainPlayer.player.getInventory().getCoins() < 10) oneBut.setEnabled(false);
        oneBut.addActionListener(new SaleYummy());
        oneBut.setBounds(140,180,50,20);
        return oneBut;
    }
    public static JButton saleBattery(){
        JButton oneBut = new JButton("+1");
        oneBut.setEnabled(true);
        if (MainPlayer.player.getInventory().getCoins() < 10) oneBut.setEnabled(false);
        oneBut.addActionListener(new SaleBattery());
        oneBut.setBounds(140,220,50,20);
        return oneBut;
    }
}
