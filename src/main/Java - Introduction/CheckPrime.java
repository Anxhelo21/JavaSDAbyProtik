import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number > 1) {
            boolean check = false;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    check = true;
                    break;
                }
            }
            if (check) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
        } else {
            System.out.println("I am interrupting work");
        }
    }
}
