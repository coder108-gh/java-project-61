package hexlet.code;

import java.util.Scanner;

public class Progression {

        private static final int MAX_NUM = 3;
        private static final int MIN_COUNT = 5;
        private static final int MAX_COUNT = 10;
        private static final int MAX_DELTA = 5;
        private static final int MAX_START_VALUE = 7;

        public static void play(Scanner scanner) {

                String[] questions = new String[MAX_NUM];
                int[] answers = new int[MAX_NUM];

                for (int i = 0; i < MAX_NUM; i++) {

                        int delta = Utils.getRandom(MAX_DELTA)+1;
                        int count = MAX_COUNT - Utils.getRandom(MIN_COUNT);
                        int hiddenPos = Utils.getRandom(count-2) + 1;

                        int[] progression = Utils.getProgression(Utils.getRandom(MAX_START_VALUE), delta, count);
                        String[] tmp = new String[progression.length];
                        for (int ind = 0; ind < progression.length; ind++) {
                                if (ind == hiddenPos) {
                                        tmp[ind] = ".." ;
                                } else {
                                        tmp[ind] = Integer.toString(progression[ind]);
                                }
                        }
                        answers[i] = progression[hiddenPos];
                        questions[i]  = String.join(" ", tmp);

                }
                Engine.questions = questions;
                Engine.answersInt = answers;
                Engine.isStringType = false;

                Engine.showDescription("What number is missing in the progression?");
                Engine.play(scanner);

        }

}
