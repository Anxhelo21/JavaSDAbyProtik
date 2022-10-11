import java.util.Scanner;

public class IncreasingSeq {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        numbers [0]=1;
        numbers [1]=2;
        numbers [2]=3;
        numbers [3]=5;
        numbers [4]=6;
        numbers [5]=7;
        numbers [6]=8;
        numbers [7]=9;
        numbers [8]=1;
        numbers [9]=2;
        int subsequenceLength = findLongestSubsequence(numbers);
        System.out.println("Longest subsequence: " + subsequenceLength);
    }

    private static int findLongestSubsequence(int[] sequence) {
        int longestSubseq = 0;
        int temp = 0;
        for (int i = 0; i < sequence.length - 1; i++) {
            if (sequence[i] < sequence[i + 1]) {
                longestSubseq++;
            }
            else {
                if (longestSubseq > temp)
                    temp = longestSubseq;
                longestSubseq = 0;
            }
        }

        if (temp > longestSubseq)
            longestSubseq = temp;

        if (longestSubseq > 0)
            longestSubseq = longestSubseq+ 1;

        return longestSubseq;
    }

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
        int t = 0;
        int l = 0;
        for (int i = 0; i < nr.length - 1 ; i++) {
                if (nr[i] < nr[i+1]) {
                    t++;
                } else if (t > l) {
                    l = t;
                    t = 0;
                }
            }
        if (l > t){
            t = l;
        }
        if (t>0){
            t+=1;
        }
        System.out.println(t);
    }
     */
}
