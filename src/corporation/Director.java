package corporation;

public class Director extends Manager {



    private String department;
    private double dirPay;


    public Director(String name, String id, double grossSalary, String degree, String department) {
        super(name, id, grossSalary, degree);
        this.department = department;
        setDirPay();
    }
    public void setDegree(String userInput){
        super.setDegree(userInput);
        setDirPay();
    }

    public void setDirPay(){
        dirPay =  super.getGrossSalary() + ReusaxCorp.getDirectorBenefit();

    }
    public void setDepartment(String endUserInput){
        this.department = endUserInput;
    }

    public String getDepartment(){
        return this.department;
    }
    @Override
    public double getGrossSalary(){
        return this.dirPay;
    }

    @Override
    public double getNetSalary() {

        if (this.dirPay < 30000){
            return (dirPay * 0.9);
        } else if (this.dirPay <= 50000){
            return  (dirPay * 0.8);
        } else {
            double temp = dirPay - 30000;
            double netSalary = 30000 * 0.8 + temp * 0.6;
            return netSalary;
        }

    }
}
