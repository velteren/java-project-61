package hexlet.code;

import java.util.Scanner;

public class Even {
    public static void StartGame() {
        String name = Cli.askName();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        boolean isCorrect = true;
        int tries = 3;
        while (tries > 0 && isCorrect) {
            int number = (int) (Math.random() * 100);
            System.out.println("Question: " + number);
            String correctAnswer = (number % 2 == 0) ? "yes" : "no";
            System.out.print("Your answer: ");
            String userAnswer = scanner.next();
            isCorrect = correctAnswer.equals(userAnswer);
            if (isCorrect) {
                System.out.println("Correct!");
            } else {
                tries = 0;
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
                System.out.println("Let's try again, " + name + "!");
            }
            tries -= 1;
        }
        if (isCorrect) {
            System.out.println("Congratulations, " + name + "!");
        }
    }
}
