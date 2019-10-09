package corporation;

public class Intern extends Employee {

    private int gpa;

    public Intern(String name, String id, double grossSalary, int gpa){
        super(name, id, grossSalary);
        this.gpa = gpa;
    }

    public int getGpa(){
        return this.gpa;
    }

    public void setGpa(String userInput){
        this.gpa =  Integer.parseInt(userInput);
    }

    public void setInternSalary(){

        if(getGpa()<=5){
            setGrossSalary(0);
        }if(getGpa()>=8){
            double internSalary = getGrossSalary();
            setGrossSalary(internSalary + 1000);
        }
    }
}
