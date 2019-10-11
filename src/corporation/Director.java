package corporation;

public class Director extends Manager {

    private String department;
    private static double directorBenefit;

    public Director(String name, String id, double grossSalary, String degree, String department) {
        super(name, id, grossSalary,degree);
        this.department = department;


    }

    public void setDepartment(String endUserInput){
        this.department = endUserInput;
    }

    public String getDepartment(){
        return this.department;
    }
    @Override
    public double getGrossSalary(){

        return super.getGrossSalary() + ReusaxCorp.getDirectorBenefit();
    }

    @Override
    public double getNetSalary() {

        double pay = getGrossSalary();

        if (pay < 30000){
            return (pay * 0.9);
        } else if (pay <= 50000){
            return  (pay * 0.8);
        } else {
            double temp = pay - 30000;
            double netSalary = 30000 * 0.8 + temp * 0.6;
            return netSalary;
        }
    }
}
