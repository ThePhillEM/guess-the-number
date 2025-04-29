import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //User input
        Scanner scanner = new Scanner(System.in);

        //Defining random function into variable random
        Random random = new Random();

        System.out.println("I'm thinking of a number between 1 and 100. Try to guess it:");

        //Save userinput from string to int using parseInt
        int userGuess = Integer.parseInt(scanner.nextLine());

        int secretNumber = random.nextInt(101); // 0-100 inclusive

        if (userGuess == secretNumber) {
            System.out.println("Correct! The number was " + secretNumber + ".");
        } else {
            System.out.println("Incorrect. The number was " + secretNumber + ".");
        }

        int difference = Math.abs(userGuess - secretNumber);
        System.out.println("The difference between your guess and the number is: " + difference);

        System.out.println("Do you want to know if the difference is ODD or EVEN? (Y/N)");
        String response = scanner.nextLine();

        if (response.equalsIgnoreCase("Y")) {
            String parity = (difference % 2 == 0) ? "even" : "odd";
            System.out.println("The difference is " + parity + ".");
        }

        scanner.close();
    }
}
