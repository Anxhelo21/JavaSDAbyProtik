package advanced.StudentTrainer;

public class Trainer extends Human{
    private Integer yearsExp;
    private String course;

    public Trainer(String name, String surname, Integer gender, Integer age, Integer yearsExp, String course) {
        super(name, surname, gender, age);
        this.yearsExp = yearsExp;
        this.course = course;
    }

    public Integer getYearsExp() {
        return yearsExp;
    }

    public void setYearsExp(Integer yearsExp) {
        this.yearsExp = yearsExp;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void printCourseAndExp(){
        System.out.println("Course: "+this.course
                +", Years of Experience: "+this.yearsExp+".");
    }

    public void printFullName(){
        System.out.println("Name: "+super.getName()+", Surname: "+super.getSurname()+".");
    }

    @Override
    public void breath() {

    }
}
