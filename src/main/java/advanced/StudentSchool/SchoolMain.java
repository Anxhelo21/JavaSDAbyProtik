package advanced.StudentSchool;

import java.util.Scanner;


public class SchoolMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\nEnter the name, location and nr of classes of the school: ");
        String name = sc.nextLine();
        String location = sc.nextLine();
        int nrofclasses = sc.nextInt();
        School schoolA = new School(name, location, nrofclasses);

        schoolA.getLocationAndClassNumber();
    }
}
