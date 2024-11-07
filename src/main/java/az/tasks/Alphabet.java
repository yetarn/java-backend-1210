package az.tasks;

public class Alphabet {
    public static void main(String[] args) {
        System.out.println("Uppercase Letters:");
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print(ch + " ");
        }

        System.out.println("\n Lowercase Letters:");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.print(ch + " ");
        }
    }
}
