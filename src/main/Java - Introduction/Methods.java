public class Methods {
    public static void main(String[] args) {

        int[] nrs = addNumbersToArray(5, 34);

        printNumber(nrs);

    }

    static int[] addNumbersToArray(int n1, int n2) {
        int[] numrat = new int[2];
        numrat[0] = n1;
        numrat[1] = n2;
        return numrat;
    }

    static void printNumber(int[] numbers){
        for (int n : numbers){
            System.out.println(n);
        }
    }
}
