import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Insert number: ");
        int nr = sc.nextInt();
        for(int i = 1; i < nr; i++) {
            if(isPrime(i)) {
                System.out.println(i);
            }
        }
    }
    static boolean isPrime(int n) {
        if(n <= 1) {
            return false;
        }
        for(int j = 2; j < n; j++) {
            if(n % j == 0)
                return false;
        }
        return true;
    }
    }
/*
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scan.nextInt();

        for(int i=1; i<=n; i++){
            if (isPrime(i)== true){
                System.out.println(i);
            }
        }
    }
    static boolean isPrime(int n)
    {
        // Check if number is less than
        // equal to 1
        if (n <= 1) {
            return false;
        }
            // Check if number is 2
        if (n == 2) {
            return true;
        }

            // Check if n is a multiple of 2
        if (n % 2 == 0)
            return false;

        // If not, then just check the odds
        for (int i = 3; i <= Math.sqrt(n); i += 2)
        {
            if (n % i == 0)
                return false;
        }
        return true;
    }
    */

