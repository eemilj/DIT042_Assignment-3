package corporation;

public class Director extends Manager {

    private String department;

    public Director(String name, String id, double grossSalary, String department, String degree) {
        super(name, id, grossSalary, degree);
        this.department = department;
    }
}
