package com.pkh.kuybisindo;

public class QuestionLibrary {
    public static int[] mImageView = new int[] {
            R.drawable.s_quiz, R.drawable.k_quiz, R.drawable.i_quiz
    };

    public static String[] mQuestions = new String[] {
            "Bahasa isyarat ini menunjukkan huruf?",
            "Bahasa isyarat ini menunjukkan huruf?",
            "Bahasa isyarat ini menunjukkan huruf?"
    };

    public static String[][] mChoices = new String[][] {
            {"S", "C", "D"},
            {"P", "K", "A"},
            {"T", "I", "L"}
    };

    public static String[] mCorrectAnswers = new String[] {"S", "K", "I"};

    public String getQuestion(int a) {
        String question = mQuestions[a];
        return question;
    }

    public String getChoice1(int a) {
        String choice0 = mChoices[a][0];
        return choice0;
    }

    public String getChoice2(int a) {
        String choice1 = mChoices[a][1];
        return choice1;
    }

    public String getChoice3(int a) {
        String choice2 = mChoices[a][2];
        return choice2;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }
}
