package corporation;

public class Intern extends Employee {

    private int gpa;

    public Intern(String name, String id, double grossSalary, int gpa){
        super(name, id, grossSalary);
        this.gpa = gpa;
    }
}
