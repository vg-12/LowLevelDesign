package designPatterns.prototype1;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry1 {

    private Map<String, Student> stMap=new HashMap<>();
    public void register(String key,Student st){
        stMap.put(key,st);
    }
    public Student get(String key){
        return stMap.get(key);
    }
}
