package Tasks.EmployeeTime;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data


public class Employer {
    private String name;
    private String surname;
    private Integer experience;
    private String department;

    @Override
    public String toString() {
        return "Employer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", experience=" + experience +
                ", department='" + department + '\'' +
                '}';
    }
}