package Tasks.Exceptions;

public class Exception1 {
    public static void main(String[] args) {

        String test = "Test";

        try {
            System.out.println(test.substring(1, 2));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("HAHA!!!");
        }
    }

}
