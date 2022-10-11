public class SearchArray {
    public static void main(String[] args) {
        int arr[] = {10, 213, 9, 3, 1, 2, 29};
        int key = 9;

        check(arr,key);

    }

    public static void check(int[] arr, int key){

        boolean statement = false;
        for (int i: arr){
            if ( i == key){
                statement = true;
                break;
            }
        }
        System.out.println("The value "+key+" is included in the array: "+statement+".");
    }
}
