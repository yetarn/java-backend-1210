package az.eolymptasks;

import java.util.Scanner;

public class thebank {
    public static void main(String[] args){
         Scanner scanner = new Scanner (System.in);
         System.out.println("Write the amount of Buratino's money, for calculating his age: ");
                long S = scanner.nextLong();
                long totalmoney = 1;
                long givenmoney = 1;
                int birthday = 0;

                while(totalmoney < S){
                    birthday++;
                    givenmoney = 2 * givenmoney + birthday;
                    totalmoney =+givenmoney;
                }
                System.out.println("He will be: " +birthday);


    }
}
