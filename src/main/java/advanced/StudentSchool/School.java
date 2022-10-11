package advanced.StudentSchool;

public class School {

    private String name;
    private String location;
    private int nrofclasses;

    public String getName() {
        return name;
    }

    public School(String name, String location, int nrofclasses) {
        this.name = name;
        this.location = location;
        this.nrofclasses = nrofclasses;
    }

    public void getLocationAndClassNumber(){
        System.out.println("\nThe location of the school is "+this.location+" and the number of classes is "+this.nrofclasses+".");
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

    public int getNrofclasses() {
        return nrofclasses;
    }

    public void setNrofclasses(int nrofclasses) {
        this.nrofclasses = nrofclasses;
    }
}
