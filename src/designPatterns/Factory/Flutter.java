package designPatterns.Factory;

public class Flutter {
    //Non factory methods
    void refreshUI(){
        System.out.println("refresh UI from flutter");
    }

    void setTheme(){
        System.out.println("setting theme from flutter");
    }

//    factory method to get object of corresponding UIFactory
//    below code violates OCP principle
//    Factory method: which returns the object of factory types
    public UIFactory getUIFactory(PlatformEnum platform){
//        if(platform.equals(PlatformEnum.Windows)){
//            return new WindowsUIFactory();
//        } else if (platform.equals(PlatformEnum.MAC)) {
//            return new MACUIFactory();
//        } else if (platform.equals(PlatformEnum.IOS)) {
//            return new IOSUIFactory();
//        }
//        return null;
        return UIFactoryFactory.getUIFactory(platform);
    }
}
