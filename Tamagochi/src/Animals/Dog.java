package Animals;

import java.util.HashMap;
import java.util.Map;

public class Dog extends Animal implements CycleMinus {
    private static final Map<String, Integer> bufs = new HashMap<>();
    {
        bufs.put("eat", 0);
        bufs.put("whater", 10);
        bufs.put("health", 0);
        bufs.put("happy", 0);
        bufs.put("energy", 0);}
    public Dog() {
        super("Dog", bufs);

    }

    public int getBufs(String nameBuf) {
        return bufs.get(nameBuf);
    }

    public void setBufs(String nameBuf, int plusBuf) {
        bufs.put(nameBuf, bufs.get(nameBuf) + plusBuf);
    }
}
