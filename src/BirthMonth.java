import java.util.Scanner;

public class BirthMonth {
    public static void main(String[] args) {
        // Create scanner
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for their birth month 1-12
        System.out.print("Please enter your birth month (1-12): ");

        // Read the month
        int month = scanner.nextInt();

        // If month is 1-12
        // Else, your birth month is: N
        if (month >= 1 && month <= 12) {
            System.out.print("Your birth month is: " + month);
        } else {System.out.print("You entered an invalid month: " + month);


    }
}
