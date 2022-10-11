public class DataTypes {
    public static void main(String[] args) {

        char c1 = 'c';
        String s1 = "c";

        System.out.println("\nKarakteri: " + c1 + ".");
        System.out.println("String: " + s1 + ".\n");

        byte b = (byte) 129;
        short s = 146;
        int n1 = 3102895;
        long l1 = 9870706078L;
        double d = 6.73;
        boolean shumaMeEMadheSePese = false;
        int shuma = 5+7;
        if (shuma > 5){
            shumaMeEMadheSePese = true;
        }

        if (shumaMeEMadheSePese) {
            System.out.println("Shuma eshte me e madhe se 5.\n");
        }

        System.out.println(b);
        System.out.println(s);
        System.out.println(n1);
        System.out.println(l1);
        System.out.println(d);
    }
}
