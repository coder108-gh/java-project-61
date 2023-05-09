package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static boolean isStringType;
    private static String userName;
    private static String[] questions;
    private static String[] answers;
    private static int[] answersInt;

    public static void setIsStringType(boolean isString) {
        Engine.isStringType = isString;
    }
    public static boolean getIsStringType() {
        return Engine.isStringType;
    }
    public static void setUserName(String user) {
        Engine.userName = user;
    }
    public static String getUserName() {
        return Engine.userName;
    }

    public static void setQuestions(String[] quest) {
        Engine.questions = quest;
    }
    public static void setAnswers(String[] answersL) {
        Engine.answers = answersL;
    }
    public static void setAnswersInt(int[] answersIntL) {
        Engine.answersInt = answersIntL;
    }
    public static String[] getQuestions() {
        return Engine.questions;
    }
    public static String[] getAnswers() {
        return Engine.answers;
    }
    public static int[] getAnswersInt() {
        return  Engine.answersInt;
    }

    public static void showDescription(String descr) {
        System.out.println(descr);
    }

    public static void showQuestion(String question) {
        System.out.println(String.format("Question: %s", question));
        System.out.print("Your answer: ");
    }

    public static boolean checkAnswer(Scanner scanner, int numAttempt) {
        boolean isCorrect = false;
        String correctStrAns;
        String answer = scanner.nextLine();

        if (isStringType) {
            correctStrAns =  answers[numAttempt];
            isCorrect = answer.equalsIgnoreCase(correctStrAns);

        } else {
            int correctIntAns = answersInt[numAttempt];
            int answerInt = Integer.parseInt(answer);
            isCorrect = (answerInt == correctIntAns);
            correctStrAns = Integer.toString(correctIntAns);
        }

        if (isCorrect) {
            System.out.println("Correct!");
        } else {
            System.out.println(
                    String.format("'%s' is wrong answer ;(. Correct answer was '%s.'", answer, correctStrAns)
            );
            System.out.println(String.format("Let's try again, %s!", userName));
        }

        return isCorrect;
    }

    public static void showCongratulations() {
        System.out.println(String.format("Congratulations, %s!", userName));
    }


    public static void play(Scanner scanner) {
        int numberOfAttempts = questions.length;
        for (int i = 0; i < numberOfAttempts; i++) {
            showQuestion(questions[i]);
            if (!checkAnswer(scanner, i)) {
                return;
            }
        }
        showCongratulations();
    }

}
