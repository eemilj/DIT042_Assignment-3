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

    public String readInput(String userMessage) {

        String userInput = "";

        System.out.println(userMessage);
        userInput = scanner.nextLine();

        return userInput;
    }

    public void run(){
        int input;

        do {
            printMenuOptions();
            input = Integer.parseInt(readInput("Type the option number: "));

            switch (input) {
                case REGISTER_EMPLOYEE:

                    break;

                case REMOVE_EMPLOYEE:

                    break;

                case RETRIEVE_EMPLOYEE:

                    break;

                case UPDATE_EMPLOYEE:

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
            System.out.println("5. Calculate expenses");
            System.out.println("6. Retrieve amount of employees");
            System.out.println("7.QUIT");




        }
        public static void main(String[] args){
        CorpMain program = new CorpMain();
        program.run();
        }
}
