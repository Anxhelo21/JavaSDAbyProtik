package Tasks.employee;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {

        List<String> profesion = new ArrayList<>();
        System.out.println(profesion);
        profesion.add("Programues");
        profesion.add("Hajdut");
        profesion.add("Pastrues");
//        System.out.println(profesion);

        profesion.remove("Hajdut");
        profesion.add(1,"Polic 1");
        profesion.add(2,"Polic 2");
        profesion.add(3,"Polic 3");

       String elementiNePozicioninEDyte = profesion.get(2);
//        System.out.println(elementiNePozicioninEDyte);

        profesion.remove(2);

//        System.out.println(profesion.size());

//        System.out.println(profesion.contains("Polic 1"));
        List<String> listnr2 = new ArrayList<>();
        listnr2.add("Programues");
        listnr2.add("Polic 1");

        System.out.println(profesion.containsAll(listnr2));


        System.out.println("\n" + profesion);

    }

}
