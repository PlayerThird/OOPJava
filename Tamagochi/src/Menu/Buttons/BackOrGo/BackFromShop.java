package Menu.Buttons.BackOrGo;

import Menu.GameFrame;
import Menu.InventoryFrame;
import Menu.ShopFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BackFromShop implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        GameFrame.gameFrame();
        ShopFrame.shopFrame.setVisible(false);
    }
}
