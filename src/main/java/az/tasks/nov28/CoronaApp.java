package az.tasks.nov28;

import java.util.Scanner;

public class CoronaApp {
    public static void main (String[] args){
        Scanner scanner= new Scanner (System.in);
        System.out.println("Give 3 numbers from observations: " );
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();

        String result = checkCovid(a, b, c);
        System.out.println(result);
    }

    public static String checkCovid(int a, int b, int c) {
        String[] expressions = {
                a + "+" + b + "+" + c,
                a + "+" + b + "-" + c,
                a + "-" + b + "+" + c,
                a + "-" + b + "-" + c,
                "-" + a + "+" + b + "+" + c,
                "-" + a + "+" + b + "-" + c,
                "-" + a + "-" + b + "+" + c,
                "-" + a + "-" + b + "-" + c
        };

        int[] results = new int[] {
                a + b + c,
                a + b - c,
                a - b + c,
                a - b - c,
                -a + b + c,
                -a + b - c,
                -a - b + c,
                -a - b - c
        };

        for (int i = 0; i < results.length; i++) {
            if (results[i] == 2020) {
                return expressions[i];
            }
        }

        return "CORONA";
    }
}


