import java.util.Scanner;

public class Calculation {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a, b, add, sub, mul;
        float div;
        System.out.print("Enter first number: ");
        a = sc.nextInt();
        System.out.print("Enter second number: ");
        b = sc.nextInt();

        add = a + b;
        sub = a - b;
        mul = a * b;
        div = (float) a / b;

        System.out.println("Addition = " + add);
        System.out.println("Subtraction = " + sub);
        System.out.println("Multiplication = " + mul);
        System.out.println("Division = " + div);
    }
}
