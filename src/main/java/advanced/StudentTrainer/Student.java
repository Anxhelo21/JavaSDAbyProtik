package advanced.StudentTrainer;

public class Student extends Human{

    private String school;
    private String course;
    private String occupation;

    public Student(String name, String surname, Integer gender, Integer age, String school, String course, String occupation) {
        super(name, surname, gender, age);
        this.school = school;
        this.course = course;
        this.occupation = occupation;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public void getStudentData(){
        System.out.println("Name: "+super.getName()
                +", Surname: "+super.getSurname()
                +", Gender: "+super.getGender()
                +", Age: "+super.getAge()
                +", School: "+this.school
                +", Course: "+this.course
                +", Occupation: "+this.occupation+".");
    }

    @Override
    public void breath() {
        System.out.println("IT'S ALIVE!!!");
    }
}
