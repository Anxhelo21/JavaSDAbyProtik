package advanced.StudentTrainer;

public abstract class Human {
    private String name;
    private String surname;
    private Integer gender;
    private Integer age;

    public Human(String name, String surname, Integer gender, Integer age) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.age = age;
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

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public abstract void breath();
    public void printData(){
        System.out.println("The name is: "+this.name+" "+this.surname
                +", gender: "+this.gender
                +", age: "+this.age+".");
    }
}
