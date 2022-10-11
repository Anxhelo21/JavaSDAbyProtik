package Tasks.Exceptions;

import java.lang.reflect.Array;

public class ArrayException {
    public static void main(String[] args) {

        String[] arr = {"Str","Dex","Agi","End","HP","MP","CHA"};
        String str = "abc";
        try{
            System.out.println(test(arr,str));
        }catch (RuntimeException exception){
            exception.printStackTrace();
            System.out.println("!!!!!");
        }

    }

    public static boolean test(String[] arr, String str){
        for (int i=1; i< arr.length; i++){
            if (arr[i].equals(str))
                return true;
        }
        throw new RuntimeException();
    }

}
