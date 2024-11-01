package az.turingacademy;

import java.util.Scanner;

public class Evenodd {
    public static void main(String[]  args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print ("Enter the number:");
        int number = scanner.nextInt();

        if (number > 0)
        {
            System.out.println("The number is positive");
        } else if (number < 0)
        {
            System.out.println("The number is negative");
        } else {
        System.out.println ("The number is 0");
        }

        if (number % 2 == 0)
        {
            System.out.println("The number is odd");
        }
        else {
            System.out.println("The number is even");
        }
    scanner.close();
    }
}
