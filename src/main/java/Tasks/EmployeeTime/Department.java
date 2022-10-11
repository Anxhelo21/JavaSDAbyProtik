package Tasks.EmployeeTime;

import lombok.*;

import java.util.Arrays;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data

public class Department {

    private List<Employee> employees;
    private Employer manager;

    private String departmentName;

    @Override
    public String toString() {
        return "Department{" +
                "employees=" + employees +
                ", manager=" + manager +
                ", department=" + departmentName +
                '}';
    }
}
