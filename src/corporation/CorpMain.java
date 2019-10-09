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
                    retrieveEMployee();

                    break;

                case UPDATE_EMPLOYEE:
                    updateEmployee();
                    break;

                case CALCULATE_EXPENSES:


                    break;



                case NUMBER_OF_EMPLOYEES:

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
            System.out.println("5. Calculate Net expenses");
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

        company.registerEmployee(name, id, salary);

        System.out.println("Successfully added " + name );
    }

    private void removeEmployee(){
        String id = readInput("Which Employee do you want to remove? (ID): ");
        company.removeEmployee(id);
    }

    private void retrieveEMployee(){
        String id = readInput("Which Employee do you want to remove? (ID): ");
        System.out.println(company.retrieveEmployee(id));
    }

    private final int UPDATE_NAME = 1;
    private final int UPDATE_SALARY = 2;
    private final int FINISH = 3;

    public void updateEmployee(){

        int input;
        do {
            input = readInputInt("What do you want to update?" + System.lineSeparator() +
                            "1. Update Name" + System.lineSeparator() +
                            "2. Update Salary" + System.lineSeparator() +
                            "3. Finished With Updating");

            switch (input) {
                case UPDATE_NAME:
                    String ID = readInput("What's the id of the employee?");
                    String name = readInput("What's the new name of the employee?");
                    company.updateEmployeeName(ID, name);
                    break;

                case UPDATE_SALARY:
                    String ID2 = readInput("What's the id of the employee?");
                    double salary = readInputDouble("What's the new salary of the employee?");
                    company.updateEmployeeSalary(ID2, salary);
                    break;

                case FINISH:
                    System.out.println("Changes are updated!");
                    return;

                default:
            }
        }while(input != QUIT);
    }
}
