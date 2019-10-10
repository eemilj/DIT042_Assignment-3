package corporation;

public class Director extends Manager {

    ReusaxCorp corp = new ReusaxCorp();

    private String department;
    private double dirPay = getGrossSalary() + getManBenefit() + getDirBenefit();
    private double dirBenefit;

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

    public double getDirBenefit(){
        return this.dirBenefit;
    }

    public void setDirBenefit(){

    }

    @Override
    public double getGrossSalary(){
        return this.dirPay;
    }

}
