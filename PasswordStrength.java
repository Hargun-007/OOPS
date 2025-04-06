import java.util.Scanner;

public class PasswordStrengthChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String password = sc.nextLine();

        boolean hasUpper = false, hasLower = false, hasDigit = false, hasSpecial = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c))
                hasUpper = true;
            else if (Character.isLowerCase(c))
                hasLower = true;
            else if (Character.isDigit(c))
                hasDigit = true;
            else
                hasSpecial = true;
        }

        if (password.length() >= 8 && hasUpper && hasLower && hasDigit && hasSpecial) {
            System.out.println("Password is Strong");
        } else {
            System.out.println("Password is Weak. Make sure it has:");
            if (password.length() < 8)
                System.out.println("- Minimum 8 characters");
            if (!hasUpper)
                System.out.println("- At least one uppercase letter");
            if (!hasLower)
                System.out.println("- At least one lowercase letter");
            if (!hasDigit)
                System.out.println("- At least one digit");
            if (!hasSpecial)
                System.out.println("- At least one special character");
        }
    }
}
