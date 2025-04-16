import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean playing = true;

        System.out.println("Welcome to the Text Adventure Game!");
        System.out.println("You are in a dark forest. What do you do?");
        System.out.println("1. Look around");
        System.out.println("2. Walk forward");
        System.out.println("3. Quit");

        while (playing) {
            System.err.println("> ");
            String input = scanner.nextLine();

            switch (input) {
                case "1":
                    System.out.println("You see trees, fog, and hear distant howls.");
                    playing = false;
                    break;
                case "2":
                    System.out.println("You walk forward and fall into a pit. Oops.");
                    playing = false;
                    break;
                case "3":
                    System.out.println("Goodbye adventurer!");
                    playing = false;
                default:
                    System.out.println("Invalid choice. Try 1, 2, or 3.");
            }
        }
        scanner.close();
    }
}