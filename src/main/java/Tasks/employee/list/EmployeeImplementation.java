package Tasks.employee.list;

import java.util.Date;
import java.util.List;

public class EmployeeImplementation implements EmployeeInterface {
    @Override
    public void fireEmployee(Employee employee, Department department, Employer employer) throws EmployeeNotFoundInList {
        if (department.getEmployeeList().contains(employee)) {
            department.getEmployeeList().remove(employee);
            System.out.println("U pushua " + employee.getEmri() + " nga " + employer.getEmri());
        } else {
            throw new EmployeeNotFoundInList("po pushon komshiun");
        }
    }

    @Override
    public void hireEmployee(Employee employee, Department department, Employer employer) {
        department.getEmployeeList().add(employee);
        System.out.println(employee.getEmri() + " sapo nisi pune nga " + employer.getEmri());
    }

    @Override
    public void employeeQuits(Employee employee, Department department) {
        department.getEmployeeList().remove(employee);
        System.out.println("ungrateful");
    }

    @Override
    public void employeePromotion(Employee employee, Department department) {
        Employer menaxheriIRi = new Employer();
        menaxheriIRi.setEmri(employee.getEmri());
        menaxheriIRi.setMbiemri(employee.getMbiemri());
        menaxheriIRi.setExperience(0);
        Employer oldMenaxher = department.getMenaxher();
        department.setMenaxher(menaxheriIRi);
        department.getEmployeeList().add(new Employee(oldMenaxher.getEmri(), oldMenaxher.getMbiemri(), new Date()));
    }
}
