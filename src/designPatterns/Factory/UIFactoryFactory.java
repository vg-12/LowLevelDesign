package designPatterns.Factory;

public class UIFactoryFactory {
//    since it's returning only one object hence we can make it static
    public static UIFactory getUIFactory(PlatformEnum platform){
        if(platform.equals(PlatformEnum.Windows)){
            return new WindowsUIFactory();
        } else if (platform.equals(PlatformEnum.MAC)) {
            return new MACUIFactory();
        } else if (platform.equals(PlatformEnum.IOS)) {
            return new IOSUIFactory();
        }
        return null;
    }
}
