package Tasks.EmployeeTime;

public class ExampleImplementation implements ExampleInterface {

    @Override
    public void hireEmployee(Employee em, Department dr, Employer er) {
        dr.getEmployees().remove(em);

    }

    @Override
    public void fireEmployee(Employee em, Department dr, Employer er) throws EmployeeNotFoundInList {
        if (dr.getEmployees().contains(em)){
            dr.getEmployees().remove(em);
            System.out.println("U pushua: "+em.getName()+" nga "+er.getName()+".");
        }else {
            throw new EmployeeNotFoundInList("Po pushon komshiun.");
        }
    }

    @Override
    public void employeeQuits(Employee em, Department dr) {
        dr.getEmployees().remove(em);
        System.out.println(em.getName()+" is ungrateful!");
    }

    @Override
    public void employeePromotion(Employee em, Department dr) {

        Employer menaxheriIRi = new Employer();
        menaxheriIRi.setName(em.getName());
        menaxheriIRi.setSurname(em.getSurname());
        menaxheriIRi.setExperience(0);
        Employer oldMenaxher = new Employer();

        }
    }
