package designPatterns.Factory;

import designPatterns.Factory.components.Button.Button;
import designPatterns.Factory.components.Button.WindowsButton;
import designPatterns.Factory.components.Menu.Menu;
import designPatterns.Factory.components.Menu.WindowsMenu;

public class WindowsUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Menu createMenu() {
        return new WindowsMenu();
    }
}
