package corporation;

import java.util.Scanner;

public class CorpMain {

    Scanner scanner = new Scanner(System.in);
    ReusaxCorp company = new ReusaxCorp();

    private final int REGISTER_EMPLOYEE = 1;
    private final int REMOVE_EMPLOYEE = 2;
    private final int RETRIEVE_EMPLOYEE = 3;
    private final int UPDATE_EMPLOYEE = 4;
    private final int CALCULATE_EXPENSES = 5;
    private final int NUMBER_OF_EMPLOYEES = 6;
    private final int UPDATE_DIRECTOR_BENEFIT = 7;
    private final int QUIT = 8;


    public void run() {
        int input;

        do {
            printMenuOptions();
            input = readInputInt("Type the option number: ");

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
                    calculateCosts();
                    break;

                case NUMBER_OF_EMPLOYEES:
                    calculateEmployeeCount();
                    break;

                case UPDATE_DIRECTOR_BENEFIT:
                    updateDirectorBenefit();
                    break;

                case QUIT:
                    System.out.println("You have successfully quit the program");
                    return;

                default:
            }
        } while (input != QUIT);
    }

    private void printMenuOptions() {
        System.out.println();
        System.out.println("Welcome to the corporation!");
        System.out.println();
        System.out.println("1. Register an employee");
        System.out.println("2. Remove an employee");
        System.out.println("3. Retrieve an employee");
        System.out.println("4. Update employee information");
        System.out.println("5. Calculate expenses");
        System.out.println("6. Retrieve amount of employees");
        System.out.println("7. Update the Director Benefit");
        System.out.println("8. QUIT");

    }

    public static void main(String[] args) {
        CorpMain program = new CorpMain();
        program.run();
    }

    private String readInput(String userMessage) {
        String userInput;

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

    private void registerEmployee() {
        String name = readInput("What's the name of the employee?");
        String id = readInput("What's the id of the employee?");
        double salary = readInputDouble("What's the salary of the employee?");
        String type = readInput("Is the employee an intern, manager or director?");

        if (type.equalsIgnoreCase("intern")) {

            int gpa = readInputInt("What's the gpa of the intern?");
            company.registerIntern(name, id, salary, gpa);

        } else if (type.equalsIgnoreCase("manager")) {

            String degree = readInput("What's the degree of the manager?");
            company.registerManager(name, id, salary, degree);

        } else if (type.equalsIgnoreCase("director")) {

            String degree = readInput("What's the degree of the director?");
            String department = readInput("What's the department of the director?");
            company.registerDirector(name, id, salary, degree, department);

        } else {
            company.registerEmployee(name, id, salary);
        }
        System.out.println("Successfully added " + name);
    }

    private void removeEmployee() {
        String id = readInput("Which Employee do you want to remove? (ID): ");
        company.removeEmployee(id);
    }

    private void retrieveEmployee() {
        String id = readInput("Which Employee do you want to retrieve? (ID): ");
        Employee temp = company.retrieveEmployee(id);
        if (temp != null) {
            System.out.println(temp);
        }

    }

    //Switch Case to update stuff inside the employees-objects
    private final int UPDATE_NAME = 1;
    private final int UPDATE_SALARY = 2;
    private final int UPDATE_GPA = 3;
    private final int UPDATE_MANAGER_DEGREE = 4;
    private final int UPDATE_POSITION = 5;
    private final int FINISH = 7;

    private void updateEmployee() {

        int input;
        String id;

        do {
            input = readInputInt("What do you want to update?" + System.lineSeparator() +
                    "1. Update Name" + System.lineSeparator() +
                    "2. Update Salary" + System.lineSeparator() +
                    "3. Update the Intern's GPA" + System.lineSeparator() +
                    "4. Update the Degree " + System.lineSeparator() +
                    "6. Update the Position" + System.lineSeparator() +
                    "7. Finished With Updating");

            switch (input) {
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
                    id = readInput("What's the ID of the Intern?");
                    int gpa = readInputInt("What's the new GPA of the Intern?");
                    company.updateGpa(id, gpa);
                    break;

                case UPDATE_MANAGER_DEGREE:
                    id = readInput("What's the ID of the Employee?");
                    String degree = readInput("What's the new Degree of the Employee?");
                    company.updateDegree(id, degree);
                    break;

                case UPDATE_POSITION:
                    id = readInput("What's the ID of the Employee?");
                    String position = readInput("What's the new position of the Employee?");

                    if (position.equalsIgnoreCase("employee")) {
                        company.promoteToEmployee(id);

                    } else if (position.equalsIgnoreCase("manager")) {
                        String degree2 = readInput("What's the degree of the Employee?");
                        company.promoteToManager(id, degree2);

                    } else if (position.equalsIgnoreCase("director")) {
                        String degree2 = readInput("What's the degree of the Employee?");
                        String director = readInput("What's the department of the Director?");
                        company.promoteToDirector(id, degree2, director);

                    } else {
                        int gpa2 = readInputInt("What's the GPA of the employee?");
                        company.promoteToIntern(id, gpa2);
                    }
                    break;

                case FINISH:
                    System.out.println("Your changes are updated!" + System.lineSeparator());
                    return;

                default:
            }
        } while (input != QUIT);
    }

    private void calculateCosts() {
        String input = readInput("Do you want to calculate the net or Gross Cost? (Net / Gross)");
        if (input.equalsIgnoreCase("net") || input.equalsIgnoreCase("gross")) {
            System.out.println("The " + input + " cost for the company is " + company.getExpenses(input) + " SEK.");
        } else {
            System.out.println("Error: Invalid Input!");
        }

    }

    private void calculateEmployeeCount() {
        System.out.println("The company has " + company.getNumberOfEmployees() + " Employees.");
    }

    private void updateDirectorBenefit() {
        double benefit = readInputDouble("What's the new Director Benefit?");
        company.setDirectorBenefit(benefit);
        System.out.println("The new Director Benefit is now: " + benefit + " SEK.");
    }

}
