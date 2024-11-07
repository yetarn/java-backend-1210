package az.eolymptasks;

import java.util.Scanner;

public class sumofdigits {
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter 4 digit number: ");
            int number = scanner.nextInt();
            int sum = number/1000 + number%10;
            System.out.println(sum);
        }
    }

