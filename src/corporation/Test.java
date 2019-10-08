package corporation;

public class Test {

    public static void main (String [] args){
            ReusaxCorp company = new ReusaxCorp();
            company.registerEmployee("Chris", "CH40", 5000);
            System.out.println(company.counter);
    }
}