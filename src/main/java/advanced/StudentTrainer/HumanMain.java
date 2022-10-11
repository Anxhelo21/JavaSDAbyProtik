package advanced.StudentTrainer;

public class HumanMain {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);

//        System.out.println("Enter the name, surname, gender, age, school, course and occupation of the Student: ");
//        String name = sc.nextLine();
//        String surname = sc.nextLine();
//        int gender = sc.nextInt();
//        int age = sc.nextInt();
//        String school = sc.nextLine();
//        String course = sc.nextLine();
//        String occupation = sc.nextLine();

        Student trialStudent = new Student("Anxhelo", "Hyka", 0, 21, "Epoka University", "BINF", "none");
        Trainer trialTrainer = new Trainer("Mira", "Zeneli", 1 , 34, 10, "BINF" );

        trialStudent.getStudentData();
        trialTrainer.printCourseAndExp();
    }
}
