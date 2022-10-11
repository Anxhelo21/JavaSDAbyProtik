package advanced.school;

public class AliDemi extends School{

    private Integer age;
    private String director;
    private Integer attendances;

    public Integer getAttendances() {
        return attendances;
    }

    public void setAttendances(Integer attendances) {
        this.attendances = attendances;
    }

    public AliDemi(String name, String location, Integer age, String director, Integer attendances) {
        super(name, location);
        this.age = age;
        this.director = director;
        this.attendances = attendances;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public void changeData(Integer newValue) {
        this.attendances = newValue;
    }

    @Override
    public void getData() {
        System.out.println("Name: "+super.getName()
                +", location: "+super.getLocation()
                +", age: "+this.age
                +", director: "+this.director
                +", attendances: "+this.attendances+".");
    }
}
