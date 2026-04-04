package designPatterns.Factory;

import designPatterns.Factory.components.Button.Button;
import designPatterns.Factory.components.Menu.Menu;

public class Client {
    static void main(String[] args) {
        Flutter flutter=new Flutter();

//  from flutter we should be able to get the object of corresponding factory based on the platform
        UIFactory uiFactory= flutter.getUIFactory(PlatformEnum.IOS);
        Button button= uiFactory.createButton();
        button.displayButton();

        Menu menu= uiFactory.createMenu();
        menu.displayMenu();
    }
}
