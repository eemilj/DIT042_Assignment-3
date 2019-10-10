package corporation;

import javax.swing.*;
import java.util.Objects;

public class Employee {

    protected String name;
    protected String id;
    protected double grossSalary;

    public Employee(String name, String id, double grossSalary) {

        this.name = name;
        this.id = id;
        this.grossSalary = grossSalary;
    }

    //Getters
    public String getName() {
        return this.name;
    }

    public String getID() {
        return this.id;
    }

    public double getGrossSalary() {
        return this.grossSalary;
    }

    //Setters
    public void setName(String endUserInput) {
        this.name = endUserInput;
    }

    public void setGrossSalary(double endUserInput) {
        this.grossSalary = endUserInput;
    }

    //Method to calculate and return netSalary
    public double getNetSalary() {
        double netSalary = this.grossSalary - (this.grossSalary * 0.1);
        return netSalary;
    }

    //Method to return print message
    @Override
    public String toString() {
        return this.name + "’s gross salary is of " + getGrossSalary() + " SEK per month.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return Objects.equals(id, employee.id);
    }


}
