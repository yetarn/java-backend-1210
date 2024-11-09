package az.tasks;

import java.util.Scanner;

public class ReverseWord {
        public static void main (String [] args){
            Scanner scanner=new Scanner (System.in);
            System.out.println ("Enter any word:");
            String word=scanner.nextLine ();
            if (word.length()>0){
                StringBuilder reverseword=new StringBuilder(word);
                reverseword.reverse();
                String uppercasereverseword=reverseword.toString().toUpperCase();
                System.out.println ("Reversed and uppercased word:"+ uppercasereverseword);
            } else {
                System.out.println ("No word");
            }
        }
    }

