package az.eolymptasks.sumofdigits;

import java.util.Scanner;

public class SumofDigitsApp {
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter 4 digit number: ");
            int number = scanner.nextInt();
            int sum = number/1000 + number%10;
            System.out.println(sum);
        }
    }

