import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int tabLength = 4;
        String[] names = new String[tabLength];
        names[0] = "Jan";
        names[3] = "Roman";

        for (int i = 0; i < tabLength; i++) {
            System.out.println("Element nr. is " + (i + 1) + " ,name: " + names[i]);
        }

        int[] numrat = new int[4];

        numrat[0] = 1;
        numrat[1] = 37;
        numrat[2] = 67;
        numrat[3] = 813;

        for (int j : numrat) {
            System.out.println();
        }

        Scanner scan = new Scanner(System.in);
        System.out.println("Vendosni disa numra: ");
        for (int i = 0; i < numrat.length; i++) {
            numrat[i] = scan.nextInt();
        }

    }
}
