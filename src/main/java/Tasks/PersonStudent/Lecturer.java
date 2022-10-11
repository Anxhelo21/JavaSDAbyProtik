package Tasks.PersonStudent;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Lecturer extends Person {

    private String specialization;
    private Double salary;

    @Override
    public String toString() {
        return "Lecturer{" +
                "specialization='" + specialization + '\'' +
                ", Salary=" + salary +
                '}';
    }

    public double getRryshfet(Student iShkreti, Integer taksa) {
        this.salary += Double.parseDouble(taksa.toString());
        System.out.println("I shkreti eshte: " + iShkreti.getName());
        return this.salary;
    }
}
