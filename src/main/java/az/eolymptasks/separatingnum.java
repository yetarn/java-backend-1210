package az.eolymptasks;

import java.util.Scanner;

public class separatingnum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number" );
        int number = in.nextInt();
        System.out.printf("%d %d\n", number/10, number%10);
    }
}
