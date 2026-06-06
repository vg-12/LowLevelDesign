package designPatterns.prototype;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {
    // Registry: where we store all the objects

    private Map<String, Student> studentMap=new HashMap<>();

    public void register(String key, Student student){
        studentMap.put(key,student);
    }
    public Student get(String key){
        return studentMap.get(key);
    }
}
