package designPatterns.Factory;

import designPatterns.Factory.components.Button.Button;
import designPatterns.Factory.components.Button.MACButton;
import designPatterns.Factory.components.Menu.MACMenu;
import designPatterns.Factory.components.Menu.Menu;

public class MACUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new MACButton();
    }

    @Override
    public Menu createMenu() {
        return new MACMenu();
    }
}
