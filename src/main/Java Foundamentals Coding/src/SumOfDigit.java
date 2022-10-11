import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a positive number: ");
        int a = scan.nextInt();
        int m;
        int sum = 0;

        while(a>0){
            m=a%10;
            sum+=m;
            a=a/10;
        }

        System.out.println("The sum of the digits is: "+sum);
    }
}
