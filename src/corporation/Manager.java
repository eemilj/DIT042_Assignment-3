package corporation;

public class Manager extends Employee {

    private String degree;

    public Manager(String name, String id, double grossSalary, String degree) {
        super(name, id, grossSalary);
        this.degree = degree;
    }

}
