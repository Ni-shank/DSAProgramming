/*
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindDuplicates {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 2, 4, 5, 3, 6};

        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int n : arr) {

            if (!seen.add(n)) {
                duplicates.add(n);
            }
        }

        System.out.println(
                "Input: " + Arrays.toString(arr));

        System.out.println(
                "Duplicates: " + duplicates);
    }
}

*/



import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindDuplicates {

    public static void main(String[] args) {

        Integer[] numbers = {10, 20, 30, 20, 40, 10, 50, 30};

        Arrays.stream(numbers)
                .filter(n -> Collections.frequency(List.of(numbers), n) > 1)
                .distinct()
                .forEach(System.out::println);


    }
}
