import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] currencies = { "USD", "EUR", "INR", "JPY" };
        double[][] rates = {
                { 1.0, 0.85, 74.85, 110.0 }, // USD to [USD, EUR, INR, JPY]
                { 1.18, 1.0, 88.0, 129.53 }, // EUR to ...
                { 0.013, 0.011, 1.0, 1.47 }, // INR to ...
                { 0.0091, 0.0077, 0.68, 1.0 } // JPY to ...
        };

        System.out.println("Available currencies: ");
        for (int i = 0; i < currencies.length; i++) {
            System.out.println((i + 1) + ". " + currencies[i]);
        }

        System.out.print("Choose source currency (1-4): ");
        int from = sc.nextInt() - 1;

        System.out.print("Choose target currency (1-4): ");
        int to = sc.nextInt() - 1;

        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();

        double converted = amount * rates[from][to];
        System.out.println(amount + " " + currencies[from] + " = " + converted + " " + currencies[to]);
    }
}
