package advanced.school;

public abstract class School {

    private String name;
    private String location;

    public School(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public abstract void changeData(Integer newValue);

    public abstract void getData();
}
