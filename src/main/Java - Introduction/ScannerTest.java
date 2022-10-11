import java.util.Scanner;


public class ScannerTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String textline = scan.nextLine();
        System.out.println("Your input: " + textline);
    }

}

