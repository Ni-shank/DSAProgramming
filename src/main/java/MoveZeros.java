import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] arr = {2, 3, 0, 1, 0, 1, 2, 0, 6};

        int index = 0;

        for (int n : arr) {
            if (n != 0) {
                arr[index++] = n;
            }
        }

        while (index < arr.length) {
            arr[index++] = 0;
        }

        System.out.println("Input: [2, 3, 0, 1, 0, 1, 2, 0, 6]");
        System.out.println("Output: " + Arrays.toString(arr));
    }
}
