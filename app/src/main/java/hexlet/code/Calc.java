package hexlet.code;

import java.util.Scanner;

public class Calc {

    private static final int MAX_NUM = 3;
    private static final int MAX_VAL = 100;

    private static final char[] operations = {'+', '-', '*'};


    public static void play(Scanner scanner) {



        String[] questions = new String[MAX_NUM];
        int[] answers = new int[MAX_NUM];
        for (int i = 0; i < MAX_NUM; i++) {
            int operatorNumber = Utils.getRandom(3);
            int operand1 = Utils.getRandom(MAX_VAL);
            int operand2 = Utils.getRandom(MAX_VAL);
            int correctVal;
            switch(operatorNumber) {
                case 1:
                    correctVal = operand1 - operand2;
                    break;
                case 2:
                    correctVal = operand1 * operand2;
                    break;
                default:
                    correctVal = operand1 + operand2;
            }
            questions[i] = String.format("%d %c %d ", operand1, operations[operatorNumber], operand2);
            answers[i] = correctVal;

        }
        Engine.questions = questions;
        Engine.answersInt = answers;
        Engine.isStringType = false;

        Engine.showDescription("What is the result of the expression?");
        Engine.play(scanner);

    }




}
