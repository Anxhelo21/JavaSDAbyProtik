package advanced.school;

public class ServeteMaci extends School{

    private String supervisor;
    private String specialization;
    private Integer abstences;

    public ServeteMaci(String name, String location, String supervisor, String specialization, Integer abstences) {
        super(name, location);
        this.supervisor = supervisor;
        this.specialization = specialization;
        this.abstences = abstences;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    public String getSpecialization() {
        return specialization;
    }

    public Integer getAbstences() {
        return abstences;
    }

    public void setAbstences(Integer abstences) {
        this.abstences = abstences;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public void changeData(Integer newValue) {
        this.abstences = newValue;
    }

    @Override
    public void getData() {

        System.out.println("Name: "+super.getName()
                +", location: "+super.getLocation()
                +", supervisor: "+this.supervisor
                +", specialization: "+this.specialization
                +", absences: "+this.abstences+".");
    }
}
