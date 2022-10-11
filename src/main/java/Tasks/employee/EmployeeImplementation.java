package Tasks.employee;

public class EmployeeImplementation implements EmployeeInterface {

    @Override
    public void fireEmployee(Employee employee, Department department, Employer employer) throws EmployeeNotFoundException {
        boolean notFound = false;
        Employee[] improvedArray = new Employee[department.getEmployeeArray().length - 1];
        for (int i = 0; i < department.getEmployeeArray().length; i++) {
            Employee e = department.getEmployeeArray()[i];
            if (e.getEmri().equalsIgnoreCase(employee.getEmri()) && e.getMbiemri().equalsIgnoreCase(employee.getMbiemri())) {
                System.arraycopy(department.getEmployeeArray(), 0, improvedArray, 0, i);
                System.arraycopy(department.getEmployeeArray(), i + 1, improvedArray, i, department.getEmployeeArray().length - 1);
                department.setEmployeeArray(improvedArray);
                notFound = true;
                break;
            }
        }
        if (!notFound)
            throw new EmployeeNotFoundException("Employee you want to fire is not even working here!");
    }

    @Override
    public Employee[] hireEmployee(Employee employee, Department department, Employer employer) {
        Employee[] improvedArray = new Employee[department.getEmployeeArray().length + 1];

        for (int i = 0; i < department.getEmployeeArray().length; i++) {
            improvedArray[i] = department.getEmployeeArray()[i];
        }
        improvedArray[department.getEmployeeArray().length] = employee;
        department.setEmployeeArray(improvedArray);
        return improvedArray;

    }

    @Override
    public void employeeQuits(Employee employee, Department department) {

    }

    @Override
    public void employeePromotion(Employee employee, Department department) {

    }
}
