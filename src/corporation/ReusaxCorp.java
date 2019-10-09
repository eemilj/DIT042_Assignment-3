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









 }



