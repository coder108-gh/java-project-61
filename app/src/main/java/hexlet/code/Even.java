package hexlet.code;

import java.util.Scanner;

public class Even {
    private static final int MAX_VAL = 100;
    public static void play(Scanner scanner, String userName) {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        int MAX_NUM = 3;
        int tmp = 0;
        String answer ="";
        String correctAns ="";
        for (int i = 1; i <= MAX_NUM; i++) {
            tmp = getRandom();
            correctAns = tmp % 2 ==0 ? "yes" : "no";
            System.out.printf("Question %d",tmp);
            System.out.println();
            System.out.print("Your answer: ");
            answer = scanner.nextLine();
            if (answer.equalsIgnoreCase(correctAns)) {
                System.out.println("Correct!");
            } else {
                System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s.'", answer, correctAns);
                System.out.println();
                System.out.printf("Let's try again, %s!", userName);
                System.out.println();
                return;
            }
            System.out.printf("Congratulations, %s", userName);
            System.out.println();
        }
    }
    public static int getRandom() {
        return (int)(Math.random() * MAX_VAL);
    }
}



