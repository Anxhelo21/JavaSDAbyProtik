public class CountEvenOdd {
    public static void main(String[] args) {
        int arr[] = {19, 21, 37, 12, 9, 7 ,2, 91, 82, 36};
        check(arr);
    }

    public static void check(int[] arr){
        int odd = 0;
        int even = 0;
        for (int i:arr){
            if (i%2 == 0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.println("There are "+odd+" odd numbers and "+even+" even numbers.");
    }
}
