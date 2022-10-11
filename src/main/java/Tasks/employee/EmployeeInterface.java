package Tasks.employee;

public interface EmployeeInterface {

    void fireEmployee(Employee employee, Department department, Employer employer) throws EmployeeNotFoundException;

    Employee[]  hireEmployee(Employee employee, Department department, Employer employer);

    void employeeQuits(Employee employee, Department department);

    void employeePromotion(Employee employee, Department department);

}
