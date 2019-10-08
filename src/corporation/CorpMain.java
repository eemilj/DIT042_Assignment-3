package corporation;
import java.util.Scanner;

public class CorpMain {

    Scanner scanner = new Scanner(System.in);

    public String readInput(String userMessage){
        System.out.println(userMessage);
        String userInput = scanner.nextLine();

        return userInput;
    }

}