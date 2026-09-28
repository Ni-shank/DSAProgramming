import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;

        Map<Integer, Integer> map = new HashMap<>();
        int[] result = {-1, -1};

        for (int i = 0; i < arr.length; i++) {
            int required = target - arr[i];

            if (map.containsKey(required)) {
                result[0] = map.get(required);
                result[1] = i;
                break;
            }

            map.put(arr[i], i);
        }

        System.out.println("Input: " + Arrays.toString(arr));
        System.out.println("Target: " + target);
        System.out.println("Indexes: " + Arrays.toString(result));
    }
}
