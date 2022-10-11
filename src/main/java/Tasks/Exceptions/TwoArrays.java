package Tasks.Exceptions;

public class TwoArrays {
    public static void main(String[] args) throws Exception {

        int arr1[] = {1, 2, 3};
        int arr2[] = {5, 4, 1};

        try {
            printDup(arr1, arr2);
        }catch (RuntimeException e){
            e.printStackTrace();
            System.out.println("No duplicates!");
        }
    }

    public static void printDup(int arr1[], int arr2[]) {
        boolean flag = true;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.println(" " + arr1[i]);
                    flag = false;
                }
            }
        }
        if (flag == true){
            throw new RuntimeException();
        }
    }
}
