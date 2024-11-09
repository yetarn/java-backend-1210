package az.eolymptasks.mediannumapp;

import java.util.Scanner;

public class MedianNumApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int median;

        if ((a > b && a < c) || (a > c && a < b)) {
            median = a;
        } else if ((b > a && b < c) || (b > c && b < a)) {
            median = b;
        } else {
            median = c;
        }

        System.out.println(median);

        scanner.close();
    }
}

