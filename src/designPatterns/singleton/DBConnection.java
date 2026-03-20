package designPatterns.singleton;

import java.util.concurrent.locks.ReentrantLock;

public class DBConnection{
    //    private static DBConnection instance=null;
//    EAGER INITIALIZATION/LOADING-> we are creating the object without even any need of it at compile time
//    Problem with the below solution if we want to pass  the parameter in the constructor, since the parameter initiallization happens at runtime and the instance is created at compile time
//    parameters cannot be passed during instance creation.
//    private static DBConnection instance=new DBConnection();
    private static DBConnection instance=null;
    private static final ReentrantLock lock=new ReentrantLock();
    String url;
    String username;
    String password;
    private DBConnection(){

    }
//    Below method is used when the EAGER INITIALIZATION/ LOADING is used
//    when two threads call the below if() at the same time, then it will allow them to create more than one object, hence we overcome it by doing EAGER LOADING/ INITIALIZATION
//    public static DBConnection getInstance(){
//        return instance
//    }
//    synchronized keyword has the issue of waiting time
//     public static synchronized DBConnection getInstance(){
//         to overcome the issue of loading/ initialization we use synchronized keyword
//        if (instance==null){
//            instance=new DBConnection();
//        }//
//        return instance;
//
//     }

    public static synchronized DBConnection getInstance(){
        if (instance==null){
            lock.lock();
            if (instance==null)
                instance=new DBConnection();
            lock.unlock();
        }
        return instance;

    }
}
