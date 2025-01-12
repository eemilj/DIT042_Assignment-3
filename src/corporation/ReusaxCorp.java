package corporation;

import java.util.ArrayList;


public class ReusaxCorp {


    private ArrayList<Employee> employeeRegister = new ArrayList<>();

    //Methods to create employee, manager, intern, director
    public void registerEmployee(String name, String id, double gs) {
        Employee newEmployee = new Employee(name, id, gs);
        employeeRegister.add(newEmployee);
    }

    public void registerManager(String name, String id, double gs, String degree) {
        Employee newManager = new Manager(name, id, gs, degree);
        employeeRegister.add(newManager);
    }

    public void registerIntern(String name, String id, double gs, int gpa) {
        Employee newIntern = new Intern(name, id, gs, gpa);
        employeeRegister.add(newIntern);
    }

    public void registerDirector(String name, String id, double gs, String degree, String department) {
        Employee newDirector = new Director(name, id, gs, degree, department);
        employeeRegister.add(newDirector);
    }

    //Method to remove employee
    public void removeEmployee(String id) {
        Employee temp = retrieveEmployee(id);
        if (temp != null) {
            employeeRegister.remove(temp);
        }
    }

    //Method to retrieve a employee
    public Employee retrieveEmployee(String id) {
        for (int i = 0; i < employeeRegister.size(); i++) {
            if (employeeRegister.get(i).getId().equals(id)) {
                return employeeRegister.get(i);
            }
        }
        System.out.println("Error: The Employee with the id " + id + "is not registered in the system.");
        return null;
    }

    //Methods to update the name, salary, degree and GPA
    public void updateEmployeeName(String id, String name) {
        Employee retrievedEmployee = retrieveEmployee(id);
        if (retrievedEmployee != null) {
            retrievedEmployee.setName(name);
        }
    }

    public void updateEmployeeSalary(String id, double salary) {
        Employee retrievedEmployee = retrieveEmployee(id);
        if (retrievedEmployee != null) {
            retrievedEmployee.setGrossSalary(salary);
        }
    }

    public void updateDegree(String id, String degree) {
        Employee retrievedEmployee = retrieveEmployee(id);
        if (retrievedEmployee != null && retrievedEmployee instanceof Manager) {
            Manager retrievedEmployeeManager = (Manager) retrievedEmployee;
            retrievedEmployeeManager.setDegree(degree);
        }
    }

    public void updateGpa(String id, int Gpa) {
        Employee retrievedEmployee = retrieveEmployee(id);
        if (retrievedEmployee != null && retrievedEmployee instanceof Intern) {
            Intern retrievedEmployeeIntern = (Intern) retrievedEmployee;
            retrievedEmployeeIntern.setGpa(Gpa);
        }
    }

    //Methods to promote employees to a different position
    public void promoteToEmployee(String id) {
        Employee retrievedEmployee = retrieveEmployee(id);
        String name = retrievedEmployee.getName();
        double Salary = retrievedEmployee.getGrossSalary();
        removeEmployee(id);
        Employee newEmployee = new Employee(name, id, Salary);
        employeeRegister.add(newEmployee);
    }

    public void promoteToManager(String id, String degree) {
        Employee retrievedEmployee = retrieveEmployee(id);
        String name = retrievedEmployee.getName();
        double Salary = retrievedEmployee.getGrossSalary();
        removeEmployee(id);
        Employee newEmployee = new Manager(name, id, Salary, degree);
        employeeRegister.add(newEmployee);
    }

    public void promoteToDirector(String id, String degree, String department) {
        Employee retrievedEmployee = retrieveEmployee(id);
        String name = retrievedEmployee.getName();
        double Salary = retrievedEmployee.getGrossSalary();
        removeEmployee(id);
        Employee newEmployee = new Director(name, id, Salary, degree, department);
        employeeRegister.add(newEmployee);
    }

    public void promoteToIntern(String id, int gpa) {
        Employee retrievedEmployee = retrieveEmployee(id);
        String name = retrievedEmployee.getName();
        double Salary = retrievedEmployee.getGrossSalary();
        removeEmployee(id);
        Employee newEmployee = new Intern(name, id, Salary, gpa);
        employeeRegister.add(newEmployee);
    }

    //Method to get the expenses of the employees of the company
    public double getExpenses(String expenses) {
        double cost = 0;
        if (expenses.equalsIgnoreCase("net")) {
            for (int i = 0; i < employeeRegister.size(); i++) {
                double temp = employeeRegister.get(i).getNetSalary();
                cost += temp;
            }

        } else if (expenses.equalsIgnoreCase("gross")) {
            for (int i = 0; i < employeeRegister.size(); i++) {
                double temp = employeeRegister.get(i).getGrossSalary();
                cost += temp;
            }
        }

        return cost;
    }

    //Method to retrieve the current number of employees registered
    public int getNumberOfEmployees() {
        return employeeRegister.size();
    }

    //Setter for director pay
    public void setDirectorBenefit(double endUserInput) {
        Director.dirBenefit = (endUserInput);
    }


}



