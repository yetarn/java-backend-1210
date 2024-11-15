package az.tasks.nov14;

import java.util.Random;
import java.util.Scanner;

public class SquareShootGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        char[][] board = new char[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                board[i][j] = '-';
            }
        }
        int targetRow = random.nextInt(5);
        int targetCol = random.nextInt(5);

        System.out.println("All set. Get ready to rumble!");

        while (true) {
            int row = getUserInput(scanner, "Enter the row (1-5):") - 1;
            int col = getUserInput(scanner, "Enter the column (1-5):") - 1;

            if (board[row][col] == '*') {
                System.out.println("You already shot here. Try again!");
                continue;
            }
            board[row][col] = '*';

            if (row == targetRow && col == targetCol) {
                board[row][col] = 'x';
                displayBoard(board);
                System.out.println("You have won!");
                break;
            }
            displayBoard(board);
        }
    }

    private static int getUserInput(Scanner scanner, String prompt) {
        int input ;
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                input = scanner.nextInt();
                if (input >= 1 && input <= 5) {
                    break;
                }
            } else {
                scanner.next();
            }
            System.out.println("Invalid input. Please enter a number between 1 and 5.");
        }
        return input;
    }

    private static void displayBoard(char[][] board) {
        System.out.print("  ");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < 5; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
