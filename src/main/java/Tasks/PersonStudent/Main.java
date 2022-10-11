package Tasks.PersonStudent;

public class Main {

    public static void main(String[] args) {
        Student fabian = new Student("Agrikulture", 2020, 150.0);
        fabian.setName("Fabian");
        fabian.setAddress("Vlore");

        Lecturer lili = new Lecturer("Veterinari", 800.0);
        liliPasurohet(fabian, lili);
    }

    private static void liliPasurohet(Student fabian, Lecturer lili) {
        System.out.println("Para sezonit: " + lili.getSalary());
        lili.getRryshfet(fabian, 50);
        System.out.println("Pas sezonit: " + lili.getSalary());
    }
}
