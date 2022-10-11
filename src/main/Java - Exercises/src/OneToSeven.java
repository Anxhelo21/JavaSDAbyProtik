import java.util.Scanner;

public class OneToSeven {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number between 1 and 7: ");
        int a = input.nextInt();
        if (a<1 || a>7){
            System.out.println("Invalid Number!!!");
        } else {
            System.out.println("Number "+a+" corresponds to: ");
            weekDay(a);
        }
    }

    public static void weekDay(int a){
        switch (a){
            case 1:
                System.out.println("Monday!");
                break;
            case 2:
                System.out.println("Tuesday!");
                break;
            case 3:
                System.out.println("Wednesday!");
                break;
            case 4:
                System.out.println("Thursday!");
                break;
            case 5:
                System.out.println("Friday!");
                break;
            case 6:
                System.out.println("Saturday!");
                break;
            case 7:
                System.out.println("Sunday!");
                break;
        }
    }
}
