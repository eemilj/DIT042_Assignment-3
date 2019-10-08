package corporation;

public class Director extends Manager {

    private String department;

    public Director(String name, String id, double grossSalary, String degree, String department) {
        super(name, id, grossSalary, degree);
        this.department = department;
    }
}
