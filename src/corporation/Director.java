package corporation;

public class Director extends Employee {

    private String degree;
    private String department;

    public Director(String department, String degree, String name, String id, double grossSalary) {
        super(name, id, grossSalary);
        this.degree = degree;
        this.department = department;
    }
}
