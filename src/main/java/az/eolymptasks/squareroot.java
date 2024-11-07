package az.eolymptasks;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class squareroot {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter positive 3 digit number: ");
        long number = scanner.nextLong();
        long a = number/100;
        long b = (number%100)/10;
        long c = number %10;
        long sum = (a^2)+(b^2)+(c^2);
        System.out.printf(" %.3f\n", sqrt(sum));
    }
}
