package hexlet.code;

import java.util.Scanner;

public class Gcd {

    private static final int MAX_NUM = 3;
    private static final int MAX_VAL = 100;

    public static void play(Scanner scanner) {

        String[] questions = new String[MAX_NUM];
        int[] answers = new int[MAX_NUM];
        for (int i = 0; i < MAX_NUM; i++) {
            int operand1 = Utils.getRandom(MAX_VAL);
            int operand2 = Utils.getRandom(MAX_VAL);

            int correctVal = Utils.gcd(operand1, operand2);

            questions[i] = String.format("%d %d ", operand1, operand2);
            answers[i] = correctVal;

        }
        Engine.setQuestions(questions);
        Engine.setAnswersInt(answers);
        Engine.setIsStringType(false);

        Engine.showDescription("Find the greatest common divisor of given numbers.");
        Engine.play(scanner);

    }

}
