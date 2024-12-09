package az.tasks.dec8;
import java.util.Scanner;

public class YesNoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        boolean isDivisibleBy3 = (n % 3 == 0);

        boolean isEvenAndTwoDigit = (n % 2 == 0 && n >= 10 && n <= 99);

        if (isDivisibleBy3 && isEvenAndTwoDigit) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

