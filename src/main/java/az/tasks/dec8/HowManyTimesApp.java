package az.tasks.dec8;
import java.util.Scanner;


public class HowManyTimesApp{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;

        while (n > 0) {
            n -= sumOfDigits(n);
            count++;
        }

        System.out.println(count);
    }

    private static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}

