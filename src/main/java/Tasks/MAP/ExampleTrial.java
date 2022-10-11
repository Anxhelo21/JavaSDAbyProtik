package Tasks.MAP;

import java.util.HashMap;
import java.util.Map;

public class ExampleTrial {
    public static void main(String[] args) {

        Map<Integer, String> popole = new HashMap<>();
        System.out.println(popole);
        popole.put(2,"MAMAMIA!!!!");
        popole.put(1,"ROBERTO!!!!");
        popole.put(3,"LOOK AT LUIGI!!!!");
        System.out.println(popole);

        popole.remove(1);
        System.out.println(popole);
        popole.get(2);

        if (popole.get(2) != null){
            System.out.println("I found my element: "+popole.get(2));
        }else {
            System.out.println("Element not in the list!");
        }

        System.out.println(popole.containsKey(21));
        System.out.println(popole.containsKey(2));

        System.out.println(popole.containsValue("Roberto!!!!"));

        System.out.println(popole.values());
        System.out.println(popole.keySet());
    }
}
