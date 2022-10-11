import java.util.Scanner;

public class PrintOccurence {
    /*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 numbers: ");
        int[] nr = new int[10];

        for (int i = 0; i < nr.length; i++) {
            nr[i] = sc.nextInt();
        }
        print(nr);


    }


    public static void print(int[] nr) {
        for (int i = 0; i < nr.length; i++) {
            for (int j = i + 1; j < nr.length; j++) {
                if (nr[i] == (nr[j])) {
                    System.out.println(nr[i]);
                }
            }
        }

    }
}

// 1 2 3 4 5 4 3 2 7 8

     */
    public static void main(String[] args) {
        int[] numbers = new int[10];
        numbers[0] = 1;
        numbers[1] = 1;
        numbers[2] = 2;
        numbers[3] = 2;
        numbers[4] = 2;
        numbers[5] = 5;
        numbers[6] = 5;
        numbers[7] = 6;
        numbers[8] = 5;
        numbers[9] = 7;
        findOccurrence(numbers);
    }

    private static void findOccurrence(int[] numbers) {
        boolean[] found = new boolean[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            if (found[i])
                continue;
            boolean found2 = false;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    found2 = found[j] = true;
                }
            }
            if (found2)
                System.out.print(numbers[i] +"\n");
        }
    }
}