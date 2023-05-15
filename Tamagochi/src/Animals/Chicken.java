package Animals;

import java.util.*;

public class Chicken extends Animal implements CycleMinus {
    private static final Map<String, Integer> bufs = new HashMap<>();
    {bufs.put("eat", 0);
        bufs.put("whater", 0);
        bufs.put("health", 0);
        bufs.put("happy", 10);
        bufs.put("energy", 0);}

    public Chicken() {
        super("Chicken",
                bufs);
    }
   //0 eat
    //1 whater
    //2 health
    //3 happy
    //4 energy

}
