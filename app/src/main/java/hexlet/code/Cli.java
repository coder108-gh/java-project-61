package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void Logon() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println(String.format("Hello, %s",userName));
        scanner.close();
    }
}