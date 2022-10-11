package Tasks.employee.list;

import lombok.*;

import java.util.List;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Department {
    private String emri;
    private List<Employee> employeeList;
    private Employer menaxher;
}
