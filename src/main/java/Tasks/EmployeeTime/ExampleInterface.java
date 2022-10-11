package Tasks.EmployeeTime;

import java.util.List;

public interface ExampleInterface {

    void hireEmployee(Employee em, Department dr, Employer er);
    void fireEmployee(Employee em, Department dr, Employer er) throws EmployeeNotFoundInList;
    void employeeQuits(Employee em, Department dr);
    void employeePromotion(Employee em, Department dr);
}
