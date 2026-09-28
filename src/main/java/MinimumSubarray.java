public class MinimumSubarray {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 2, 4, 3};
        int target = 7;

        int left = 0;
        int sum = 0;
        int minLength = Integer.MAX_VALUE;

        for (int right = 0; right < arr.length; right++) {
            sum += arr[right];

            while (sum >= target) {
                minLength = Math.min(
                        minLength,
                        right - left + 1
                );

                sum -= arr[left++];
            }
        }

        if (minLength == Integer.MAX_VALUE) {
            minLength = 0;
        }

        System.out.println("Input: [2, 3, 1, 2, 4, 3]");
        System.out.println("Target: " + target);
        System.out.println("Minimum length: " + minLength);
    }
}
