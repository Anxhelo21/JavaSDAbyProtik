import java.util.Scanner;

public class StarsExercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insert width: ");
        int n = scan.nextInt();
        print(n);
    }

    public static void print(int n) {

        for (int i = 0; i < 4; i++) {
            for (int k = 0; k < n; k++) {
                //k-loop controls width
                for (int j = 0; j < 4; j++) {
                    if (j == i) //major diagonal j == i
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                for (int j = 0; j < 4; j++) {
                    if (i + j == 4 - 1) //minor diagonal i+j == n - 1
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}