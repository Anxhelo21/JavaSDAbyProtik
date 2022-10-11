import java.util.Scanner;

public class HarmonicSeries {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Insert number: ");
        int n = scan.nextInt();
        System.out.println("The sum is: "+sum(n));
    }

    static double sum(int n)
    {
        double sum = 0.0;
        for (double i = 1; i <= n; i++) {
            sum = sum + 1 / i;
        }
        return sum;
    }
}
