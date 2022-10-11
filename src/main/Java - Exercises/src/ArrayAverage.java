import java.util.Scanner;

public class ArrayAverage {
    public static void main(String[] args) {

        double[] arr = {35, 49, 71, 15, 52};
        System.out.println("The average is: "+average(arr)+".");

    }

    public static double average(double[] arr){
        double sum = 0;
        double avg = 0;

        for (int i=0; i< arr.length; i++){
            sum += arr[i];
        }
        avg = sum/ arr.length;
        return avg;
    }

}
