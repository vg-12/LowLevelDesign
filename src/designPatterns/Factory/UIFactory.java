package designPatterns.Factory;

import designPatterns.Factory.components.Button.Button;
import designPatterns.Factory.components.Menu.Menu;

public interface UIFactory {
//    All factory methods
    Button createButton(); //return object of corresponding Button
    Menu createMenu(); //return object of corresponding Menu
}
