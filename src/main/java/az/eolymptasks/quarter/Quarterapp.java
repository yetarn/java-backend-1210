package az.eolymptasks.quarter;

import java.util.Scanner;

public class Quarterapp {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if (1<= num && num<=3){
            System.out.println("First");
        } else if (4<=num && num<=6) {
            System.out.println("Second");
        } else if (7<=num && num<=9) {
            System.out.println("Third");
        } else if (10<=num && num<=12) {
            System.out.println("Fourth");
        }else {
            System.out.println("Take number from 1 to 12");
        }
    }
}

