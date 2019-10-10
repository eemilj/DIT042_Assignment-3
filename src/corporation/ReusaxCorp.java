package corporation;

import java.util.ArrayList;


public class ReusaxCorp {


    private static double directorBenefit;

    private ArrayList<Employee> employeeRegister = new ArrayList<>();

    //Getter for director pay
    public static double getDirectorBenefit(){
        return directorBenefit;
    }
    //Setter for director pay
    public static void setDirectorBenefit(double endUserInput){
        directorBenefit = endUserInput;
    }

    public void registerEmployee(String name, String id, double gs) {
        Employee newEmployee = new Employee(name, id, gs);
        employeeRegister.add(newEmployee);
    }
    public void registerManager(String name, String id, double gs, String degree){
        Manager newManager = new Manager(name, id, gs, degree);
        employeeRegister.add(newManager);
    }
    public void registerIntern(String name, String id, double gs, int gpa){
        Intern newIntern = new Intern(name, id, gs, gpa);
        employeeRegister.add(newIntern);
    }
    public void registerDirector(String name, String id, double gs, String degree, String department){
        Director newDirector = new Director(name, id, gs, degree, department);
        employeeRegister.add(newDirector);
    }


    public Employee retrieveEmployee(String id) {
        for (int i = 0; i < employeeRegister.size(); i++) {
            if (employeeRegister.get(i).getId().equals(id)) {
                return employeeRegister.get(i);
            }
        }
        System.out.println("Error: The Employee with the id " + id + "is not registered in the system.");
        return null;
    }



    public boolean removeEmployee (String id){
        Employee temp = retrieveEmployee(id);
        if (temp != null){
            employeeRegister.remove(temp);
            return true;
        }
        return false;
    }

    public double getExpenses(String input){

        double expenses = 0;



        for (int i = 0; i < employeeRegister.size(); i++){
            double tempExpense = employeeRegister.get(i).getNetSalary();
            expenses += tempExpense;
        }

        return expenses;
    }
    //Method to update the name of an employee
    public void updateEmployeeName(String id, String name){
        Employee retrievedEmployee = retrieveEmployee(id);
        if (retrievedEmployee != null){
            retrievedEmployee.setName(name);
        }

    }
    //Method to update the Gross Salary of an employee
    public void updateEmployeeSalary(String id, double salary){
        Employee retrievedEmployee = retrieveEmployee(id);
        if (retrievedEmployee != null){
            retrievedEmployee.setGrossSalary(salary);
        }
    }



    // probably one method with a if state in the foor loop
    public double calculateNetCost(){
        double cost = 0;
        for (int i = 0; i < employeeRegister.size(); i++){
            double temp = employeeRegister.get(i).getNetSalary();
            cost += temp;
        }
        return cost;
    }

    public double calculateGrossCost(){
        double cost = 0;
        for (int i = 0; i < employeeRegister.size(); i++){
            double temp = employeeRegister.get(i).getGrossSalary();
            cost += temp;
        }
        return cost;
    }

    public int getNumberOfEmployees(){
        return employeeRegister.size();
    }

    public void updateDegree(String id, String degree){
        Employee retrievedEmployee = retrieveEmployee(id);
        if(retrievedEmployee != null && retrievedEmployee instanceof Manager) {
            Manager retrievedEmployeeManager = (Manager) retrievedEmployee;
            retrievedEmployeeManager.setDegree(degree);
        }
    }

    public void updateGpa(String id, int Gpa){
        Employee retrievedEmployee = retrieveEmployee(id);
        if(retrievedEmployee != null && retrievedEmployee instanceof Intern){
            Intern retrievedEmployeeIntern = (Intern) retrievedEmployee;
            retrievedEmployeeIntern.setGpa(Gpa);
        }
    }

    public void promoteToEmployee(String id){
        Employee retrievedEmployee = retrieveEmployee(id);
        String name = retrievedEmployee.getName();
        double Salary = retrievedEmployee.getGrossSalary();
        removeEmployee(id);
        Employee newEmployee = new Employee(name, id, Salary);
        employeeRegister.add(newEmployee);
    }

    public void promoteToManager(String id, String degree){
        Employee retrievedEmployee = retrieveEmployee(id);
        String name = retrievedEmployee.getName();
        double Salary = retrievedEmployee.getGrossSalary();
        removeEmployee(id);
        Manager newEmployee = new Manager(name, id, Salary, degree);
        employeeRegister.add(newEmployee);
    }

    public void promoteToDirector(String id, String degree, String department){
        Employee retrievedEmployee = retrieveEmployee(id);
        String name = retrievedEmployee.getName();
        double Salary = retrievedEmployee.getGrossSalary();
        removeEmployee(id);
        Director newEmployee = new Director(name, id, Salary, degree, department);
        employeeRegister.add(newEmployee);
    }

    public void promoteToIntern(String id, int gpa){
        Employee retrievedEmployee = retrieveEmployee(id);
        String name = retrievedEmployee.getName();
        double Salary = retrievedEmployee.getGrossSalary();
        removeEmployee(id);
        Intern newEmployee = new Intern(name, id, Salary, gpa);
        employeeRegister.add(newEmployee);
    }
 }



