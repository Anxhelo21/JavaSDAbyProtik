import java.util.Scanner;

public class Fibbonaci {

    public static void main(String args[]) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = input.nextInt();
        System.out.println("The result is: "+fibonacci(n));
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}