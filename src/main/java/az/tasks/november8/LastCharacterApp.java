package az.tasks.november8;

import java.util.Scanner;

public class LastCharacterApp {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a word: ");
            String word = scanner.next();

            char lastCharacter = word.charAt(word.length() - 1);

            System.out.println("The last character of the entered word is: " + lastCharacter);

            scanner.close();
        }
    }


