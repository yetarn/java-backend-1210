package az.eolymptasks.firstorlast;

import java.util.Scanner;

public class FirstOrLastApp {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println ("Write 3 digit number");
        int num = scanner.nextInt();
        if(num/100 > num%10)
        {
            System.out.println("Bigger digit is" + num / 100);
        } else if (num/100 < num%10){
            System.out.println("Bigger digit is" + num %10);
        }
        else {
            System.out.println("Digits are equal");
        }
    }
}
