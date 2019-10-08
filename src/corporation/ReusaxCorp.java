package corporation;

import java.util.ArrayList;


public class ReusaxCorp {



    ArrayList <Employee> employeeRegister = new ArrayList<Employee>();

    public void registerEmployee(String name, String ID, double gs){
        Employee newEmployee = new Employee(name, ID, gs);
        employeeRegister.add(newEmployee);

    }

    public Employee retrieveEmployee(String ID){

        for ( int i = 0 ; i < employeeRegister.size(); i++) {
            if (employeeRegister.get(i).equals(ID)) {
                return employeeRegister.get(i);
            }
        }
            return null;
        }




}


