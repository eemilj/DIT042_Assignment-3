package corporation;

public class Manager extends Employee {

    private String degree;
    private double managerPay;
    private double manBenefit;

    public Manager(String name, String id, double grossSalary, String degree) {
        super(name, id, grossSalary);
        this.degree = degree;
        setManBenefit();
        setManagerPay();
    }

    public void setDegree(String endUserInput){
        this.degree = endUserInput;
        setManBenefit();
        setManagerPay();
    }
    public String getDegree(){
        return this.degree;
    }
    public double getManBenefit(){
        return this.manBenefit;
    }

    public void setManBenefit(){

        if(this.degree.equals("BSc")){
            manBenefit = this.grossSalary*0.1;
        }else if(this.degree.equals("MSc")){
            manBenefit = this.grossSalary*0.2;
        }else if(this.degree.equals("PhD")){
            manBenefit = this.grossSalary*0.35;
        }
    }
    public void setManagerPay(){
        managerPay = super.grossSalary + this.manBenefit;
    }
    @Override
    public double getGrossSalary(){
        return this.managerPay;
    }

    @Override
    public double getNetSalary(){
        return this.managerPay * 0.9;
    }

}
