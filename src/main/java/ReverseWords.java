public class ReverseWords {

    public static void main(String[] args) {

        String str = "Hello world";

        String[] words = str.split(" ");

        StringBuilder result =
                new StringBuilder();

        for (String word : words) {

            result.append(
                    new StringBuilder(word).reverse()
            ).append(" ");
        }

        System.out.println("Input: " + str);
        System.out.println(
                "Output: " + result.toString().trim()
        );
    }
}