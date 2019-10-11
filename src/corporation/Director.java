package corporation;

public class Director extends Manager {

    String department;
    protected static double dirBenefit; //storing the directors benefit in a static variable

    public Director(String name, String id, double grossSalary, String degree, String department) {
        super(name, id, grossSalary, degree);
        this.department = department;
    }

    //overrides for correct salary
    @Override
    public double getGrossSalary() {
        return super.getGrossSalary() + dirBenefit;
    }

    @Override
    public double getNetSalary() {

        double pay = getGrossSalary();

        if (pay < 30000) {
            return (pay * 0.9);
        } else if (pay <= 50000) {
            return (pay * 0.8);
        } else {
            double temp = pay - 30000;
            double netSalary = 30000 * 0.8 + temp * 0.6;
            return netSalary;
        }

    }
}
