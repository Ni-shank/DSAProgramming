import java.util.HashMap;
import java.util.Map;

public class CharacterFrequency {

    public static void main(String[] args) {

            String str = "hello";

            Map<Character, Integer> map = new HashMap<>();

            for (char ch : str.toCharArray()) {

                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }

            System.out.println("Input: " + str);
            System.out.println("Frequency: " + map);
    }
}