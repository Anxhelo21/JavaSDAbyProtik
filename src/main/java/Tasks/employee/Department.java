package Tasks.employee;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Department {

    private String departmentName;
    private Employee[] employeeArray;
    private Employer menaxheri;

}
