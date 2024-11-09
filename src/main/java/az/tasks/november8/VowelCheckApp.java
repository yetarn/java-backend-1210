package az.tasks.november8;

import java.util.Scanner;

    public class VowelCheckApp {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a word: ");
            String word = scanner.next();
            String lastCharacter = word.substring(word.length() - 1).toLowerCase();

            if ("aeiou".contains(lastCharacter)) {
                System.out.println("The last character is a vowel.");
            } else {
                System.out.println("The last character is not a vowel.");
            }

            scanner.close();
        }
    }