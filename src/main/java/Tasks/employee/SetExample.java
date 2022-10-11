package Tasks.employee;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

    public static void main(String[] args) {

//        Set<String> profesion = new HashSet<>();
////        System.out.println(profesion);
//
//        profesion.add("Programues");
////        System.out.println(profesion);
//
//        profesion.add("Programues");
//        profesion.add("Menaxher");
//        profesion.add("Doktorr");
//        System.out.println(profesion);
//
//        profesion.remove("Menaxher");
//        System.out.println(profesion);
//
//        profesion.clear();
//        System.out.println(profesion);

//
//        Set<Integer> numraPrimar = new LinkedHashSet<>();
//        System.out.println(numraPrimar);
//
//        numraPrimar.add(1);
//        numraPrimar.add(17);
//        numraPrimar.add(11);
//        numraPrimar.add(7);
//        System.out.println(numraPrimar);
//
//        numraPrimar.remove(17);
//
//        numraPrimar.contains(2);
//        System.out.println(numraPrimar);


        Set<Integer> numraPrimar = new TreeSet<>();
//        System.out.println(numraPrimar);

        numraPrimar.add(5);
        numraPrimar.add(1);
        numraPrimar.add(17);
        numraPrimar.add(11);
        numraPrimar.add(7);
//        System.out.println(numraPrimar);

        Set<String> emra = new TreeSet<>();
        emra.add("Hera");
        emra.add("Ali");
        emra.add("Zhaneta");
        emra.add("nexhmi");
        emra.add("Aliu");
        System.out.println(emra);

    }

}
