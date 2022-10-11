package advanced.school;

public class SchoolMain {
    public static void main(String[] args) {

        AliDemi shkolla = new AliDemi("Ali Demi", "Somewhere", 21, "Smbdy", 0);
        ServeteMaci school = new ServeteMaci("Servete Maci", "nowhere", "Bonapetit", "uselessness", 0);

        shkolla.getData();
        shkolla.changeData(200);
        shkolla.getData();
        school.getData();
        school.changeData(10);
        school.getData();


    }
}
