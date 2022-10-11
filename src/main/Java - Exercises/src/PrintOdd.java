import java.util.Scanner;

public class PrintOdd {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the upper limit to print the odd numbers: ");
        int a = input.nextInt();
        System.out.println("The odd numbers from 0 to "+a+" are: ");
        printOdd(a);
    }

    static void printOdd(int a){
        for (int i=0;i<=a; i++){
            if (i%2!=0){
                System.out.print(i+" ");
            }
        }
        System.out.print(".");
        System.out.println();
    }
}
