package corporation;

import java.util.ArrayList;


public class ReusaxCorp {


    private ArrayList<Employee> employeeRegister = new ArrayList<>();

    public void registerEmployee(String name, String ID, double gs) {
        Employee newEmployee = new Employee(name, ID, gs);
        employeeRegister.add(newEmployee);
    }


    public Employee retrieveEmployee(String ID) {
        for (int i = 0; i < employeeRegister.size(); i++) {
            if (employeeRegister.get(i).getID().equals(ID)) {
                return employeeRegister.get(i);
            }
        }
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
        Employee retrivedEmployee = retrieveEmployee(ID);
        if (retrivedEmployee != null){
            retrivedEmployee.setName(name);
        }

    }
    //Method to update the Gross Salary of an employee
    public void updateEmployeeSalary(String ID, double salary){
        Employee retrivedEmployee = retrieveEmployee(ID);
        if (retrivedEmployee != null){
            retrivedEmployee.setGrossSalary(salary);
        }
    }

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








 }



