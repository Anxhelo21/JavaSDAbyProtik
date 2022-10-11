import java.util.Scanner;

public class Stutter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert text: ");
        String text = sc.nextLine();
        String stutteredText = stutterText(text);
        System.out.println("Stuttered text is : " + stutteredText);
    }

    private static String stutterText(String text) {
        String[] words = text.split(" ");
        String stutteredText = "";
        for(String s : words) {
            stutteredText = stutteredText+(s + " ").repeat(2);
        }
        return stutteredText;
    }

    }

