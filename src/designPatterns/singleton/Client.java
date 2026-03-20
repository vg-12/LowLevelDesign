package designPatterns.singleton;

public class Client {
    static void main() {
        DBConnection dbConnection=DBConnection.getInstance();
        DBConnection dbConnection1=DBConnection.getInstance();
        Thread t1=new Thread(()->{
            System.out.print(dbConnection);
        });
        Thread t2=new Thread(()->{
            System.out.print(dbConnection);
        });
        t1.start();
        t2.start();
    }
}
