import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpressionAchooo {
    public static void main(String[] args) {
    Pattern p = Pattern.compile("^acho+!", Pattern.CASE_INSENSITIVE);
    Scanner sc = new Scanner(System.in);
    System.out.println("Insert word: ");
    String s = sc.next();
    Matcher m = p.matcher(s);
    if(m.matches()) {
        System.out.println("Bless you!");
    } else {
        System.out.println("Still be blessed!");
    }
}
}
