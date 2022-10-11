package Tasks.GenericExample;

import java.util.ArrayList;
import java.util.List;

public class GenericExampleClass {
    public static void main(String[] args) {

        List<String> myDouble = new ArrayList<>();
        myDouble.add("bunta");
        myDouble.add("drako");
        myDouble.add("pc");
        myDouble.add("dj");
        System.out.println(getFinalElement(myDouble));

    }

    public static <T extends String> T getFinalElement(List<T> myType){
        return myType.get(myType.size()-1);
    }
}
