package javaAdancedFeaturesCoding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Storage {
    private Map<String, List<String>> storeMap = new HashMap<>();

    public Storage() {

    }

    public void addToStorage(String key, String value) {
        if(storeMap.containsKey(key)) {
            List<String> tempList = storeMap.get(key);
            tempList.add(value);
            storeMap.put(key,tempList);
        } else {
            List<String> tempList = new ArrayList<>();
            tempList.add(value);
            storeMap.put(key,tempList);
        }
    }

    public void printValues(String key) {

        if(this.storeMap.containsKey(key)) {
            List<String> listToPrint = this.storeMap.get(key);

            for (String element: listToPrint) {
                System.out.println(element);
            }
        } else {
            System.out.println("key does not exist");
        }

    }
}
