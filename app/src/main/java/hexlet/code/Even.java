package hexlet.code;

import java.util.Scanner;

public class Even {
    private static final int MAX_VAL = 100;
    private static final int MAX_NUM = 3;
    public static void play(Scanner scanner) {

        Engine.isStringType = true;

        String[] questions = new String[MAX_NUM];
        String[] answers = new String[MAX_NUM];
        for (int i = 0; i < MAX_NUM; i++) {
            int tmp = Utils.getRandom(MAX_VAL);
            questions[i] = Integer.toString(tmp);
            answers[i] =tmp % 2 ==0 ? "yes" : "no";
        }
        Engine.questions = questions;
        Engine.answers = answers;

        Engine.showDescription("Answer 'yes' if the number is even, otherwise answer 'no'.");
        Engine.play(scanner);

    }

}



