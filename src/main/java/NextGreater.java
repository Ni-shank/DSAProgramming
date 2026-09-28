import java.util.Arrays;
import java.util.Stack;

public class NextGreater {
    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 10, 8};

        int[] result = new int[arr.length];
        Arrays.fill(result, -1);

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() &&
                    arr[i] > arr[stack.peek()]) {

                int index = stack.pop();
                result[index] = arr[i];
            }

            stack.push(i);
        }

        System.out.println("Input: " + Arrays.toString(arr));
        System.out.println("Output: " + Arrays.toString(result));
    }
}
