package Animals;

import java.util.HashMap;
import java.util.Map;

public class Cat extends Animal implements CycleMinus {
    private static final Map<String, Integer> bufs = new HashMap<>();{
        bufs.put("eat", 10);
        bufs.put("whater", 0);
        bufs.put("health", 0);
        bufs.put("happy", 0);
        bufs.put("energy", 0);
    }
//    private Map<String, Integer> bufs = new HashMap<>(5);

    public Cat() {
        super("Cat",bufs);
    }

}
