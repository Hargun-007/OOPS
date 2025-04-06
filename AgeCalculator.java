import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter birth year: ");
        int year = sc.nextInt();
        System.out.print("Enter birth month: ");
        int month = sc.nextInt();
        System.out.print("Enter birth day: ");
        int day = sc.nextInt();

        LocalDate birthDate = LocalDate.of(year, month, day);
        LocalDate currentDate = LocalDate.now();

        if ((birthDate != null) && (birthDate.isBefore(currentDate))) {
            Period age = Period.between(birthDate, currentDate);
            System.out.println("You are " + age.getYears() + " years, " +
                    age.getMonths() + " months, and " +
                    age.getDays() + " days old.");
        } else {
            System.out.println("Invalid birth date.");
        }
    }
}
