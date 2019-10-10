package corporation;

public class Director extends Manager {



    private String department;
    private double dirPay = getGrossSalary() + getManBenefit() + ReusaxCorp.getDirectorBenefit();


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
        return this.dirPay;
    }

}
