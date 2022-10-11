import java.util.Scanner;
import java.time.Period;
import java.time.LocalDate;
import java.util.regex.Pattern;

public class DateDiff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert date  yyyy-mm-dd: ");
        String userDate = sc.next();
        LocalDate laterDate = LocalDate.parse(userDate);
        LocalDate dateNow = LocalDate.now();
        int days = Period.between(dateNow, laterDate).getDays();
        System.out.println("left days: " + days);
    }
}
