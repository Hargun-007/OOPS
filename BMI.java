import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight, height, bmi;
        System.out.print("Enter your weight in kilograms: ");
        weight = sc.nextDouble();
        System.out.print("Enter your height in meters: ");
        height = sc.nextDouble();

        bmi = weight / (height * height);

        System.out.println("Your BMI is: " + bmi);
    }
}
