import java.util.*;
import java.util.stream.Collectors;

public class TransactionAggregation {
    static class Transaction {
        String account;
        String type;
        String status;
        double amount;

        Transaction(String account, String type,
                    String status, double amount) {
            this.account = account;
            this.type = type;
            this.status = status;
            this.amount = amount;
        }
    }

    public static void main(String[] args) {
        List<Transaction> list = Arrays.asList(
                new Transaction("A101", "CREDIT", "SUCCESS", 1000),
                new Transaction("A101", "CREDIT", "SUCCESS", 500),
                new Transaction("A101", "CREDIT", "FAILED", 200),
                new Transaction("A102", "CREDIT", "SUCCESS", 700)
        );

        Map<String, Double> result = list.stream()
                .filter(Objects::nonNull)
                .filter(t -> "SUCCESS".equals(t.status))
                .filter(t -> "CREDIT".equals(t.type))
                .collect(Collectors.groupingBy(
                        t -> t.account,
                        LinkedHashMap::new,
                        Collectors.summingDouble(t -> t.amount)
                ));

        System.out.println("Successful credits by account: " + result);
    }
}
