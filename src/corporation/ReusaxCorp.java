package corporation;

import java.util.ArrayList;


public class ReusaxCorp {

    public ReusaxCorp company = new ReusaxCorp();

    ArrayList <Employee> employeeRegister = new ArrayList<Employee>();

    public void registerEmployee(String name, String ID, double gs){
        Employee newEmployee = new Employee(name, ID, gs);
        employeeRegister.add(newEmployee);

    }



}

