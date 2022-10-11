package Tasks.employee;

public class EmployeeMain {
    public static void main(String[] args) {

        Department department = new Department();
        Employee[] employees = new Employee[1];
        Employee employeeOne = new Employee();
        employeeOne.setEmri("ali");
        employeeOne.setMbiemri("amza");
        employees[0] = employeeOne;
        department.setEmployeeArray(employees);


        Employer employer = new Employer();
        employer.setEmri("Monika");
        employer.setMbiemri("Bregu");
        department.setMenaxheri(employer);
        System.out.println("My original  employee");
        for (Employee e :
                department.getEmployeeArray()) {
            System.out.println(e);
        }
        EmployeeImplementation employeeImplementation = new EmployeeImplementation();
        Employee employee = new Employee();
        employee.setEmri("Ermir");
        employee.setMbiemri("Hajdar");
        employeeImplementation.hireEmployee(employee, department, employer);

        System.out.println("Added one employee");
        for (Employee e :
                department.getEmployeeArray()) {
            System.out.println(e);
        }


        System.out.println("\nDeleted one employee");

        try {
            employeeImplementation.fireEmployee(employeeOne, department, employer);
        } catch (EmployeeNotFoundException e) {
            e.printStackTrace();
        }
        for (Employee e :
                department.getEmployeeArray()) {
            System.out.println(e);
        }    }
}
