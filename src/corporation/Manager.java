package corporation;

public class Manager extends Employee {

    private String degree;


    public Manager(String name, String id, double grossSalary, String degree) {
        super(name, id, grossSalary);
        this.degree = degree;
    }

    public void setDegree(String endUserInput){
        this.degree = endUserInput;
        System.out.println(this.degree);
    }

    public String getDegree(){
        return this.degree;
    }



    @Override
    public double getGrossSalary(){

        double temp = 0;
        if(this.degree.equalsIgnoreCase("BSc")){
            temp = this.grossSalary*0.1;
        }else if(this.degree.equalsIgnoreCase("MSc")){
            temp = this.grossSalary*0.2;
        }else if(this.degree.equalsIgnoreCase("PhD")){
            temp = this.grossSalary*0.35;
        }

        return temp + super.getGrossSalary();

    }



}
