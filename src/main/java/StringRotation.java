public class StringRotation {
    public static void main(String[] args) {
        String a = "ABCD";
        String b = "CDAB";

        boolean result =
                a.length() == b.length() &&
                (a + a).contains(b);

        System.out.println("A: " + a);
        System.out.println("B: " + b);
        System.out.println("Is rotation: " + result);
    }
}
