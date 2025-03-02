package az.turingacademy;
import java.util.stream.IntStream;
import java.util.List;

public class SquareOfNum {
    public static void main(String[] args) {
        List<Integer> squares = IntStream.rangeClosed(1, 1000).filter(x -> x % 3 == 0 && x % 5 == 0).map(x -> x * x).boxed().toList();
        System.out.println(squares);
    }
}
