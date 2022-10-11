package Tasks.employee.list;

import java.util.List;

public interface EmployeeInterface {

    void fireEmployee(Employee employee, Department department, Employer employer) throws EmployeeNotFoundInList;

    void hireEmployee(Employee employee, Department department, Employer employer);

    void employeeQuits(Employee employee, Department department);

    void employeePromotion(Employee employee, Department department);

}
