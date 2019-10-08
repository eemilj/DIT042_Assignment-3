package corporation;

public class Employee {

    private String name;
    private String id;
    private double grossSalary;

    public Employee(String name, String id, double grossSalary) {

        this.name = name;
        this.id = id;
        this.grossSalary = grossSalary;
        netSalary();
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
    public double netSalary() {
        double netSalary = this.grossSalary - (this.grossSalary * 0.1);
        return netSalary;
    }

    //Method to return print message
    public String printSalary() {
        String printSalary = this.name + "’s gross salary is of " + this.grossSalary + " SEK per month.";
        return printSalary;

    }
}
