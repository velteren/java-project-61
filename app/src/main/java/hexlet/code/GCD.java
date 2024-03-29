package hexlet.code;

import java.util.Scanner;

public class GCD {
    public static void startGame() {
        String name = Cli.askName();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Find the greatest common divisor of given numbers.");
        boolean isCorrect = true;
        int tries = App.NUMBER_OF_TRIES;
        while (tries > 0 && isCorrect) {
            int firstOperand = (int) (Math.random() * App.HUNDRED);
            int secondOperand = (int) (Math.random() * App.HUNDRED);
            System.out.println("Question: " + firstOperand + " " + secondOperand);
            String correctAnswer = String.valueOf(gcd(firstOperand, secondOperand));
            System.out.print("Your answer: ");
            String userAnswer = scanner.next();
            isCorrect = correctAnswer.equals(userAnswer);
            if (isCorrect) {
                System.out.println("Correct!");
            } else {
                tries = 0;
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '"
                        + correctAnswer + "'.");
                System.out.println("Let's try again, " + name + "!");
            }
            tries -= 1;
        }
        if (isCorrect) {
            System.out.println("Congratulations, " + name + "!");
        }
    }
    public static int gcd(int a, int b) {
        if (b == 0)  {
            return a;
        }
        return gcd(b, a % b);
    }
}
