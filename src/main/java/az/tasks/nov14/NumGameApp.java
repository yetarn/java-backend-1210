package az.tasks.nov14;
import java.util.Random;
import java.util.Scanner;

public class NumGameApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(101);

        System.out.println("Let the game begin!");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        int[] guesses = new int[100];
        int guessCount = 0;

        while (true) {
            System.out.print("Enter a number: ");

            while (!scanner.hasNextInt()) {
                System.out.print("Invalid input. Please enter a number: ");
                scanner.next();
            }

            int userGuess = scanner.nextInt();
            guesses[guessCount++] = userGuess;

            if (userGuess < randomNumber) {
                System.out.println("Your number is too small. Please, try again...");
            } else if (userGuess > randomNumber) {
                System.out.println("Your number is too big. Please, try again...");
            } else {
                System.out.println("Congratulations, " + name + "!");
                break;
            }
        }

        System.out.println("Your numbers:");
        sortArrayDescending(guesses, guessCount);
        for (int i = 0; i < guessCount; i++) {
            System.out.print(guesses[i] + " ");
        }
        System.out.println();
    }

    private static void sortArrayDescending(int[] array, int count) {
        for (int i = 0; i < count - 1; i++) {
            for (int j = i + 1; j < count; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}

