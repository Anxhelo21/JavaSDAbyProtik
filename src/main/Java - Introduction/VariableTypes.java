public class VariableTypes {

    public static int n1 = 6;
    public static int shuma = 7;
    final int finalVar = 5;

    public static void main(String[] args) {
        System.out.println("The sum of the given variables is: " +sum(5)+".");
        System.out.println("Vlera e variables 'Shuma' eshte: "+shuma+".");
    }

    public static int sum(int nr){
        int shuma = 0;
        shuma = n1 + nr;
        return shuma;
    }

}
