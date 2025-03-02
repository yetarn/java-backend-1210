package az.turingacademy;
import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= 20; i++) {
            numbers.add(i);
        }

        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.println(num * 2);
            }
        }

    }
}

