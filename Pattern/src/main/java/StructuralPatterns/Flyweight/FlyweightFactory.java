package StructuralPatterns.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {

    private Map<String, Flyweight> cache;

    public FlyweightFactory() {
        cache = new HashMap<>();
    }

    public Flyweight getFlyweight(String repairState) {
        if (!cache.containsKey(repairState)) {
            cache.put(repairState, new Flyweight(repairState));
        }
        return cache.get(repairState);
    }
}
