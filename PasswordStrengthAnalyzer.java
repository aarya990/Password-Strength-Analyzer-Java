import java.util.Scanner;

public class PasswordStrengthAnalyzer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        int score = 0;

        if (password.length() >= 8) score++;
        if (password.matches(".*[A-Z].*")) score++;
        if (password.matches(".*[a-z].*")) score++;
        if (password.matches(".*[0-9].*")) score++;
        if (password.matches(".*[!@#$%^&*()].*")) score++;

        System.out.println("\nPassword Strength:");

        if (score <= 2)
            System.out.println("WEAK");
        else if (score <= 4)
            System.out.println("MEDIUM");
        else
            System.out.println("STRONG");

        sc.close();
    }
}
