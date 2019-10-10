package corporation;

public class Director extends Manager {



    private String department;
    private double dirPay;


    public Director(String name, String id, double grossSalary, String degree, String department) {
        super(name, id, grossSalary,degree);
        this.department = department;
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

}
