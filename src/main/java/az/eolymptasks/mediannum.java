package az.eolymptasks;

import java.util.Scanner;

public class mediannum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1, that is not bigger than 1000: ");
        int number1 = scanner.nextInt();
        System.out.println("Enter number 2, that is not bigger than 1000: ");
        int number2 = scanner.nextInt();
        System.out.println("Enter number 2, that is not bigger than 1000: ");
        int number3 = scanner.nextInt();

        if(number1 >1000 || number2 >1000 || number3 >1000)
        {
            System.out.println("Your number must be less than 1000");
        } else {
            int median;
            if ((number1>=number2 && number1<=number3) || (number1>=number3 && number1<=number2))
            {
                median = number1;
            } else if ((number2>=number1 && number2<=number3) || (number2>=number3 && number2<=number1)){
                median = number2;
            } else {
                median = number3;
            }
           System.out.print ("Median of these 3 numbers is: " + median);
        }
        scanner.close();

    }

}
