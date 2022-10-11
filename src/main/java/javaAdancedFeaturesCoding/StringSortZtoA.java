package javaAdancedFeaturesCoding;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StringSortZtoA {
    public static void main(String args[]) {
        List<String> myList = Arrays.asList("A","B","b","D","c","a");
        sort(myList);

    }
    public static void sort(List<String> list){

        List<String> sortedCaseSensitive = list.stream()
                .sorted(String.CASE_INSENSITIVE_ORDER)
                .collect(Collectors.toList());

        System.out.println("Case Sensitive: "+sortedCaseSensitive);

        System.out.print("Case Insensitive: ");
        for (int i = sortedCaseSensitive.size()-1; i >= 0; i--) {
            System.out.print(sortedCaseSensitive.get(i) + " ");
        }
    }
}
