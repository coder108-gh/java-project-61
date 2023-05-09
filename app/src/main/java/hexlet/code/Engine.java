package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static boolean isStringType;
    public static String userName;
    public static String[] questions;
    public static String[] answers;
    public static int[] answersInt;

    public static void showDescription(String descr) {
        System.out.println(descr);
    }

    public static void showQuestion(String question) {
        System.out.println(String.format("Question: %s",question));
        System.out.print("Your answer: ");
    }

    public static boolean checkAnswer(Scanner scanner, int numAttempt) {
        boolean isCorrect = false;
        String correctStrAns;
        String answer = scanner.nextLine();

        if (isStringType) {
            correctStrAns= answers[numAttempt];
            isCorrect = answer.equalsIgnoreCase(correctStrAns);

        } else {
            int correctIntAns = answersInt[numAttempt];
            int answerInt = Integer.parseInt(answer);
            isCorrect = (answerInt==correctIntAns);
            correctStrAns = Integer.toString(correctIntAns);
        }

        if (isCorrect) {
            System.out.println("Correct!");
        } else {
            System.out.println (String.format("'%s' is wrong answer ;(. Correct answer was '%s.'", answer, correctStrAns));
            System.out.println(String.format("Let's try again, %s!", userName));
        }

        return isCorrect;
    }

    public static void showCongratulations() {
        System.out.println(String.format("Congratulations, %s!", userName));
    }


    public static void play (Scanner scanner) {
        int numberOfAttempts = questions.length;
        for (int i = 0; i < numberOfAttempts; i++) {
            showQuestion(questions[i]);
            if (!checkAnswer(scanner,i)) {
                return;
            }
        }
        showCongratulations();
    }

}




