package advanced.StudentTrainer;

public class StudentImplementation implements StudentInterface {

    private Student student;

    public StudentImplementation(Student student) {
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public void printData() {
        this.student.getStudentData();
    }

    @Override
    public void changeNameAndSurname(String name, String surname) {
        this.student.setName(name);
        this.student.setSurname(surname);
        this.student.getStudentData();
    }
}
