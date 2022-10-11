import java.util.Scanner;

public class SpaceCharPrc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String t = sc.nextLine();

        char [] a = t.toCharArray();
        double prc = 0;
        double spaces = 0;

        for (int i = 0; i<t.length(); i++){
            if (Character.isSpaceChar(a[i])){
                spaces++;
            }
        }

        prc = (spaces/t.length()) * 100;

        System.out.println("Percentage of spaces in given text is: "+prc+"%. There are "+spaces+" spaces from "+t.length()+" characters.");




    }
}
