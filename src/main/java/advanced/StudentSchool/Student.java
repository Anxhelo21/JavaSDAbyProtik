package advanced.StudentSchool;

public class Student {
    private String name; //attributes
    private String surname;
    private String school;

    public Student(String name, String surname, String school) {
        this.name = name;
        this.surname = surname;
        this.school = school;
    }

    public void getStudentData(){
        System.out.println("Your student's name is: "+this.name
        +" , last name is: "+this.surname+" and studies at: "+this.school+".");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
}
