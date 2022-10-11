import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your height:");
        int g = scan.nextInt();
        double h = (double) g/100;
        System.out.println("Enter your weight:");
        double w = scan.nextDouble();

        check(h,w);

    }

    public static void check (double h, double w){
        double b = w/(h*h);
        System.out.println("Your BMI is: "+b);
        if (b<18.5 || b>24.9){
            System.out.println("BMI: Not optimal!");
        }else {
            System.out.println("BMI: Optimal!");
        }
    }
}
