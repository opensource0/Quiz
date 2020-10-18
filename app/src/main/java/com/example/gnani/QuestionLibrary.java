package com.example.gnani;


public class QuestionLibrary{

    private String mQuestions [] = {
            "All keywords in C are in ____________",
            "Which of the following is not a valid C variable name?",
            " Why do variable names beginning with the underscore is not encouraged?",
            "Variable name resolution (number of significant characters for the uniqueness of variable) depends on ___________"

    };


    private String mChoices [][] = {
            {"LowerCase letters", "UpperCase letters", "CamelCase letters"},
            {"int number;", "float rate;", "int $main;"},
            {"It is not standardized", "To avoid conflicts since assemblers and loaders use such names", "To avoid conflicts since library routines use such names"},
            {"Assemblers and loaders implementations", "Compiler and linker implementations", "C language"}
    };



    private String mCorrectAnswers[] = {"LowerCase letters", "int $main;", "To avoid conflicts since library routines use such names", "Compiler and linker implementations"};




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