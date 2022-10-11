package advanced.StudentSchool;

import java.util.Scanner;

public class StudentMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name, surname and school: ");
        String name = sc.nextLine();
        String surname = sc.nextLine();
        String school = sc.nextLine();
        Student student = new Student(name, surname, school);

        student.getStudentData();
    }
}
