import java.util.Scanner;
import java.math.*;

public class Power {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = input.nextInt();
        printPower(a);


    }

    public static void printPower(int a){
        int c = (int) Math.pow(a,2);
        System.out.println(a+" to the 2nd power: "+c+",");
        int d = (int) Math.pow(a,3);
        System.out.println(a+" to the 3rd power: "+d+",");
        int e = (int) Math.pow(a,4);
        System.out.println(a+" to the 4th power: "+e+".");
    }
}
