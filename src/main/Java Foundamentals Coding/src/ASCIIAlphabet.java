import java.util.Scanner;

public class ASCIIAlphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert first letter: ");
        char c1 = sc.next().charAt(0);
        System.out.println("Insert second letter: ");
        char c2 = sc.next().charAt(0);

        int letter1 = c1;
        int letter2 = c2;

        int charNumber = letter2 - letter1 - 1;
        System.out.println("Number of chars between " + c1+ " and " + c2 + " is: " + charNumber);
    }
}
