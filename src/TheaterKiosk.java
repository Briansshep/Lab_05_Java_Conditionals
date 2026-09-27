import java.util.Scanner;

public class TheaterKiosk {
    public static void main(String[] args) {
        // Create scanner
        Scanner scanner = new Scanner(System.in);

        // Prompt user for age
        System.out.print("Enter your age: ");

        // Read age
        int age = scanner.nextInt();

        // If user is 21 or older, display wristbands
        // If under 21, do nothing
        if (age >= 21) {
            System.out.println("You get a wristband.");
        }
    }
}
