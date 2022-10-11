import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = input.nextInt();

        evenOdd(a);
    }

    public static void evenOdd(int a){
        if (a < 0){
            System.out.println("Number is negative!");
        }else if (a > 0){
            System.out.println("Number is positive!");
        }else {
            System.out.println("Number is O, neither positive nor negative!");
        }
    }
}
