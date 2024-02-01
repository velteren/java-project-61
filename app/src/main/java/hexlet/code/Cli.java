package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static final String askName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nWelcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = scanner.next();
        System.out.println("Hello, " + name + "!");
        return name;
    }
}
