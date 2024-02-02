package hexlet.code;

import java.util.Scanner;

public class Progression {

    public static void startGame() {
        String name = Cli.askName();
        Scanner scanner = new Scanner(System.in);
        System.out.println("What number is missing in the progression?");
        boolean isCorrect = true;
        int tries = App.NUMBER_OF_TRIES;
        while (tries > 0 && isCorrect) {
            int emptyIndex = (int) (Math.floor(Math.random() * 9.9));
            int[] arr = new int[10];
            int progressionCoef = (int) (Math.ceil(Math.random() * 10));
            arr[0] = (int) (Math.random() * 10);
            for (int i = 1; i < arr.length; i++) {
                arr[i] = arr[i - 1] + progressionCoef;
            }
            System.out.print("Question:");
            for (int i = 0; i < arr.length; i++) {
                if (i == emptyIndex) {
                    System.out.print(" ..");
                } else {
                    System.out.print(" " + arr[i]);
                }
            }
            System.out.println();
            String correctAnswer = String.valueOf(arr[emptyIndex]);
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
}
