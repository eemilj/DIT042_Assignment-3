package corporation;

public class Director extends Manager {

    private String department;

    public Director(String department, String degree, String name, String id, double grossSalary) {
        super(name, id, grossSalary, degree);
        this.department = department;
    }
}
