package az.tasks.weeklytasks1;
import java.util.Scanner;

public class Task2  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input digits: ");
        int n= scanner.nextInt();
        int m= String.valueOf(n).length();
        System.out.println("The number of digits is: " + m);
}
}
