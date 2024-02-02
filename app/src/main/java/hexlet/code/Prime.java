package hexlet.code;

import java.util.Scanner;

public class Prime {
    public static void startGame() {
        String name = Cli.askName();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        boolean isCorrect = true;
        int tries = App.NUMBER_OF_TRIES;
        while (tries > 0 && isCorrect) {
            int firstOperand = (int) (Math.random() * 100);
            System.out.println("Question: " + firstOperand);
            String correctAnswer = (isPrime(firstOperand)) ? "yes" : "no";
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
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
