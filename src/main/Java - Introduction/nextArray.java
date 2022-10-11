public class nextArray {
    public static void main(String[] args) {
        String[][] myArray = new String[2][];
        myArray[0] = new String[]{"Alice", "has", "the", "cat"}; // creating the first row (index number 0)
        myArray[1] = new String[]{"The", "cat", "has", "Alice"};  // creating the second row (index number 1)

        for (int i=0; i< myArray.length; i++){
            for (int j=0; j< myArray[i].length; j++){
                System.out.print(myArray[i][j]+ " ");
                if (j == myArray[i].length - 1){
                    System.out.print(".");
                }
            }
            System.out.println();
        }
    }
}
