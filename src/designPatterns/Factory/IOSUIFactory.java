package designPatterns.Factory;

import designPatterns.Factory.components.Button.Button;
import designPatterns.Factory.components.Button.IOSButton;
import designPatterns.Factory.components.Menu.IOSMenu;
import designPatterns.Factory.components.Menu.Menu;

public class IOSUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public Menu createMenu() {
        return new IOSMenu();
    }
}
