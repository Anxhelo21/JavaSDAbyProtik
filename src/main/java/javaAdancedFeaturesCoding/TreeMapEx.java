package javaAdancedFeaturesCoding;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapEx {
    public static void main(String[] args) {
        TreeMap<Integer, String> newMap = new TreeMap<>();
        newMap.put(1, "UN");
        newMap.put(2, "UK");
        newMap.put(3, "HA");
        newMap.put(4, "ch");
        newMap.put(5, "UNFC");

        System.out.println(newMap.firstEntry());
        System.out.println(newMap.lastEntry());
    }
}
