package Tasks.EmployeeTime;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data


public class Employee {
    private String name;
    private String surname;
    private Integer age;

    private Integer experience;

    @Override
    public String toString() {
        return "Employee{" +
                "Name='" + name + '\'' +
                ", Surname='" + surname + '\'' +
                ", Age=" + age +
                ", Experience=" + age +
                '}';
    }
}
