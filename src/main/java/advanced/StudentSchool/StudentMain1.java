package advanced.StudentSchool;

public class StudentMain1 {
    public static void main(String[] args) {
        Student mira = new Student("Mira", "Zavara", "Ekonomiku");

        mira.getStudentData();
        AltStudentImplement implement = new AltStudentImplement();
        implement.changeStudentData(mira, "Razmie", "Bushpepa");
    }
}