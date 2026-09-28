import java.util.Arrays;

public class RotateArray {
    static void reverse(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        k %= arr.length;

        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);

        System.out.println("Input: [1, 2, 3, 4, 5, 6, 7]");
        System.out.println("k: " + k);
        System.out.println("Output: " + Arrays.toString(arr));
    }
}
