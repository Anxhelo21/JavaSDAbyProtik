package advanced.school;

public class SchoolImplementation implements SchoolInterface{

    private School shkolla;

    public SchoolImplementation(School shkolla) {
        this.shkolla = shkolla;
    }

    public School getShkolla() {
        return shkolla;
    }

    public void setShkolla(School shkolla) {
        this.shkolla = shkolla;
    }

    @Override
    public void printData() {
        this.shkolla.getData();
    }

    @Override
    public void changeName(String name) {
        this.shkolla.setName(name);
        this.shkolla.getData();
    }
}
