package designPatterns.Factory.components.Menu;

public class WindowsMenu implements Menu{
    @Override
    public void displayMenu() {
        System.out.println("Windows menu");
    }
}
