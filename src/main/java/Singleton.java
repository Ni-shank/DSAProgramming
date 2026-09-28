
public class Singleton {

    private static volatile Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
// First Check This avoids synchronization once the object already exists.
        if (instance == null) {

            synchronized (Singleton.class) {
// Second Check This prevents two threads from creating two objects.
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }

        return instance;
    }

    public static void main(String[] args) {

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1);
         System.out.println(s2);
        System.out.println(s1 == s2);
    }
}