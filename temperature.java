import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature value: ");
        double temperature = sc.nextDouble();
        System.out.print("Enter the unit of the temperature (C/F/K): ");
        char unit = sc.next().charAt(0);

        switch (unit) {
            case 'C':
            case 'c':
                double fahrenheit = (temperature * 9 / 5) + 32;
                double kelvin = temperature + 273.15;
                System.out.printf("%.2f°C is %.2f°F and %.2fK\n", temperature, fahrenheit, kelvin);
                break;
            case 'F':
            case 'f':
                double celsius = (temperature - 32) * 5 / 9;
                kelvin = celsius + 273.15;
                System.out.printf("%.2f°F is %.2f°C and %.2fK\n", temperature, celsius, kelvin);
                break;
            case 'K':
            case 'k':
                celsius = temperature - 273.15;
                fahrenheit = (celsius * 9 / 5) + 32;
                System.out.printf("%.2fK is %.2f°C and %.2f°F\n", temperature, celsius, fahrenheit);
                break;
            default:
                System.out.println("Invalid unit entered.");
        }
    }
}
