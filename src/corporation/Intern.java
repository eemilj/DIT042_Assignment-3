package corporation;

public class Intern extends Employee {

    private int gpa;

    public Intern(String name, String id, double grossSalary, int gpa) {
        super(name, id, grossSalary);
        this.gpa = gpa;

    }

    public void setGpa(int endUserInput) {
        this.gpa = endUserInput;
    }


    public double getInternBenefit() {

        double internBenefit;

        if (this.gpa <= 5) {
            internBenefit = (-1) * super.getGrossSalary();
        } else if (this.gpa >= 8) {
            internBenefit = 1000;
        } else {
            internBenefit = 0;
        }
        return internBenefit;
    }

    @Override
    public double getGrossSalary() {
        return super.getGrossSalary() + getInternBenefit();
    }

    @Override
    public double getNetSalary() {
        double salary = getGrossSalary();
        return salary * 0.9;
    }
}
