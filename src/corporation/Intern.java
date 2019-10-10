package corporation;

public class Intern extends Employee {

    private double internBenefit;
    private double internSalary = getGrossSalary() + getInternBenefit();
    private int gpa;

    public Intern(String name, String id, double grossSalary, int gpa){
        super(name, id, grossSalary);
        this.gpa = gpa;
    }

    public int getGpa(){
        return this.gpa;
    }

    public void setGpa(int endUserInput){
        this.gpa = endUserInput;
        getInternBenefit();
    }

    public double getInternBenefit(){

        if(this.gpa<=5){
            internBenefit = (-1) * (getGrossSalary());
        }else if(this.gpa>=8){
            internBenefit = 1000;
        }else
            internBenefit = 0;

        return internBenefit;
    }
}
