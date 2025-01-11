package az.turingacademy;

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ages = new int[50];
        int count = 0;

        System.out.println("Enter ages (type 'stop' or 'exit' to stop):");

        while (true) {
            if (count >= 50) {
                System.out.println("You can enter a maximum of 50 ages.");
                break;
            }

            System.out.print("Enter age: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("stop") || input.equalsIgnoreCase("exit")) {
                break;
            }

            try {
                int age = Integer.parseInt(input);

                if (age < 0) {
                    throw new IllegalArgumentException("Age cannot be negative.");
                }
                if (age > 200) {
                    throw new ArithmeticException("Age is too large.");
                }

                ages[count] = age;
                count++;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid number.");
            } catch (IllegalArgumentException | ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        }

        if (count == 0) {
            System.out.println("No ages were entered.");
        } else {
            System.out.println("Entered ages:");
            for (int i = 0; i < count; i++) {
                System.out.print(ages[i] + " ");
            }
            System.out.println();
            processAges(ages, count);
        }
    }

    private static void processAges(int[] ages, int count) {
        int sum = 0;
        int children = 0, teenagers = 0, adults = 0, seniors = 0;

        System.out.println("Detailed information for each age:");
        for (int i = 0; i < count; i++) {
            int age = ages[i];

            String factorialResult;
            try {
                factorialResult = calculateFactorial(age);
            } catch (ArithmeticException e) {
                factorialResult = "Factorial is too large.";
            }

            String evenOdd = isEven(age) ? "Even" : "Odd";

            if (age <= 12) {
                children++;
            } else if (age <= 19) {
                teenagers++;
            } else if (age <= 64) {
                adults++;
            } else {
                seniors++;
            }

            System.out.printf("- Age: %d -> Factorial: %s, %s.\n", age, factorialResult, evenOdd);
            sum += age;
        }

        double average = (double) sum / count;

        System.out.println("\nStatistical Summary:");
        System.out.println("- Total number of people: " + count);
        System.out.println("- Sum of ages: " + sum);
        System.out.printf("- Average age: %.2f\n", average);
        System.out.println("- Age Group Statistics:");
        System.out.println("  * Children: " + children + " people");
        System.out.println("  * Teenagers: " + teenagers + " people");
        System.out.println("  * Adults: " + adults + " people");
        System.out.println("  * Seniors: " + seniors + " people");
    }

    private static String calculateFactorial(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Negative numbers do not have a factorial.");
        }

        long factorial = 1;
        for (int i = 1; i <= age; i++) {
            factorial *= i;
            if (factorial < 0) {
                throw new ArithmeticException("Factorial is too large.");
            }
        }
        return String.valueOf(factorial);
    }

    private static boolean isEven(int age) {
        return age % 2 == 0;
    }
}
