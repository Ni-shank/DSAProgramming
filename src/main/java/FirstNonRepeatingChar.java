import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingChar {

    public static void main(String[] args) {

        String str = "Swiss".toLowerCase();

        Map<Character, Integer> map = new HashMap<>();

        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        char result = '\0';

        for (char ch : str.toCharArray()) {
            if (map.get(ch) == 1) {
                result = ch;
                break;
            }
        }

        System.out.println("Input: " + str);
        System.out.println("Output: " + result);
    }
}
