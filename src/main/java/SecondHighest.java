import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

/*public class SecondHighest {

    public static void main(String[] args) {

        int[] arr = {10, 5, 20, 8, 20, 15};

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int n : arr) {

            if (n > first) {
                second = first;
                first = n;
            }
            else if (n > second && n != first) {
                second = n;
            }
        }

        System.out.println("Input: " +
                java.util.Arrays.toString(arr));

        System.out.println("Second Highest: " + second);
    }
}*/


import java.util.*;
        import java.util.stream.*;

public class SecondHighest {

    public static void main(String[] args) {

        Integer[] numbers = {
                10, 50, 30, 50, 40, 40
        };

        Integer secondHighest =
                Arrays.stream(numbers)
                        .filter(Objects::nonNull)
                        .distinct()
                        .sorted(Comparator.reverseOrder())
                        .skip(1)
                        .findFirst()
                        .orElse(null);

        System.out.println("Second highest: " + secondHighest);
    }
}