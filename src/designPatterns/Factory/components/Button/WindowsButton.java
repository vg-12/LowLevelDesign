package designPatterns.Factory.components.Button;

public class WindowsButton implements Button{
    @Override
    public void displayButton() {
        System.out.println("windows button");
    }
}
