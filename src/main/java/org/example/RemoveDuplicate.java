package org.example;
import java.util.*;

public class RemoveDuplicate {

    public static void main(String args[])
    {
        ArrayList<Integer>
                list = new ArrayList<>(
                Arrays
                        .asList(1, 10, 1, 2, 2, 3, 3, 10, 3, 4, 5, 5));

        System.out.println("ArrayList with duplicates: "
                + list);

        ArrayList<Integer>
                newList = removeDuplicate(list);

        System.out.println("ArrayList with duplicates removed: "
                + newList);
    }

    public static ArrayList removeDuplicate(ArrayList<Integer> list)
    {

        ArrayList newList = new ArrayList();

        for (Integer element : list) {

            if (!newList.contains(element)) {
                newList.add(element);
            }
        }
        return newList;
    }
}
