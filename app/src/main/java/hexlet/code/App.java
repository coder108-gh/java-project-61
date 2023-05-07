package hexlet.code;

import java.util.Scanner;

public class App {
    private final static int GREET = 1;
    private final static int EVEN = 2;

    private final static int CALC = 3;
    private final static int EXIT = 0;
    private final static String[] terms = {"Exit", "Greet", "Even", "Calc"};
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        while (true) {
            choice = getChoice(scanner);
            if (choice <= EXIT) {
                break;
            }
            startGame(choice, scanner);
        }
       scanner.close();
    }

    public static int getChoice(Scanner scanner) {

        System.out.println("Please enter the game number and press Enter.");
        for (int i = 1; i< terms.length; i++) {
            System.out.printf("%d - %s", i, terms[i]);
            System.out.println();
        }
        System.out.printf("%d - %s", 0, terms[0]);
        System.out.println();
        System.out.print("Your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        System.out.println();
        return  choice;
    }
    public static void startGame(int choice, Scanner scanner) {
        String userName = Cli.logon(scanner);
        Cli.greet(userName);
        Engine.userName = userName;
        switch (choice) {
            case GREET:
                break;
            case EVEN:
                Even.play(scanner);
                break;
            case CALC:
                Calc.play(scanner);
                break;
            default:
                System.out.println("Incorrect choice. Try again");
        }
    }
}
