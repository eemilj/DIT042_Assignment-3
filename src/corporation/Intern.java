package corporation;

public class Intern extends Employee {

    private double internBenefit;
    private double internSalary;
    private int gpa;

    public Intern(String name, String id, double grossSalary, int gpa){
        super(name, id, grossSalary);
        this.gpa = gpa;
        setInternSalary();
        setInternBenefit();
    }

    public int getGpa(){
        return this.gpa;
    }

    public void setGpa(int endUserInput){
        this.gpa = endUserInput;
        setInternBenefit();
        setInternSalary();
    }

    public double getInternSalary() {
        return internSalary;
    }

    public void setInternSalary(){
        internSalary = super.getGrossSalary() + getInternBenefit();
    }

    public double getInternBenefit(){
        return this.internBenefit;
    }

    public void setInternBenefit(){

        if(this.gpa<=5){
            internBenefit = (-1) * (getGrossSalary());
        }else if(this.gpa>=8){
            internBenefit = 1000;
        }else {
            internBenefit = 0;
        }
    }
    @Override
    public double getGrossSalary(){
        return this.internSalary;
    }
    @Override
    public double getNetSalary(){
        return this.internSalary*0.9;
    }
}
