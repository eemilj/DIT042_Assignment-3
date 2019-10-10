package corporation;

import java.util.ArrayList;


public class ReusaxCorp {


    private static double directorBenefit = 5000;

    private ArrayList<Employee> employeeRegister = new ArrayList<>();

    public void setDirecxtorBenefit(double dirBenifit){
        this.directorBenefit = dirBenifit;

    }
    //Getter for director pay
    public static double getDirectorBenefit(){
        return directorBenefit;
    }
    //Setter for director pay
    public static void setDirectorBenefit(double endUserInput){
        directorBenefit = endUserInput;
    }

    public void registerEmployee(String name, String ID, double gs) {
        Employee newEmployee = new Employee(name, ID, gs);
        employeeRegister.add(newEmployee);
    }
    public void registerManager(String name, String ID, double gs, String degree){
        Manager newManager = new Manager(name, ID, gs, degree);
        employeeRegister.add(newManager);
    }
    public void registerIntern(String name, String ID, double gs, int gpa){
        Intern newIntern = new Intern(name, ID, gs, gpa);
        employeeRegister.add(newIntern);
    }
    public void registerDirector(String name, String ID, double gs, String degree, String department){
        Director newDirector = new Director(name, ID, gs, degree, department);
        employeeRegister.add(newDirector);
    }



    public Employee retrieveEmployee(String ID) {
        for (int i = 0; i < employeeRegister.size(); i++) {
            if (employeeRegister.get(i).getID().equals(ID)) {
                return employeeRegister.get(i);
            }
        }
        System.out.println("Error: The Employee with the ID " + ID + "is not registered in the system.");
        return null;
    }



    public boolean removeEmployee (String ID){
        Employee temp = retrieveEmployee(ID);
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
    public void updateEmployeeName(String ID, String name){
        Employee retrievedEmployee = retrieveEmployee(ID);
        if (retrievedEmployee != null){
            retrievedEmployee.setName(name);
        }

    }
    //Method to update the Gross Salary of an employee
    public void updateEmployeeSalary(String ID, double salary){
        Employee retrievedEmployee = retrieveEmployee(ID);
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

    public void updateDegree(String ID, String degree){
        Employee retrievedEmployee = retrieveEmployee(ID);
        if(retrievedEmployee != null && retrievedEmployee instanceof Manager) {
            Manager retrievedEmployeeManager = (Manager) retrievedEmployee;
            retrievedEmployeeManager.setDegree(degree);
        }

    }

    public void updateGpa(String ID, int Gpa){
        Employee retrievedEmployee = retrieveEmployee(ID);
        if(retrievedEmployee != null && retrievedEmployee instanceof Intern){
            Intern retrievedEmployeeIntern = (Intern) retrievedEmployee;
            retrievedEmployeeIntern.setGpa(Gpa);
        }

    }





 }



