package Tasks.Exceptions;

public class Exception2 {
    public static void main(String[] args) {

//        System.out.println(printNumbers(21, 6));
//        System.out.println(printNumbers(24, 0));
//        System.out.println(printNumbers(1, 2));

        try {
            System.out.println(printNumbersWithException(20, 0));
        }catch (ArithmeticException e){
            e.printStackTrace();
        }

    }

    public static Double printNumbers(Integer nrPjestues, Integer pjestuesi) {
        try {
            return (double) (nrPjestues / pjestuesi);
        } catch (ArithmeticException exception) {
           exception.printStackTrace();
            return null;
        }

    }

    public static Double printNumbersWithException(Integer nrPjestues, Integer pjestuesi) {
        if (pjestuesi == 0){
            System.out.println("Pjestuesi eshte 0");
            throw new ArithmeticException();
        }else {
            return (double) (nrPjestues/pjestuesi);
        }

    }
}
