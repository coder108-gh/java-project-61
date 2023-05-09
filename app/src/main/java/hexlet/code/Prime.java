package hexlet.code;

import java.util.Scanner;

public class Prime {
    private static final int MAX_VAL = 100000;
    private static final int MAX_NUM = 3;
    public static void play(Scanner scanner) {

        Engine.setIsStringType(true);

        String[] questions = new String[MAX_NUM];
        String[] answers = new String[MAX_NUM];
        for (int i = 0; i < MAX_NUM; i++) {
            int tmp = Utils.getRandom(MAX_VAL);
            questions[i] = Integer.toString(tmp);
            answers[i] = Utils.isPrime(tmp) ? "yes" : "no";
        }
        Engine.setQuestions(questions);
        Engine.setAnswers(answers);

        Engine.showDescription("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        Engine.play(scanner);

    }
}
