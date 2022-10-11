package Tasks.EmployeeTime;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GeneralMain {

    public static void main(String[] args) throws EmployeeNotFoundInList {

        Department scientific = new Department();

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many employees you want? ");
        Integer employeeNr = scanner.nextInt();

        List<Employee> userInput = new ArrayList<>();

        for (int i = 0; i < employeeNr; i++) {
            System.out.println("Please add employee name, surname, age and experience: ");
            String name = scanner.next();
            String surname = scanner.next();
            Integer age = scanner.nextInt();
            Integer experience = scanner.nextInt();
            Employee newEmployee = new Employee(name, surname, age, experience);
            userInput.add(newEmployee);
        }
        Employer manager = new Employer("Warren", "Buffet", 21, "Tech");
        scientific.setManager(manager);
        scientific.setEmployees(userInput);

        ExampleImplementation implementation = new ExampleImplementation();


        boolean continueLoad = true;
        while (continueLoad) {
            System.out.println("Zgjidh nje nga opsionet: " +
                    "\n 1 - Hire" +
                    "\n 2 - Fire" +
                    "\n 3 - Quit" +
                    "\n 4 - Promote" +
                    "\n 5- PRINTO DATA" +
                    "\n 6 - QUIT");
            Integer input2 = scanner.nextInt();
            switch (input2) {
                case 1:
                    System.out.println("Please add employee name, surname, age and experience: ");
                    String name = scanner.next();
                    String surname = scanner.next();
                    Integer age = scanner.nextInt();
                    Integer experience = scanner.nextInt();
                    Employee newEmployed = new Employee(name, surname, age, experience);
                    implementation.hireEmployee(newEmployed, scientific, manager);
                    break;
                case 2:
                    System.out.println("Please add employee name, surname, age and experience: ");
                    String name1 = scanner.next();
                    String surname1 = scanner.next();
                    Integer age1 = scanner.nextInt();
                    Integer experience1 = scanner.nextInt();
                    Employee fired = new Employee(name1, surname1, age1, experience1);
                    implementation.fireEmployee(fired, scientific, manager);
                    break;
                case 3:
                    System.out.println("Please add employee name, surname, age and experience: ");
                    String name2 = scanner.next();
                    String surname2 = scanner.next();
                    Integer age2 = scanner.nextInt();
                    Integer experience2 = scanner.nextInt();
                    Employee quit = new Employee(name2, surname2, age2, experience2);
                    implementation.employeeQuits(quit, scientific);
                    break;
                case 4:
                    System.out.println("Please add employee name, surname, age and experience: ");
                    String name3 = scanner.next();
                    String surname3 = scanner.next();
                    Integer age3 = scanner.nextInt();
                    Integer experience3 = scanner.nextInt();
                    Employee promoted = new Employee(name3, surname3, age3, experience3);
                    implementation.employeePromotion(promoted, scientific);
                    break;
                case 5:
                    for (Employee e :
                            scientific.getEmployees()) {
                        System.out.println(e);
                    }
                    break;
                case 6:
                    continueLoad = false;
                    break;
            }
        }

    }
}
