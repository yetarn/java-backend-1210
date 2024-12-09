package az.tasks.dec8;
import java.util.Scanner;

public class SimpleArraySumApp {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Write number of the integers");

        int a=scanner.nextInt();
        int[] arr=new int[a];
        for (int i = 0; i <a; i++) {
            arr[i]=scanner.nextInt();
        }
        int result= Sum(arr);

        System.out.println(result);
    }
    public static int Sum(int[] ar) {
        int sum = 0;
        for (int i = 0; i < ar.length; i++) {
            sum += ar[i];
        }
        return sum;
    }

}

