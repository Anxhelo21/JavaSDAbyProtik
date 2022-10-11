import java.io.*;


public class ReverseString {
    public static void main(String[] args) {

        String test = new String("DRACULA");
        System.out.println("Original: "+test);

        reverse(test);
    }

    public static void reverse(String t){
        String tset = new String("");
        char ch;
        for (int i=0; i<t.length(); i++){
            ch= t.charAt(i);
            tset = ch+tset;
        }
        System.out.println("Reversed: "+tset);
    }
}
