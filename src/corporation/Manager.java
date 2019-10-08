package corporation;

public class Manager extends Employee {

    private String degree;

    public Manager(String degree, String name, String id, double grossSalary) {
        super(name, id, grossSalary);
        this.degree = degree;
    }

}
