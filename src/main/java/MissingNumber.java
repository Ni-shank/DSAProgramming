public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {3, 0, 1};

        int xor = arr.length;

        for (int i = 0; i < arr.length; i++) {
            xor ^= i;
            xor ^= arr[i];
        }

        System.out.println("Input: [3, 0, 1]");
        System.out.println("Missing number: " + xor);
    }
}
