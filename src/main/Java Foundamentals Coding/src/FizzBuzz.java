import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the end point: ");
        int e = scan.nextInt();

        for(int i=1; i<=e; i++){
            if (i%3==0 && i%7==0){
                System.out.println("Fizz Buzz");
            } else if (i%7 == 0){
                System.out.println("Buzz");
            } else if (i%3==0){
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }
    }
}
