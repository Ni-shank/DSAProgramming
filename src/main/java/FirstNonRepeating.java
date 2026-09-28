

//1st Approach
/*
public class FirstNonRepeating {

    public static Character firstNonRepeating(String str) {
        String lower = str.toLowerCase();
        for (int i = 0; i < lower.length(); i++) {

            int count = 0;

            for (int j = 0; j < lower.length(); j++) {

                if (lower.charAt(i) == lower.charAt(j)) {
                    count++;
                }
            }

            if (count == 1) {
                return lower.charAt(i);
            }
        }

        return null;
    }

    public static void main(String[] args) {

        String str = "Swiss";

        Character result = firstNonRepeating(str);

        System.out.println(result);
    }
}
*/




//Optimized one


import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeating {

    public static Character firstNonRepeating(String str) {
       // String lower = str.toLowerCase();

        Map<Character, Integer> frequencyMap = new HashMap<>();

        // Step 1: Count frequency
        for (char ch : str.toLowerCase().toCharArray()) {

            frequencyMap.put(
                    ch,
                    frequencyMap.getOrDefault(ch, 0) + 1
            );
        }

        // Step 2: Find first character with frequency 1
        for (char ch : str.toLowerCase().toCharArray()) {

            if (frequencyMap.get(ch) == 1) {
                return ch;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        String str = "Swiss";

        Character result = firstNonRepeating(str);

        System.out.println(result);
    }
}