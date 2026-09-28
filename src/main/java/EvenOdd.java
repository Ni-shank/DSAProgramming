import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


 /*public class EvenOdd {

   public static void main(String[] args) {

        List<Integer> numbers =
                Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        Map<Boolean, List<Integer>> result =
                numbers.stream()
                        .collect(Collectors.partitioningBy(
                                n -> n % 2 == 0
                        ));

        System.out.println("Input: " + numbers);
        System.out.println("Even: " + result.get(true));
        System.out.println("Odd: " + result.get(false));
    }
}
*/



//Using Multithreading

public class EvenOdd {

    private int number = 1;
    private final int max = 10;

    private boolean oddTurn = true;

    public synchronized void printOdd() throws InterruptedException {

        while (number <= max) {

            while (!oddTurn) {
                wait();
            }

            if (number <= max) {
                System.out.println("Odd Thread : " + number);
                Thread.sleep(1000);

                number++;
                oddTurn = false;

                notifyAll();
            }
        }
    }

    public synchronized void printEven() throws InterruptedException {

        while (number <= max) {

            while (oddTurn) {
                wait();
            }

            if (number <= max) {
                System.out.println("Even Thread : " + number);
                Thread.sleep(1000);

                number++;
                oddTurn = true;

                notifyAll();
            }
        }
    }

    public static void main(String[] args) {

        EvenOdd obj = new EvenOdd();

        Thread oddThread = new Thread(() -> {
            try {
                obj.printOdd();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread evenThread = new Thread(() -> {
            try {
                obj.printEven();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        oddThread.start();
        evenThread.start();
    }
}