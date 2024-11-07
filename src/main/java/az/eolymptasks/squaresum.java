package az.eolymptasks;

import java.util.Scanner;

public class squaresum {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter 2 numbers: ");
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            int num3 = num1 * num1 + num2 * num2;
            if (num1 > 1_000_000_000 || num2 > 1_000_000_000) {
                System.out.println("The number should be less than 10^9");
            } else {
                System.out.println(num3);
            }
        }
}
