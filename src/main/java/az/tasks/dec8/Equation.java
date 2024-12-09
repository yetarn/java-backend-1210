package az.tasks.dec8;
import java.util.Scanner;

public class Equation {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the value of x: ");
            double x = scanner.nextDouble();

            double numerator1 = power(x, 2) + 3 * x - 4;
            double denominator1 = 2 * x - 3;
            double numerator2 = x + 2;
            double denominator2 = power(x, 2) - 5 * x + 7;

            if (denominator1 == 0 || denominator2 == 0) {
                System.out.println("Division by zero detected. Please enter a valid value for x.");
            } else {
                double y = (numerator1 / denominator1) - (numerator2 / denominator2);
                System.out.printf("The value of y is: %.3f\n", y);
            }
        }

        public static double power(double base, int exponent) {
            double result = 1;
            for (int i = 0; i < exponent; i++) {
                result *= base;
            }
            return result;
        }
    }

