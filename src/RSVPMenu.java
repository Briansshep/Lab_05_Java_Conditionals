import java.util.Scanner;

public class RSVPMenu {
    public static void main(String[] args) {
        // Create scanner
        Scanner scanner = new Scanner(System.in);

        // Prompt user for choice of meal
        System.out.print("Enter your choice of meal (chicken, fish, or vegetarian): ");

        // Read the meal
        String meal = scanner.next();

        // If meal is chicken
        // Else, if meal is fish
        // Else, if meal is vegetarian
        if (meal.equalsIgnoreCase("chicken")) {
            System.out.println("You got the chicken parmesan.");
        } else if (meal.equalsIgnoreCase("fish")) {
            System.out.println("You got the roast salmon.");
        } else if (meal.equalsIgnoreCase("vegetarian")) {
            System.out.println("You got the butternut squash.");
        }
    }
}
