import java.util.*;

public class UpperBoundExample {

    public static void printNumbers(List<? extends Number> list) {
        for (Number num : list) {
            System.out.println(num);
        }

        // list.add(10); // Compile-time error
    }

    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(10, 20, 30);
        List<Double> doubles = Arrays.asList(1.5, 2.5, 3.5);

        printNumbers(integers);
        printNumbers(doubles);
    }
}