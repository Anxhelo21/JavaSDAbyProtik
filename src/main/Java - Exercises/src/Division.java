import java.util.Scanner;

public class Division {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("First number: ");
        double a = input.nextDouble();

        System.out.println("Divided by: ");
        double b = input.nextDouble();

        while (b == 0){
            System.out.println("Cannot divide by 0! Enter another number: ");
            b = input.nextDouble();
        }

        System.out.println("\n Dividing "+a+" by "+b+" = "+calc(a, b)+".");

    }

    public static double calc(double a, double b) {
        double result = 0;
        return result = a/b;
    }
}
