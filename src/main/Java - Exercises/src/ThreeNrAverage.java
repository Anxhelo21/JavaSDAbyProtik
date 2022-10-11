import java.util.Scanner;

public class ThreeNrAverage {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("First number: ");
        int a = input.nextInt();
        System.out.println("Second number: ");
        int b = input.nextInt();
        System.out.println("Third number: ");
        int c = input.nextInt();

        System.out.println("\n The average of "+a+", "+b+" and "+c+" is: "+calc(a,b,c)+".");

    }

    public static double calc(int a, int b, int c) {
        double result = 0;
        result = (double) (a+b+c)/3;
        return result;
    }
}
