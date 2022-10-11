import java.util.Scanner;

public class Enough {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String longest = "";
        String text = scan.nextLine();

        if (text.isBlank()){
            System.out.println("No Text Provided!");
        }

        while(!text.equals("Enough!")) {
            if(text.length() > longest.length()) {
                longest = text;
            }
            text = scan.next();
        }
        System.out.println("The longest word is: "+longest);
        scan.close();

    }
}
