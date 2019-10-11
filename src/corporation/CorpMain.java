package corporation;
import java.util.Scanner;

public class CorpMain {



    private final int REGISTER_EMPLOYEE = 1;
    private final int REMOVE_EMPLOYEE = 2;
    private final int RETRIEVE_EMPLOYEE = 3;
    private final int UPDATE_EMPLOYEE = 4;
    private final int CALCULATE_EXPENSES = 5;
    private final int NUMBER_OF_EMPLOYEES = 6;
    private final int QUIT = 7;

    Scanner scanner = new Scanner(System.in);
    ReusaxCorp company = new ReusaxCorp();

    public void run(){
        int input;

        do {
            printMenuOptions();
            input = Integer.parseInt(readInput("Type the option number: "));

            switch (input) {
                case REGISTER_EMPLOYEE:
                    registerEmployee();
                    break;

                case REMOVE_EMPLOYEE:
                    removeEmployee();
                    break;

                case RETRIEVE_EMPLOYEE:
                    retrieveEmployee();

                    break;

                case UPDATE_EMPLOYEE:
                    updateEmployee();
                    break;

                case CALCULATE_EXPENSES:
                    calcualteCosts();
                    break;



                case NUMBER_OF_EMPLOYEES:
                    calculateEmployeeCount();
                    break;

                case QUIT:
                    System.out.println("You have successfully quit the program");
                    return;

                default:
            }
        }while(input != QUIT);
    }
        private void printMenuOptions(){
            System.out.println("Welcome to the corporation!");
            System.out.println();
            System.out.println("1. Register an employee");
            System.out.println("2. Remove an employee");
            System.out.println("3. Retrieve an employee");
            System.out.println("4. Update employee information");
            System.out.println("5. Calculate expenses");
            System.out.println("6. Retrieve amount of employees");
            System.out.println("7. QUIT");

        }
        public static void main(String[] args){
        CorpMain program = new CorpMain();
        program.run();
        }

    private String readInput(String userMessage) {

        String userInput = "";

        System.out.println(userMessage);
        userInput = scanner.nextLine();

        return userInput;
    }

    private int readInputInt(String userMessage) {

        int userInput;

        System.out.println(userMessage);
        userInput = scanner.nextInt();
        scanner.nextLine();

        return userInput;
    }

    private double readInputDouble(String userMessage) {

        double userInput;

        System.out.println(userMessage);
        userInput = scanner.nextInt();
        scanner.nextLine();

        return userInput;
    }

    private void registerEmployee (){
        String name = readInput("What's the name of the employee?");
        String id = readInput("What's the id of the employee?");
        double salary = Double.parseDouble(readInput("What's the salary of the employee?"));
        String type = readInput("Is the employee an intern, manager or director?");

        if(type.equalsIgnoreCase("intern")){

            int gpa = readInputInt("What's the gpa of the intern?");
            company.registerIntern(name,id,salary,gpa);

        }else if(type.equalsIgnoreCase("manager")){

            String degree = readInput("What's the degree of the manager?");
            company.registerManager(name, id, salary, degree);

        }else if(type.equalsIgnoreCase("director")){

            String degree = readInput("Whats the degree of the director?");
            String department = readInput("What's the department of the director?");
            company.registerDirector(name,id,salary,degree,department);

        }else {
            company.registerEmployee(name, id, salary);
        }
        System.out.println("Successfully added " + name );
    }

    private void removeEmployee(){
        String id = readInput("Which Employee do you want to remove? (ID): ");
        company.removeEmployee(id);
    }

    private void retrieveEmployee(){
        String id = readInput("Which Employee do you want to retrieve? (ID): ");
        Employee temp = company.retrieveEmployee(id);
        if (temp != null){
            System.out.println(temp);
        }

    }

    private final int UPDATE_NAME = 1;
    private final int UPDATE_SALARY = 2;
    private final int UPDATE_GPA = 3;
    private final int UPDATE_MANAGER_DEGREE = 4;
    private final int UPDATE_DIRECTOR_BENEFIT = 5;
    private final int UPDATE_POSITION = 6;
    private final int FINISH = 7;

    private void updateEmployee(){

        int input;
        String id;
        do {
            input = readInputInt("What do you want to update?" + System.lineSeparator() +
                            "1. Update Name" + System.lineSeparator() +
                            "2. Update Salary" + System.lineSeparator() +
                            "3. Update the Intern's GPA" + System.lineSeparator() +
                            "4. Update the Managers Degree" + System.lineSeparator() +
                            "5. Update the Director Benefit" + System.lineSeparator() +
                            "6. Update the Position" + System.lineSeparator() +
                            "7. Finished With Updating");



            switch (input) {

                // probably one method with a if state in the foor loop??
                case UPDATE_NAME:
                    id = readInput("What's the ID of the employee?");
                    String name = readInput("What's the new name of the employee?");
                    company.updateEmployeeName(id, name);
                    break;

                case UPDATE_SALARY:
                    id = readInput("What's the ID of the employee?");
                    double salary = readInputDouble("What's the new salary of the employee?");
                    company.updateEmployeeSalary(id, salary);
                    break;

                case UPDATE_GPA:
                    String id3 = readInput("What's the ID of the Intern?");
                    int gpa = readInputInt("What's the new GPA of the Intern?");
                    company.updateGpa(id3, gpa);
                    break;

                case UPDATE_MANAGER_DEGREE:
                    String id4 = readInput("What's the ID of the Employee?");
                    String degree = readInput("What's the new Degree of the Employee?");
                    company.updateDegree(id4, degree);
                    break;

                case UPDATE_DIRECTOR_BENEFIT:
                    double benefit = readInputDouble("What's the new Director Benefit?");
                    company.setDirectorBenefit(benefit);
                    break;

                case UPDATE_POSITION:
                    String id5 = readInput("What's the ID of the Employee?");
                    String position = readInput("What's the new position of the Employee?");

                    if(position.equalsIgnoreCase("employee")){
                        company.promoteToEmployee(id5);

                    } else if (position.equalsIgnoreCase("manager")){
                        String degree2 = readInput("What's the degree of the Employee?");
                        company.promoteToManager(id5, degree2);

                    } else if (position.equalsIgnoreCase("director")){
                        String degree2 = readInput("What's the degree of the Employee?");
                        String director = readInput("What's the department of the Director?");
                        company.promoteToDirector(id5, degree2, director);

                    } else {
                        int gpa2 = readInputInt("What's the GPA of the employee?");
                        company.promoteToIntern(id5, gpa2);
                    }
                    break;

                case FINISH:
                    System.out.println("Your changes are updated!" + System.lineSeparator());
                    return;

                default:
            }
        }while(input != QUIT);
    }


    private void calcualteCosts(){
        String input = readInput("Do you want to calcualte the net or Gross Cost? (Net / Gross)");

        if (input.equalsIgnoreCase("Net")){
            double temp = company.calculateNetCost();
            System.out.println("The net cost for salaries in the company is " + temp + " SEK.");
        } else if (input.equalsIgnoreCase("Gross")){
            double temp = company.calculateGrossCost();
            System.out.println("The Gross cost for salaries in the company is " + temp + " SEK.");
        } else {
            System.out.println("Error: Invalid input!");
        }
    }

    private void calculateEmployeeCount(){
        System.out.println("The compamy has " + company.getNumberOfEmployees() + " Employees." );
    }

}
