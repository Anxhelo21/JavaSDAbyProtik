import java.util.*;
import java.util.Scanner;

class CirclePerimeter {
    static final double PI = Math.PI;

    static double Perimeter(double d)
    {
        return PI * d;
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of diameter for the circle:");
        double d = scan.nextDouble();
        System.out.println("Perimeter of the circle is :"
                + Perimeter(d));
    }
}