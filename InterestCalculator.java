import java.util.Scanner;

public class CompoundInterestCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principal amount (P): ");
        double principal = sc.nextDouble();
        System.out.print("Enter annual interest rate (in percentage): ");
        double rate = sc.nextDouble() / 100;
        System.out.print("Enter time in years (t): ");
        int time = sc.nextInt();
        System.out.print("Enter number of times interest is compounded per year (n): ");
        int n = sc.nextInt();
        double amount = principal * Math.pow((1 + rate / n), n * time);
        double compoundInterest = amount - principal;
        System.out.println("Amount (A) after " + time + " years: " + amount);
        System.out.println("Compound Interest (CI): " + compoundInterest);
    }
}
