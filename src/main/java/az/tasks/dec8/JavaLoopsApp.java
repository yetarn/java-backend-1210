package az.tasks.dec8;
import java.util.Scanner;

public class JavaLoopsApp {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNextInt()) {
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();

            int sum = a;
            int powerOfTwo = 1;

            for (int i = 0; i < n; i++) {
                sum += powerOfTwo * b;
                System.out.print(sum + " ");
                powerOfTwo *= 2;
            }
            System.out.println();
        }
    }
}


