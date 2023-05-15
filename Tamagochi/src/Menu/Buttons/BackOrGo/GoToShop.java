package Menu.Buttons.BackOrGo;

import Menu.GameFrame;
import Menu.InventoryFrame;
import Menu.ShopFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GoToShop implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        ShopFrame.shopFrame();
        GameFrame.gameMenu.setVisible(false);
    }
}
