package Animals;

import java.util.HashMap;
import java.util.Map;

public class Pig extends Animal implements CycleMinus {
    private static final Map<String, Integer> bufs = new HashMap<>();
    {
        bufs.put("eat", 0);
        bufs.put("whater", 0);
        bufs.put("health", 10);
        bufs.put("happy", 0);
        bufs.put("energy", 0);}
    public Pig() {
        super("Pig", bufs);

    }

    public int getBufs(String nameBuf) {
        return bufs.get(nameBuf);
    }

    public void setBufs(String nameBuf, int plusBuf) {
        bufs.put(nameBuf, bufs.get(nameBuf) + plusBuf);
    }
}
