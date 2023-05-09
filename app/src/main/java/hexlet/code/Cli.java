package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static String logon(Scanner scanner) {

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.nextLine();
        return  userName;

    }
    public static void greet (String userName) {
        System.out.println(String.format("Hello, %s!", userName));
    }
}
