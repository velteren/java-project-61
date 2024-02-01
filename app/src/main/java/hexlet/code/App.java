package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        Scanner scaner = new Scanner(System.in);
        String gameNumber = scaner.next();
        switch (gameNumber) {
            case "1":
                Cli.askName();
                break;
            case "2":
                Even.StartGame();
                break;
            case "0":
                break;
        }
    }
}
