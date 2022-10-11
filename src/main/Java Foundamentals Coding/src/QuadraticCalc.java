import java.util.Scanner;

public class QuadraticCalc{
    public static void main(String[] Strings)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of a, b and c: ");

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double d= b * b - 4.0 * a * c;

        if (d> 0.0)
        {
            double x1 = (-b + Math.sqrt(d)) / (2.0 * a);
            double x2 = (-b - Math.sqrt(d)) / (2.0 * a);
            System.out.println("The roots are " + x1 + " and " + x2);
        }
        else if (d == 0.0)
        {
            double x1 = (-b) / (2.0 * a);
            System.out.println("The root is " + x1);
        }
        else
        {
            System.out.println("Delta is negative.");
        }
    }
}