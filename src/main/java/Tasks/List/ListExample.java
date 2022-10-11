package Tasks.List;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {

        List<String> profesion = new ArrayList<>();
        System.out.println("\n"+profesion);

        profesion.add("Programues");
        profesion.add("Hajdut");
        profesion.add("Pastrues");
        System.out.println(profesion);

        profesion.remove("Hajdut");
        profesion.add(1, "Polic");
        System.out.println(profesion);
        System.out.println(profesion.contains("Hajdut"));

        List<String> list2 = new ArrayList<>();
        list2.add("Programues");
        list2.add("Polic");
        list2.add("Pastrues");
        System.out.println(list2);

        System.out.println(profesion.containsAll(list2));

        String elementiNePozicioninEDyte = profesion.get(2);
        System.out.println(elementiNePozicioninEDyte);
    }
}
