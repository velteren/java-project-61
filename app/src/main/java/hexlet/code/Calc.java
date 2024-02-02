package hexlet.code;

import java.util.Scanner;

public class Calc {
    private static final int BOTTOM_BORDER = 33;
    private static final int TOP_BORDER = 66;
    public static final String TASK_MESSAGE = "What is the result of the expression?";
    public static void startGame() {
        String name = Cli.askName();
        Scanner scanner = new Scanner(System.in);
        System.out.println(TASK_MESSAGE);
        boolean isCorrect = true;
        int tries = App.NUMBER_OF_TRIES;
        while (tries > 0 && isCorrect) {
            int firstOperand = (int) (Math.random() * App.HUNDRED);
            int secondOperand = (int) (Math.random() * App.HUNDRED);
            int tmpRandomNumber = (int) (Math.random() * App.HUNDRED);
            String operator = (tmpRandomNumber <= BOTTOM_BORDER) ? "+" : (tmpRandomNumber >= TOP_BORDER) ? "*" : "-";
            System.out.println("Question: " + firstOperand + " " + operator + " " + secondOperand);
            String correctAnswer = (operator.equals("+"))
                    ? String.valueOf((firstOperand + secondOperand)) : (operator.equals("-"))
                    ? String.valueOf((firstOperand - secondOperand)) : String.valueOf((firstOperand * secondOperand));
            System.out.print("Your answer: ");
            String userAnswer = scanner.next();
            isCorrect = correctAnswer.equals(userAnswer);
            if (isCorrect) {
                System.out.println("Correct!");
            } else {
                tries = 0;
                System.out.println("'" + userAnswer
                        + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
                System.out.println("Let's try again, " + name + "!");
            }
            tries -= 1;
        }
        if (isCorrect) {
            System.out.println("Congratulations, " + name + "!");
        }
    }
}
