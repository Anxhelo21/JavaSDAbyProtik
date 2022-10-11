public class CountChar {
    public static void main(String[] args) {
        String tester = new String("aug asgauaggusg ure 328016 yrgf386t3");
        count(tester);

    }

    public static void count(String a){
        char[] ch = a.toCharArray();
        int letters = 0;
        int numbers = 0;
        int spaces = 0;

        for (int i=0; i<a.length(); i++){
            if (Character.isLetter(ch[i])){
                letters++;
            } else if (Character.isDigit(ch[i])) {
                numbers++;
            } else if (Character.isSpaceChar(ch[i])) {
                spaces++;
            }
        }
        System.out.println("\nThe string is: '"+a+"'.");
        System.out.println("Letters: "+letters+".");
        System.out.println("Numbers: "+numbers+".");
        System.out.println("Spaces: "+spaces+".");
    }
}
