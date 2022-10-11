package Tasks.MAP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Stonks {
    public static void main(String[] args) {
        Map<String, Integer> companyInfo = new HashMap<>();
        companyInfo.put("Google", 38);
        companyInfo.put("Netflix",56);
        companyInfo.put("Lenovo", 250);
        companyInfo.put("Howard Pickett",120);
        companyInfo.put("Apple", 55);
        System.out.println(smallestStock(companyInfo));
        System.out.println(biggestStock(companyInfo));
        System.out.println(removeSmallest(companyInfo, 60));
    }

    public static String smallestStock(Map<String, Integer> CI){
        int min = 9999;
        String name = "";
        for (String companyName : CI.keySet()){
            if (CI.get(companyName)<=min){
                min = CI.get(companyName);
                name = companyName;
            }
        }
        return name;
    }

    public static String biggestStock(Map<String, Integer> CI){
        int max = 0;
        String name = "";
        for (String companyName : CI.keySet()){
            if (CI.get(companyName)>=max){
                max = CI.get(companyName);
                name = companyName;
            }
        }
        return name;
    }

    public static String removeSmallest(Map<String, Integer> CI, Integer min){

//        int min = 9999;
//        String name = "";
//        for (String companyName : CI.keySet()){
//            if (CI.get(companyName)<=min){
//                CI.remove(companyName);
//            }
        //BYPASS

        List<String> compName = new ArrayList<>();
        for (String companyName : CI.keySet()){
            if (CI.get(companyName)<=min){
                compName.add(companyName);
            }
        }
        System.out.println(compName+" --");
        for (String c: compName){
            CI.remove(c);
        }

        return "Done";
    }
}
