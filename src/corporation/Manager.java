package corporation;

public class Manager extends Employee {

    String degree;

    public Manager(String degree, String name, String ID, double grossSalary) {
        super(name, ID, grossSalary);
        this.degree = degree;
    }

}
