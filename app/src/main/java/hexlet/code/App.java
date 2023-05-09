package hexlet.code;

import java.util.Scanner;

public class App {
    private static final  int GREET = 1;
    private static final int EVEN = 2;
    private static final int CALC = 3;
    private static final int GCD = 4;
    private static final int PROGR = 5;
    private static final int PRIME = 6;
    private static final int EXIT = 0;

    private static final String[] terms = {"Exit", "Greet", "Even", "Calc", "GCD", "Progression", "Prime"};
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = getChoice(scanner);
        if (choice > EXIT) {
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
            case GCD:
                Gcd.play(scanner);
                break;
            case PROGR:
                Progression.play(scanner);
                break;
            case PRIME:
                Prime.play(scanner);
                break;
            default:
                System.out.println("Incorrect choice. Try again");
        }
    }
}
